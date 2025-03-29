package com.NewAutomationProject.testCases;

import org.testng.annotations.Test;

import com.NewAutomationProject.BaseClass.BaseClass3;
import com.NewAutomationProject.pageObjects.DemoQA_TextBox_Page1;

public class TC_001_DemoQA_TextBox_Test1 extends BaseClass3 {
	
	
	
	public DemoQA_TextBox_Page1 T;
	
	@Test
	public void TextboxPageValidation()
	{
		
	T=new DemoQA_TextBox_Page1(driver);
	
	T.clickTextBox();
	log.info("successfully has clicked on the textbox");
	
	T.enterTextName("sachin ramdas shellke");
	log.info("successfully has entered the name into the text field");
	
	T.enterEmail("sachshelpat@gmail.com");
	log.info("successfully entered the email on the field");
	
	T.addressText("chh. sambhajinagar");
	log.info("successfully has entered the address in the address field");
	
	T.scrollThePage();
	log.info("successfully has scrolled the page");
	
	T.perAddress("successfully has entered the permant address the in the field");
	log.info("successfully has entered the permanant address in the field");
		
		
	}
	

}
