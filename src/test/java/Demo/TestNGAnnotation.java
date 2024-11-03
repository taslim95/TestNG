package Demo;

import org.testng.annotations.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotation {
	@BeforeSuite
	void BeforeSuite(){
		 System.out.println("This is BeforeSuite Method");
		}
	@AfterSuite
	void AfterSuite() {
		 System.out.println("This is AfterSuite Method");
		}
	@BeforeTest
	void BeforeTest() {
		 System.out.println("This is BeforeTest Method");
		}
	@AfterTest
	void AfterTest() {
		 System.out.println("This is AfterTest Method");
		}
	@BeforeClass
	void BeforeClassMethod() {
		 System.out.println("This is BeforeClassMethod");
		}
	@BeforeMethod
	void setup() {
		 System.out.println("This is Before Method");

	}
@Test	 
void testMethod1() {
		 System.out.println("This is Test Method 1");
	 }
@Test	 
void testMethod2() {
		 System.out.println("This is Test Method 2");
	 }
@Test	 
void testMethod3() {
		 System.out.println("This is Test Method 3 ");
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
