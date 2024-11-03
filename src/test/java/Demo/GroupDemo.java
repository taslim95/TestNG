package Demo;

import org.testng.annotations.Test;

public class GroupDemo {

@Test(groups= {"Sanity"})
	void test1() {
		System.out.println("This is Test 1");
			}
@Test(groups= {"Sanity"})
void test2() {
	System.out.println("This is Test 2");
		}
@Test(groups= {"Regression"})
void test3() {
	System.out.println("This is Test 3");
		}
@Test(groups= {"Sanity","Regression"})
void test4() {
	System.out.println("This is Test 4");
}
@Test(groups= {"Regression"})
	void test5() {
		System.out.println("This is Test 5");
			}
@Test//does not belongs to any associated groups...hence,,will not be executed
void test6() {
	System.out.println("This is Test 6");
		}
		}

