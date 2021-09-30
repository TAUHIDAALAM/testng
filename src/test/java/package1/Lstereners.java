package package1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Lstereners implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("successfully bypassed");

	}

	public void onTestFailure(ITestResult result) {
		System.out.println("successfully failed");
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

}
