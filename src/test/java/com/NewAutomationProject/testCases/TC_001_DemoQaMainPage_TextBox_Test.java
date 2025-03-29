package com.NewAutomationProject.testCases;

import org.testng.annotations.Test;

import com.NewAutomationProject.BaseClass.BaseClass3;
import com.NewAutomationProject.pageObjects.DemoQaMainTextBox_Page;

public class TC_001_DemoQaMainPage_TextBox_Test extends BaseClass3 {
	
	public DemoQaMainTextBox_Page textB;
	
	
	@Test
	public void textBoxPageValidation()
	{
		
		textB=new DemoQaMainTextBox_Page(driver);
		
		textB.clickTextBoxDemo();
		log.info("clicked on the textbox btn successfully");
		
		textB.enterFullNameDemo("sachin");
		log.info("entered the full name");
		
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
		
		
	}

}
