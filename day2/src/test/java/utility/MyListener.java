package utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class MyListener implements ITestListener {
	ExtentTest t;
	ExtentReports r;

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		r.endTest(t);
		r.flush();
		
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		//System.out.println("Test Started");
		r= new ExtentReports("C:\\Users\\PDC4-Training.PDC4\\eclipse-workspace\\day2\\src\\test\\java\\utility\\MyReport.html");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("Test Passed");
	}

	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("Test Failed");
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	

}
