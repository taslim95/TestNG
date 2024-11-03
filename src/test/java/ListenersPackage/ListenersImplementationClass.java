package ListenersPackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;

public class ListenersImplementationClass implements ITestListener{

	ExtentReports report;
	ExtentTest test;
	String path=".\\Screenshot\\image.png";
	
	public void onTestStart(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		Reporter.log("Test started");
		test=report.createTest(methodName);
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test passed");
	}

	public void onTestFailure(ITestResult result) {
		TakesScreenshot ts=(TakesScreenshot)Demo.driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(path);
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(path);
		test.log(Status.FAIL, "Test Failed");
		
	}

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "Test Skipped");
	}

	public void onStart(ITestContext context) {
		ExtentSparkReporter reporter=new ExtentSparkReporter(".\\ExtentReports\\report.html");
		reporter.config().setDocumentTitle("Test Execution Report");
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setReportName("execution");
		
		report=new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("Browser", "Chrome");
		report.setSystemInfo("Test Engineer", "Taslim");
	}

	public void onFinish(ITestContext context) {
		report.flush();
	}

}
