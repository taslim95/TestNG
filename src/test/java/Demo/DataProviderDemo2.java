package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DataProviderDemo2 {
	WebDriver driver;
	@BeforeClass
	void setup() 
	{
		//open ChromeBrowser
		driver =new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//open url
		driver.get("https://www.saucedemo.com/v1/index.html");
	}
	/*@Test (priority =0)
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
	*/
	@AfterClass
	void tearDown()
	{
		driver.close();//Close Browser
	}
	@Test(dataProvider="userData")
	void verifyLogin(String username)
	{
		//find the username and password in the fields
		WebElement usernameField = driver.findElement(By.id("user-name"));
		WebElement passwordField = driver.findElement(By.id("password"));
		//Enter the login Credentials
		usernameField.sendKeys("");//example username
		usernameField.sendKeys("");//example password
		//Click the loginButton
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		//wait for the page to load after login
		//WebDriverWait wait=new WebDriverWait(driver,10);
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='bm-burger-button']")));
//click on menu button
		WebElement menuButton =driver.findElement(By.xpath("//div[@class='bm-burger-button']"));
		menuButton.click();
		//verify successful logout (optional)
		WebElement logoutButton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logout_sidebar-link")));
		logoutButton.click();
		//Verify Successful logout(optional)
		wait.until(ExpectedConditions.urlToBe("https://www.saucedemo.com/v1/index.html"));
		System.out.println("Successfully logged out");
	}
	@DataProvider(name="userData")
	public Object [][] dataProviderMethod()
	{
		return new Object[][]
				{{"standard_user"},{"locked_out_user"}};
	}
	
}
