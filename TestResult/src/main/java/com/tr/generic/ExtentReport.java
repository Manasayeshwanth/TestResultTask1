package com.tr.generic;

import org.testng.ITestListener;
import org.testng.ITestContext;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentReport extends Base implements ITestListener {
	public ExtentTest test;
	public ExtentReports report;


	public void onFinish(ITestContext result) {	

		report.flush();			

	}		


	public void onStart(ITestContext result) {					
		ExtentSparkReporter spark=new ExtentSparkReporter("./ExtentReport.html");
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("TestRessult");
		spark.config().setReportName("View TestRes");
		report=new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("platform", "windows");
		report.setSystemInfo("OS", "Windows 10");
		report.setSystemInfo("Environment", "Testing Environment");
		report.setSystemInfo("Reporter", "Manasa");

	}		


	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					


	}		
	

	public void onTestFailure(ITestResult result) {	

	} 			

	public void onTestSkipped(ITestResult result) {					

		test.log(Status.SKIP, result.getMethod().getMethodName()+" is skipped")	;
		test.log(Status.SKIP, result.getThrowable());
	}		


	public void onTestStart(ITestResult result) {					

		test=report.createTest(result.getMethod().getMethodName());		
	}		


	public void onTestSuccess(ITestResult result) {					

		test.log(Status.PASS, result.getMethod().getMethodName()+" is passed");		
	}

}


