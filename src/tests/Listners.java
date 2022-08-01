package tests;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners implements ITestListener {
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("succed");
	}
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("fail"+result.getName());
	}

}
