package Demo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
//ListenerDemo class is a test listener to monitor the events of test execution
public class ListenerDemo implements ITestListener  {
	//This Method invokes when the test class is instantiated and before executing
	public void onStart(ITestContext context) {
        System.out.println("OnStart method Started");	

	}
	//This Method invokes when all the test methods have run
	public void onFinish(ITestContext context) {
        System.out.println("OnFinish method Started");	

	}
	//invokes everytime a test method is called and executes
	public void onTestStart(ITestResult result) {
        System.out.println("New Test Started " +result.getName());	
	}
	//invokes everytime a test method is called and pasees or succeded
	public void onTestSuccess(ITestResult result) {
		
        System.out.println("on Test Success method " +result.getName());	
	}
//invokes everytime a test method is failed
	public void onTestFailure(ITestResult result) {
        System.out.println("on onTestFailure method " +result.getName());	
        //capture screenshot
        //log info
	}
	public void onTestSkipped(ITestResult result) {
        System.out.println("on onTestSkipped method " +result.getName());	
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("on onTestFailedButWithinSuccessPercentage method " +result.getName());	
	}

}
