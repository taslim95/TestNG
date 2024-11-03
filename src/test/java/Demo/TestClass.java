package Demo;

import org.testng.annotations.Listeners;
import org.testng.Assert;
import org.testng.annotations.*;

//@Listeners(ListenerDemo.class)

public class TestClass {
	@Test
	public void TestMethod1()
	{
		System.out.println("Executing TestMethod1");
			}
	@Test
	public void TestMethod2()
	{
		System.out.println("Executing TestMethod-2");
			}
	@Test
	public void TestMethod3()
	{
		System.out.println("Executing TestMethod--3");
		Assert.assertTrue(false);
			}
}
