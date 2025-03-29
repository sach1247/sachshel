package com.NewAutomationProject.testCases;

import org.testng.annotations.Test;

import com.NewAutomationProject.BaseClass.BaseClass3;
import com.NewAutomationProject.pageObjects.DemoQaMainButtons_Page;
import com.NewAutomationProject.pageObjects.DemoQaMainCheckBox_Page;
import com.NewAutomationProject.pageObjects.DemoQaMainDatePicker_Page;
import com.NewAutomationProject.pageObjects.DemoQaMainIframe_Alert_Window_Page;
import com.NewAutomationProject.pageObjects.DemoQaMainLinks_page;
import com.NewAutomationProject.pageObjects.DemoQaMainRadiobtn_Page;
import com.NewAutomationProject.pageObjects.DemoQaMainTextBox_Page;
import com.NewAutomationProject.pageObjects.DemoQaMainWebTable_Page;

public class TC_008_DemoQaMain_DatePicker_Test extends BaseClass3 {
	public DemoQaMainTextBox_Page textB;
	public DemoQaMainCheckBox_Page checkB;
	public DemoQaMainRadiobtn_Page radB;
	public DemoQaMainWebTable_Page webT;
	public DemoQaMainButtons_Page btn;
	public DemoQaMainLinks_page l;
	public DemoQaMainIframe_Alert_Window_Page AWP;
	public DemoQaMainDatePicker_Page dp;
	
	@Test
	public void datePickerPageValidation()
	{
		
textB=new DemoQaMainTextBox_Page(driver);
		
        checkB=new DemoQaMainCheckBox_Page(driver);
		
		radB=new DemoQaMainRadiobtn_Page(driver);
		
		webT=new DemoQaMainWebTable_Page(driver);
		
		btn=new DemoQaMainButtons_Page(driver);
		
		l=new DemoQaMainLinks_page(driver);
		
		AWP=new DemoQaMainIframe_Alert_Window_Page(driver);
		
		dp=new DemoQaMainDatePicker_Page(driver);
		
		
		textB.clickTextBoxDemo();
		log.info("clicked on the textbox btn successfully");
		
		textB.enterFullNameDemo("sachin");
		log.info("entered the full name ");
		
		textB.enterEmailDemo("sachshelpat@gmail.com");
		log.info("entered the email successfully");
		
		textB.enterAddressDemo("sambhajinagar");
		log.info("enterd the address successfully");
		
		textB.scrollPageDemo();
		log.info("scrolled the page successfully");
		
		textB.eneterPermanantAddDemo("sindkhed Raja");
		log.info("entered a permanent address");
		
		textB.clickOnSubmitDemo();
		log.info("clicked on the submit button successfully");  
		
		checkB.clickOnCheckBxDemo();
		log.info("clicked on checkbox successfully");
		
		checkB.clickOnDrpCheckBxDemo();
		log.info("clicked on drp checkbox ");
		
		checkB.checkboxSizeDemo();
		log.info("printed all the checkboxes over the webpage");
		
		checkB.clickOnFirstTwoCheckBxDemo();
		log.info("successfully selected the first two checkBoxes");
		
		radB.radioBtnSize();
		log.info("successfully got the size of the radio button");
		
		radB.clickOnRadBtn();
		log.info("successfully clicked on the radio button");
		
		webT.getAllTextWebTable();
		log.info("successfully got the text from the webtables");
		
		
		btn.clickOnBtns();
		log.info("successfully clicked on the buttons");
		
		btn.DoubleClick();
		log.info("successfully performed the double click");
		
		btn.RightClickBtn();
		log.info("clicked on the right click button");
		
		btn.scrollUptoRclick();
		log.info("scrolled successfully upto right click");
		
		btn.clickOption();
		log.info("successfully clicked on the click option");
		
		l.totalLinks();
		log.info("successfully got the links");  
		
		AWP.allDrpClick();
		log.info("clicked on all option Dropdown");
		
        AWP.scrollByStartAWP();
		log.info("successfully has been scrolled");
		
		AWP.alertClick();
		log.info("clicked on the alert icon");
		
		AWP.clickOnPromptAlert();
		log.info("successfully clicked on the prompt alert");
		
		AWP.clickOnPromptAlert();
		log.info("clicked on the alert and handled it");
		
//		dp.scrollPage();
//		log.info("successfully scroll the page");
		
		dp.clickOnDatePickerB();
		log.info("successfully clicked on the datepicker box");
		
		dp.yearSelect();
		log.info("year has been selected");
		
		dp.monthsSelect();
		log.info("month has been selected");
	}
	

}
