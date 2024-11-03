package Demo;

import org.testng.annotations.Test;

public class Car_Loan {
	@Test(groups= {"SmokeTest"})
	void WebLoginCaroan() {
		System.out.println("Web Login Car loan");
	}
	@Test
	void MobileLoginCarLoan() {
		System.out.println("Mobile Login Car loan");
	}
	@Test
	void APILoginCarLoan() {
		System.out.println("API Login Car loan");
	}


}
