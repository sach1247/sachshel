package com.NewAutomationProject.testCases;

import org.testng.annotations.Test;

import com.NewAutomationProject.BaseClass.BaseClass3;
import com.NewAutomationProject.pageObjects.DemoQA_Checkboxes_Page1;
import com.NewAutomationProject.pageObjects.DemoQA_TextBox_Page1;

public class TC_002_DemoQA_CheckBox_Test1 extends BaseClass3 {
	public DemoQA_TextBox_Page1 T;
	public DemoQA_Checkboxes_Page1 C;
	
	
	
	
	
	
	
	
	
	@Test
	public void CheckBoxesPageValidation() throws InterruptedException
	{
		
		T=new DemoQA_TextBox_Page1(driver);
		
		C=new DemoQA_Checkboxes_Page1(driver);
		
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
		
		
		T.perAddress("sindkhd raja Buldhana");
		log.info("successfully has entered the permanant address in the field");
			
		C.checkBoxOptionClick();
		log.info("successfully clicked on the checkboxes option icon on the webpage");
		
		C.checkBoxSizeDemo();
		log.info("successfully has got the size of the checkboxes");
		
		//C.scrollCheckPage();
		//log.info("successfully has scrolled the page to select the checkbox");
		
		C.lastTwoCheckBoxes();
		log.info("successfully has selected the last two checkboxes option");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
