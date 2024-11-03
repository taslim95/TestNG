package Demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase {
	@Test
public void TestMethod_1() {
	System.out.println("This is TestMEthod_1");
}	@Test
public void TestMethod_2() {
	System.out.println("This is TestMEthod_2");
	Assert.assertEquals(true,true);
}
@Test
public void TestMethod_3() {
	System.out.println("This is TestMEthod_3");
	Assert.assertEquals(1, 1);
}
}
