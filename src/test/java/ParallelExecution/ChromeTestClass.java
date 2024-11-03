package ParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeTestClass {
	WebDriver driver;
	@Test
	public void chromeTest() {
		//System.out.println("This is Crome browser Test");
		System.out.println("This is Chrome browser Test on thread ID" + Thread.currentThread().getId());

		//open Browser
		driver=new ChromeDriver();
		//open ur
		driver.get("https://www.google.com/");
		//print webPage Title
System.out.println("web page title is "+ driver.getTitle());	
//close browser
driver.quit();
	}

}
