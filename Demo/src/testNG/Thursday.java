package testNG;

import org.testng.annotations.Test;

public class Thursday {
	@Test(dependsOnMethods= {"Day6"})
	public void eat() {
		System.out.println("Second");
	}
	@Test
	public void Day6() {
		System.out.println("First");
	}
	@Test(dependsOnMethods= {"eat"})
	public void Saturday(){
		System.out.println("Third");
	
	}
	@Test
	public void Sunday() {
		System.out.println("I am the second last last");
	}
	@Test
	public void Monday() {
		System.out.println("I am third last");
	}
	@Test(dependsOnMethods= {"Sunday","Monday"})// we can two dependency in the same test case
	public void Tuesday() {
		System.out.println("Final");
	}
	@Test(enabled=false)// Skip the test cases
	public void January() {
		System.out.println("Test");
	}
	
	
	
}
