package testNG;

import org.testng.ITestListener;
import org.testng.ITestResult;


public class Listners implements ITestListener {
	
	 @Override
	    public void onTestStart(ITestResult result) {
	        System.out.println("Test started with this name: " + result.getName());
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        System.out.println("Test passed: " + result.getName());
	        System.out.println("Successfully test case passed"+result.getName());
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	        System.out.println("Test failed: " + result.getName());
	        System.out.println("My test case is failed here"+result.getName());
	    }

}
