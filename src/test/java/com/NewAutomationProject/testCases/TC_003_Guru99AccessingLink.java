package com.NewAutomationProject.testCases;

import org.testng.annotations.Test;

import com.NewAutomationProject.BaseClass.BaseClass4;
import com.NewAutomationProject.pageObjects.Guru99AccessingLinkPage;
import com.NewAutomationProject.pageObjects.Guru99LoginPage;
import com.NewAutomationProject.pageObjects.Guru99TableDemoPage;

import junit.framework.Assert;

public class TC_003_Guru99AccessingLink extends BaseClass4 {
	
	
	public Guru99LoginPage p;
	public Guru99TableDemoPage t;
	public Guru99AccessingLinkPage l;
	
	@Test(groups= {"regression"},dependsOnMethods="TableTestPageValidation", priority=3)
	public void guru99AccessingLinkValidation()
	{
		
		p=new Guru99LoginPage(driver);
		t=new Guru99TableDemoPage(driver);
		l=new Guru99AccessingLinkPage(driver);
		
		
		p.enterEmail("sachshelpat@gmail.com");
		log.info("successfully entered email address");
		
		p.clickOnSubmitBtn();
		
		log.info("clicked on submit button and navigate to the Dashboard page");
		
	  Assert.assertEquals(p.verifyDashboardPage(), "Guru99 Bank");
	 Assert.assertTrue(true);
	  
	  log.info("assertion condition is true");
	  
	  t.clickOnSeleniumDrp();
	  log.info("clicked on the selenium DropDown");
	  
	  t.clickOnTableDemo();
	  log.info("successfully clicked on the Table Demo");
	  
	  t.tableSizeCount();
	  log.info("table size got successfully");
	  
	  t.printSecondRowData();
	  log.info("got the second row data successfully");
	  
	  t.printSecondRowData();
	  log.info("got the sum,average successfully ");
	  
	  t.clickOnSeleniumDrp();
	  log.info("clicked on the selenium DropDown");
	  
	  l.clickOnAccessingLink();
	  log.info("clicked on the accessing the link");
	  
	  l.getAllTheLinks(); 
	  log.info("got all the links from the WebPage");
	  
		
		
		
		
		
		
		
	}

}
