package com.NewAutomationProject.testCases;

import org.testng.annotations.Test;

import com.NewAutomationProject.BaseClass.BaseClass1;
import com.NewAutomationProject.pageObjects.OpencartLoginPage;

@Test
public class TC_001_OpencartLoginTest extends BaseClass1 {
	
	public OpencartLoginPage lp;
	
	public void opencartLoginPageDemo() {
		
		lp=new OpencartLoginPage(driver);
		
		lp.clickOnMyAccount();
		lp.clickOnLogin();
		lp.enterEmail("shelp@gmail.com");
		lp.enterPass("Pass@&1234");
		lp.LoginButton();
		
		
	}

	
}
