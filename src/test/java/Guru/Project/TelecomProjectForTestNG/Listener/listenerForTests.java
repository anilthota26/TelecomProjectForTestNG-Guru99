package Guru.Project.TelecomProjectForTestNG.Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Guru.Project.TelecomProjectForTestNG.TelecomBase;

public class listenerForTests extends TelecomBase implements ITestListener {
	
//Logger log=Logger.getLogger(listenerForTests.class);


	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getMethod().getMethodName()+"_TestCase is Srarted");
		log.info("***************************"+result.getMethod().getMethodName()+ "is_Started*************************");
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getMethod().getMethodName()+"_is Passed");
		log.info("***************************"+result.getMethod().getMethodName()+ "_is Passed*************************");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(result.getMethod().getMethodName()+"_is Failed");
		log.info("***************************"+result.getMethod().getMethodName()+ "_is Failed*************************");
//		FailedTestcases(result.getMethod().getMethodName());
			
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		log.info("***************************"+result.getMethod().getMethodName()+ "is skipped*************************");
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
