package ParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFoxTestClass {
	WebDriver driver;
	@Test
	public void FireFox() {
		//System.out.println("This is Firefox browser Test");
		System.out.println("This is FireFox browser Test on thread ID" + Thread.currentThread().getId());

		//open firefox Browser
		driver=new FirefoxDriver();
		//open url
		driver.get("https://www.google.com/");
		//print webPage Title
		System.out.println("web page title is "+ driver.getTitle());	
		//close browser
		driver.quit();

	}


}
