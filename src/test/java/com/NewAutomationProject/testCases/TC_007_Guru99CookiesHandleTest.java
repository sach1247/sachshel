package com.NewAutomationProject.testCases;

import org.testng.annotations.Test;

import com.NewAutomationProject.BaseClass.BaseClass4;
import com.NewAutomationProject.pageObjects.Guru99AccessingLinkPage;
import com.NewAutomationProject.pageObjects.Guru99CookiesHandlePage;
import com.NewAutomationProject.pageObjects.Guru99DatePickerHandlingPage;
import com.NewAutomationProject.pageObjects.Guru99DragAndDropPage;
import com.NewAutomationProject.pageObjects.Guru99FileUploadPage;
import com.NewAutomationProject.pageObjects.Guru99LoginPage;
import com.NewAutomationProject.pageObjects.Guru99TableDemoPage;

import junit.framework.Assert;

public class TC_007_Guru99CookiesHandleTest extends BaseClass4 {

	public Guru99LoginPage p;
	public Guru99TableDemoPage t;
	public Guru99AccessingLinkPage l;
	public Guru99DragAndDropPage d;
	public Guru99DatePickerHandlingPage de;
	public Guru99FileUploadPage u;
	public Guru99CookiesHandlePage c;
	
	@Test(groups= {"regression"}, dependsOnMethods="fileUploadHandlingValidation", priority=7)
	public void CookiesHandleValidation()
	{
		p=new Guru99LoginPage(driver);
		t=new Guru99TableDemoPage(driver);
		l=new Guru99AccessingLinkPage(driver);
		d=new Guru99DragAndDropPage(driver);
		de=new Guru99DatePickerHandlingPage(driver);
		u=new Guru99FileUploadPage(driver);
		c=new Guru99CookiesHandlePage(driver);
		
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
	  
	  t.clickOnSeleniumDrp();
	  log.info("clicked on the selenium DropDown");
	  
	  u.clickOnFileUpload();
	  log.info("successfully clicked on the file upload links");
	  
	//  Thread.sleep(4000);
	  u.clickOnFileUploadBtn();
	  log.info("successfully upload the file");
	  
	  
	  
	  
	  
	  t.clickOnSeleniumDrp();
	  log.info("clicked on the selenium DropDown");
	  
	  c.scrolltheSubmitBtn();
	  log.info("successfully scroll the page upto sumbmit button");
	  
	  c.clickcookiesHandling();
	  log.info("successfully cliked on the cookies Demo link");
	  
	  c.enterUserC("Admin");
	  log.info("entered username successfully");
	  
	  c.eneterPassC("admin123");
	  log.info("password entered successfully");
	  
	  c.clickOnLogin();
	  log.info("successfully clicked on the login button of cookies");
	  
	  c.captureAllCookies();
	  log.info("got the cookies successfully");
	  
	  c.captureAllCookies();
	  log.info("successfully handled all the cookies from the browser");
	  
	  
	  
	  
	  
	  
	  
	}
}
