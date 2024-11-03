package Demo;

import org.testng.annotations.Test;

public class PriorityDemo {
	@Test (enabled=false)
	public void ReadManual() {
		System.out.println("Read Manual Document");
	}
	@Test (enabled=false)
	public void PrepareDetails() {
		System.out.println("Prepare Documentation as per manual");
	}

	@Test (priority=4)
	public void CloseBrowser() {
		System.out.println("Close Browser");
	}
	@Test (priority=1)
	public void OpenBrowser() {
		System.out.println("Open Browser");
	}
	@Test (priority=2)
	public void OpenAccount() {
		System.out.println("Open Account");
	}
	@Test (priority=3)
	public void SaveAccount() {
		System.out.println("SAve Account");
	}

}
