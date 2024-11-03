package Demo;

import org.testng.annotations.Test;

public class Personal_loan {
	@Test(groups= {"SmokeTest"})
	void WebLoginPersonalLoan() {
		System.out.println("Web Login personal loan");
	}
	@Test
	void MobileLoginPersonalLoan() {
		System.out.println("Mobile Login personal loan");
	}
	@Test
	void APILoginPersonalLoan() {
		System.out.println("API Login personal loan");
	}
}
