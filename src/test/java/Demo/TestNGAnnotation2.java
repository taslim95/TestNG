package Demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotation2 {
	@BeforeClass
	void BeforeClassMethod() {
		 System.out.println("This is BeforeClassMethod");
		}
	@BeforeMethod
	void setup() {
		 System.out.println("This is Before Method");

	}
@Test	 
void testMethod4() {
		 System.out.println("This is Test Method 4");
	 }
@Test	 
void testMethod5() {
		 System.out.println("This is Test Method 5");
	 }

@AfterMethod
void tearDown() {
	 System.out.println("This is AfterMethod");

}
@AfterClass
void AfterClassMethod() {
	 System.out.println("This is AfterClassMethod");
	}

}
