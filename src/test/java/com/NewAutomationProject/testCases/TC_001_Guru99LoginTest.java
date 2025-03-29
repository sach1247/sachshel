package com.NewAutomationProject.testCases;

import org.testng.annotations.Test;

import com.NewAutomationProject.BaseClass.BaseClass4;
import com.NewAutomationProject.pageObjects.AddToCartPage;
import com.NewAutomationProject.pageObjects.Guru99LoginPage;

import junit.framework.Assert;


public class TC_001_Guru99LoginTest extends BaseClass4 {
	
	public Guru99LoginPage p;
	
	 @Test(dataProvider = "loginData", groups= {"regression"}, priority=1)
	public void guru99LoginPageValidation(String email)
	{
		
		p=new Guru99LoginPage(driver);
		
		p.enterEmail("sachshelpat@gmail.com");
		log.info("successfully entered email address");
		
		p.clickOnSubmitBtn();
		
		log.info("clicked on submit button and navigate to the Dashboard page");
		
	  Assert.assertEquals(p.verifyDashboardPage(), "Guru99 Bank");
	 Assert.assertTrue(true);
	  
	  log.info("assertion condition is true");
		
	
	}

}
