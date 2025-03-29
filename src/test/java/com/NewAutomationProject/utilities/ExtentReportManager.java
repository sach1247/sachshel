package com.NewAutomationProject.utilities;

import java.awt.Desktop;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import com.NewAutomationProject.BaseClass.BaseClass2;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {

	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	
	
	
	String reportName;
	
	public void onStart(ITestContext testContext)
	{
		
		String timeStamp =new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		reportName="Test-Report-"+timeStamp+".html";
		sparkReporter =new ExtentSparkReporter(".\\Reports\\"+reportName);
		
		sparkReporter.config().setDocumentTitle("Automation Report");  //title of report
		sparkReporter.config().setReportName("Functional Testing");    // name of the report
		sparkReporter.config().setTheme(Theme.DARK);
		
		
		extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
		extent.setSystemInfo("Application","RahulShettyAcademyPracticePage");
		extent.setSystemInfo("Module","AllModules");
		extent.setSystemInfo("Sub Modue","Customers");
		extent.setSystemInfo("UserName","Sachin");
		extent.setSystemInfo("Environment","QA");
		
		String os=testContext.getCurrentXmlTest().getParameter("os");
		extent.setSystemInfo("Operating System", os);
		
		String browser=testContext.getCurrentXmlTest().getParameter("browser");
		extent.setSystemInfo("Browser", browser);
			
		List<String> includeGroups=testContext.getCurrentXmlTest().getIncludedGroups();
		if(!includeGroups.isEmpty())
		{
			extent.setSystemInfo("Groups", includeGroups.toString());
		}
		
	}
	
	
	public void onTestSuccess(ITestResult result)
	{
		test=extent.createTest(result.getTestClass().getName());
		test.assignCategory(result.getMethod().getGroups());      //to display groups in reports
		test.log(Status.PASS,result.getName()+" "+"got successfully executed");
	}
	
	public void onTestFailure(ITestResult result)
	{
		test=extent.createTest(result.getTestClass().getName());
		test.assignCategory(result.getMethod().getGroups());
		
		test.log(Status.FAIL,result.getName()+" "+"got Failed...");
		test.log(Status.INFO,result.getThrowable().getMessage());
		
		try
		{
		BaseClass2 bs=new BaseClass2();
		String imgpath=bs.captureScreenshot(result.getName());
		test.addScreenCaptureFromPath(imgpath);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public void onTestSkipped(ITestResult result)
	{
		test=extent.createTest(result.getTestClass().getName());
		test.assignCategory(result.getMethod().getGroups());
		test.log(Status.SKIP,result.getName()+"got skipped...");
		test.log(Status.INFO,result.getThrowable().getMessage());
	}
	
	public void onFinish(ITestContext testContext)
	{
		extent.flush();
		
		String pathOfExtentReport=System.getProperty("user.dir")+".\\Reports\\"+reportName;
		File extentReport=new File(pathOfExtentReport);
		
		
		try
		{
			Desktop.getDesktop().browse(extentReport.toURI());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	
}

	
	
	
	
	
	


