package org.automation.generic_utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class MyListener  extends BaseTest implements ITestListener
{
	
	@Override
	public void onStart(ITestContext context)
	{
		Reporter.log("<test> -- "+context.getName()+" Started", true);
	}
	
	
	@Override
	public void onFinish(ITestContext context)
	{
		Reporter.log("<test> -- "+context.getName()+" Finished",true);
	}
	
	
	
	@Override
	public void onTestStart(ITestResult result)
	{
	 	Reporter.log("TestCase -- " + result.getName()+"Start" , true);
	}

	
	
	@Override
	public void onTestSuccess(ITestResult  result)
	{
		Reporter.log("TestCase -- " + result.getName()+"Success" , true);
	}
	
	
		@Override
	public void  onTestSkipped(ITestResult result)
	{
		Reporter.log("TestCase -- " + result.getName()+"Skip" , true);
	}
		
		
		@Override
		public void  onTestFailure(ITestResult result)
		{
			Reporter.log("TestCase -- "+ result.getName()+"Failure" , true);
		}
	
}
