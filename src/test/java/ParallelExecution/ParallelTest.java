package ParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTest {
	WebDriver driver;
	@Test
	public void chromeTest() {
		System.out.println("This is Crome browser Test");
		//open Browser
		driver=new ChromeDriver();
		//open ur
		driver.get("https://www.google.com/");
		//print webPage Title
System.out.println("web page title is "+ driver.getTitle());	
//close browser
driver.quit();
	}

@Test
public void FireFox() {
	System.out.println("This is Firefox browser Test");
	//open firefox Browser
	driver=new FirefoxDriver();
	//open ur
	driver.get("https://www.google.com/");
	//print webPage Title
System.out.println("web page title is "+ driver.getTitle());	
//close browser
driver.quit();

	}

}
