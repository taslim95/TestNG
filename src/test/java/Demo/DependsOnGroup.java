package Demo;

import org.testng.annotations.Test;

public class DependsOnGroup {
	@Test(dependsOnGroups= {"sanity"})
	public void testMethod() {
		
	}
	@Test(groups = {"sanity"})
public void groupTestOne() {
	System.out.println("Group test One Executed");
}
	@Test(groups = {"sanity"})
	public void groupTestTwo() {
		System.out.println("Group test Two Executed");
	}
	@Test(groups = {"sanity"})
	public void groupTestThree() {
		System.out.println("Group test Three Executed");
	}
	
}
