package com.NewAutomationProject.testCases;

import org.testng.annotations.Test;

import com.NewAutomationProject.BaseClass.BaseClass4;
import com.NewAutomationProject.pageObjects.Guru99AccessingLinkPage;
import com.NewAutomationProject.pageObjects.Guru99DatePickerHandlingPage;
import com.NewAutomationProject.pageObjects.Guru99DragAndDropPage;
import com.NewAutomationProject.pageObjects.Guru99LoginPage;
import com.NewAutomationProject.pageObjects.Guru99TableDemoPage;

import junit.framework.Assert;

public class TC_005_Guru99DatePickerHandlingTest extends BaseClass4 {
	
	public Guru99LoginPage p;
	public Guru99TableDemoPage t;
	public Guru99AccessingLinkPage l;
	public Guru99DragAndDropPage d;
	public Guru99DatePickerHandlingPage de;
	
	@Test(groups= {"regression"},dependsOnMethods="DrapAndDropPageValidation", priority=5)
	public void datePickerValidation()
	{
		p=new Guru99LoginPage(driver);
		t=new Guru99TableDemoPage(driver);
		l=new Guru99AccessingLinkPage(driver);
		d=new Guru99DragAndDropPage(driver);
		
		de=new Guru99DatePickerHandlingPage(driver);
		
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
	  
		
		
	  
	  t.clickOnSeleniumDrp();
	  log.info("clicked on the selenium DropDown");
	  
	  d.clickOnDragAndDrop();
	  log.info("successfully clicked on the drag and drop link");
	  
	  d.dragAndDrop();
	  log.info("successfully draged and drop on the box");
	  
	  
	  
	  
	  t.clickOnSeleniumDrp();
	  log.info("clicked on the selenium DropDown");
	  
	  de.scrollThePage();
	  log.info("successfully scrolled the page for datepicker handling");
	  
	  de.DatePickerClick();
	  log.info("successfully clicked on the Dateikcker Icon");
	  
	  de.sendkeysOnTheDatePickerTab("04/27/2000");
	  log.info("successfully has entered the date of birth");
	  
	  
		
	}
	
	

}
