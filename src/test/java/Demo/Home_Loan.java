package Demo;

import org.testng.annotations.Test;

public class Home_Loan {
	@Test(groups= {"SmokeTest"})
	void WebLoginHomeLoan() {
		System.out.println("Web Login Home loan");
	}
	@Test
	void MobileLoginHomeLoan() {
		System.out.println("Mobile Login Home loan");
	}
	@Test
	void APILoginHomeLoan() {
		System.out.println("API Login Home loan");
	}

}
