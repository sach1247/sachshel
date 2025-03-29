package com.NewAutomationProject.testCases;

import org.testng.annotations.Test;

import com.NewAutomationProject.BaseClass.BaseClass5;
import com.NewAutomationProject.pageObjects.OmayoSingleMain_Page;

public class TC_001_OmayoSingleMain_Test extends BaseClass5 {
	
	public OmayoSingleMain_Page p ;
	
	@Test(groups={"regression"})
	public void omayoMainPageValidation() 
	{
		
		p=new OmayoSingleMain_Page(driver);
		
		
		// to select the dropdown option from the page
		p.drpOptionSelectiomn("Hyundaix");
		log.info("successfully selected the dropdown option id Hyundaix");
		
		p.getAllLinks();
		log.info("successfully got the all links from the webpage ");
		
		p.clearText();
		log.info("successfully cleared the text which are in text box");
		
		p.disabledButtonCheck();
		log.info("successfully validated the disabled button");
		
		p.scrollUptEnabledButton();
		log.info("successfully has scrolled upto the enabled button");
		
		p.radBtnHandlingDemo();
		log.info("successfully selected the second radio button from the webpage");
		
		p.alertHandlingDemo();
		log.info("successfully handled the alerts using alert class");
		
		p.checkHandlingDemo();
		log.info("successfully handled the checkboxes");
		
		p.promptAlertDemo();
		log.info("successfully handled the prompt alert");
		
		p.windOpenDemo();
		log.info("window has opened");
		
		//p.closeWin();
		//log.info("window has been closed successfully");
		
		p.tableEle();
		log.info("successfully counted the elements and printed all ");
		
		p.cityFromWebTableDemo();
		log.info("successfully has fetched the pune city name from the webtable");
		
		
		p.loginUserPassDemo("user", "pass");
		log.info("successfully entered username and password in the field");
		//p.loginPassDemo("sachshel12");
		//log.info("successfully entered password in the field");
		
		p.clickLoginBtnDemo();
		log.info("successfully clicked on the login button of login page");
		
		p.scrollUpToLoginBtn();
		log.info("successfully scrolled upto login button");
		
		p.scrollUptoClickAfterTextDissappearsBtn();
		log.info("successfully scrolled upto frame which we are going to handle");
		
		//p.frameSwitchDemoAndClicked();
		//log.info("successfully has switched into the frame");
		
		//p.frameElementClick();
		//log.info("successfully clicked on the frame element")
		
		p.doubleClickDemo();
		log.info("successfully has double clicked");
		
	//	p.alertDoubleClick();
	  //  log.info("successfully handled the alert of the double click");
		
		p.checThisBtnDemo();
		log.info("successfully has checked button is enabled");
		
		p.windowHandleDemo();
		log.info("successfully handled the windows and closed the windwo which is initiated by the driver instance");
		
		p.newWindow();
		log.info("successfully handled the new window");
		
		
		
		
	    
	    
	}
	
	
  
}
