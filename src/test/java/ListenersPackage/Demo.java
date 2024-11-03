package ListenersPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersPackage.ListenersImplementationClass.class)
public class Demo {

	public static WebDriver driver;
	@Test
	public void test()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Assert.fail();
	}
}
