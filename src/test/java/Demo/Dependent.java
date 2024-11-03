package Demo;

import org.testng.annotations.Test;

public class Dependent {
	@Test (dependsOnMethods= {"OpenBrowser"})
	public void SignIn() 
	{
		System.out.println("SignIn Method Executed");		
	}
	@Test
	public void OpenBrowser() 
	{
		System.out.println("OpenBrowser Method Executed");		
	}
	@Test (dependsOnMethods= {"SignIn","OpenBrowser"})
	public void Logout() //Depends on two different methods or test ..here
	{
		System.out.println("Logout Method Executed");		
	}

}
