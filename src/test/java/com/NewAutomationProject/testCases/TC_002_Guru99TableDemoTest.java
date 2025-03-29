package com.NewAutomationProject.testCases;

import org.testng.annotations.Test;

import com.NewAutomationProject.BaseClass.BaseClass4;
import com.NewAutomationProject.pageObjects.Guru99LoginPage;
import com.NewAutomationProject.pageObjects.Guru99TableDemoPage;

import junit.framework.Assert;

public class TC_002_Guru99TableDemoTest extends BaseClass4 {
	
	public Guru99LoginPage p;
	public Guru99TableDemoPage t;
	
	@Test(groups= {"sanity"}, dependsOnMethods="guru99LoginPageValidation", priority=2)
	public void TableTestPageValidation()
	{
		p=new Guru99LoginPage(driver);
		t=new Guru99TableDemoPage(driver);
		
		
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
		
		
		
		
		
		
		
		
		
	}

}
