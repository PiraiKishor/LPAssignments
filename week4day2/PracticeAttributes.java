package homeassignments.week4day2;

import org.testng.annotations.Test;

public class PracticeAttributes {
	@Test(priority=-6)
	public void Test1() {
		System.out.println("This is Test case 1");
	}
	@Test(priority=-3,invocationCount=2)
	public void Test2() {
		System.out.println("This is Test case 2");
	}
	@Test(priority=-5,dependsOnMethods ="Test1" )
	public void Test3() {
		System.out.println("This is Test case 3");
	}
	@Test(enabled=false)
	public void Test4() {
		System.out.println("This is Test case 4");
	}
	@Test(threadPoolSize = 2)
	public void Test5() {
		System.out.println("This is Test case 5");
	}

}
