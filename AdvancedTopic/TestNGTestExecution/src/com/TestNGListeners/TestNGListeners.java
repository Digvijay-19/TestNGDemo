package com.TestNGListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {

	
	@Override
	public void onFinish(ITestContext result) {
	

		
	}

	@Override
	public void onStart(ITestContext result) {
	
		System.out.println("Test Execution Started And Test Case Details are " +result.getName());

		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		System.out.println("Test Execution SuccessPercentage And Test Case Details are " +result.getName());

	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test Execution Failure And Test Case Details are " +result.getName());

		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Test Execution Skipped And Test Case Details are " +result.getName());

		
	}

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Test Execution OnTestStart And Test Case Details are " +result.getName());

		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test Execution OnTestSuccess And Test Case Details are " +result.getName());
		
	}

}
