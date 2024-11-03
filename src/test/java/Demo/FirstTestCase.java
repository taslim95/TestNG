package Demo;

import org.testng.annotations.Test;

//manual testing
//TestSuite (package)
//---TestCases (Classes)
//---TestSteps (Test Methods @Test)
public class FirstTestCase {
	@Test(priority=1)
 void setup() 
{//Test steps for Setup
	 System.out.println("This is demo Setup method");
}
	@Test(priority=2)
	void login()
	{
		//Test steps for login
		 System.out.println("This is demo login method");
	}
	@Test(priority=3)
	void close()
	{
		//Test steps for close
		 System.out.println("This is demo close method");
	}
	
}
