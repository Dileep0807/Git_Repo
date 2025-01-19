package Listerners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersMethod extends Base implements ITestListener {
	
	    @Override
	    public void onTestStart(ITestResult result) {
	        // Code to execute when a test starts
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        // Code to execute when a test passes
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	       
	    	System.out.print("Failed Test Cases:");
	    	failed(result.getMethod().getMethodName());
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	        // Code to execute when a test is skipped
	    }

	    @Override
	    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	        // Code to execute when a test fails but within success percentage
	    }

	    @Override
	    public void onStart(ITestContext context) {
	        // Code to execute before any test method starts in the context
	    }

	    @Override
	    public void onFinish(ITestContext context) {
	        // Code to execute after all the test methods have finished
	    }

}
