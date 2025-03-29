package com.NewAutomationProject.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.NewAutomationProject.BaseClass.BaseClass4;
import com.NewAutomationProject.BaseClass.BaseClass5;
import com.NewAutomationProject.pageObjects.OrangeHrmLiveDemo_Page;

public class TC_001_OrangeHrmLiveDemo_Page_Test extends BaseClass4 {
	

	public OrangeHrmLiveDemo_Page l;
	
	WebDriver wait;
	
	@Test(dataProvider = "loginData")
	public void loginPageValidation(String username, String password)
	{
		
	
		l=new OrangeHrmLiveDemo_Page(driver);
		
		
		
		l.enterCredentials(username, password);
		
		log.info("successfully has Entered the username and password");
		
		l.LoginBtn();
		log.info("successfully is clicked on the login button");
		
	
	}
	
	
	
	
}
