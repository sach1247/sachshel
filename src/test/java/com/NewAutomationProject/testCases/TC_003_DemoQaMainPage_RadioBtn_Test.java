package com.NewAutomationProject.testCases;

import org.testng.annotations.Test;

import com.NewAutomationProject.BaseClass.BaseClass3;
import com.NewAutomationProject.pageObjects.DemoQaMainCheckBox_Page;
import com.NewAutomationProject.pageObjects.DemoQaMainRadiobtn_Page;
import com.NewAutomationProject.pageObjects.DemoQaMainTextBox_Page;

public class TC_003_DemoQaMainPage_RadioBtn_Test extends BaseClass3 {
	
	public DemoQaMainTextBox_Page textB;
	public DemoQaMainCheckBox_Page checkB;
	public DemoQaMainRadiobtn_Page radB;
	

	
	
	@Test
	public void radioBtnValidationPage()
	{
		
		textB=new DemoQaMainTextBox_Page(driver);
		
		checkB=new DemoQaMainCheckBox_Page(driver);
		
		radB=new DemoQaMainRadiobtn_Page(driver);
		
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
		
	}
}
