package Demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo {
	@Test
	@Parameters({"a","b"})
	public void add(int num1, int num2)//test method ...here we have used two different parameters
	{
		int result =num1+num2;
		System.out.println("sum of two nembers  " +result);
	}

}
