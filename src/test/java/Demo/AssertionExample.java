package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionExample {
	WebDriver driver;
	@BeforeClass
	void setup() 
	{
		//open ChromeBrowser
		driver =new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//open url
		driver.get("https://www.google.com/");
	}
	@Test (priority =0)
	void VerifyPageTitle() {
		String ExpectedPageTitle = "Google" ;
		String ActualPageTitle = driver.getTitle();
		Assert.assertEquals(ActualPageTitle, ExpectedPageTitle ,"Title is not matching");
	}
	@Test (priority =1)
	void verifyGoogleImage()
	{
		WebElement image =driver.findElement(By.xpath("//img[@alt='Google']"));
		Assert.assertTrue(image.isDisplayed(), "Google image is not Displayed");//
		//Assert.assertFalse(image.isDisplayed(), "Google image is Displayed");//verify image shall not be displayed
	}
	@AfterClass
	void tearDown()
	{
		driver.close();//Close Browser
	}
	

}
