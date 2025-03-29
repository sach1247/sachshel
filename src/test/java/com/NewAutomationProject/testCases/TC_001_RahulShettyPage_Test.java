package com.NewAutomationProject.testCases;

import org.testng.annotations.Test;

import com.NewAutomationProject.BaseClass.BaseClass5;
import com.NewAutomationProject.pageObjects.ShettyAutomationFirst_Page;

public class TC_001_RahulShettyPage_Test extends BaseClass5 {
	
	public ShettyAutomationFirst_Page hp;
	
	@Test()
public void rahulShettyPageValidationDemo()
{
	hp=new ShettyAutomationFirst_Page(driver);
	
	
	//hp.titleLogoDemo();
	//log.info("successfully checked the logo of the main page");
	 hp.radioBtnSelectDemo();
	 log.info("successfully checked that radio button is selcted or not on the webpage");
		
	hp.getTitle();
	log.info("successfully got the title of the webpage");
	
    hp.homeBtn();
    log.info("successfully handled the home button in order to is it enabled or disabled");
    
    hp.textDisplyDemo();
    log.info("successfully is handled that page is displaying or not");
    
   
	hp.radioBtnOperation();
	log.info("successfully has performed all the raddio button operations");
	
	hp.radioBtnSelect();
	log.info("successfully has selected the second radion button");
	
	hp.DrpHandling();
	log.info("successfully got the size of all the checkBoxes");
	 
	hp.checkBoxesSelection();
	log.info("successfully has selected the all the last two checkboxes");
	
	//hp.openTabDemo();
	//log.info("successfully has performed the clicked on the open tab functionality on the webpage");
	
	//hp.windowId();
	//log.info("successfully got the window ids of the webpages which are opened currently");
	
	//hp.closeBrowserDemo();
	//log.info("successfully has close the browser which was opened");
	
	hp.AlertBtnClick();
	log.info("successfully clicked on the alert");
	
	hp.alertHandleDemo();
	System.out.println("successfully handled the alert");
	
	hp.ScrollWebTableText();
	log.info("successfully has scrolled upto the webtable text");
	
	hp.webtableElementSizeDemo();
	log.info("successfully got the size of the WebTable");
	
	hp.WebTableEleText();
	log.info("successfully got the size of the Webtable");
	
	hp.specificDataWebT();
	log.info("successfully got the specific data from the webtable and printed it successfully");
	
	hp.webtableValueBelongsTo();
	log.info("successfully got the values which is belongs to the specific column value");
	
	hp.scrollMouseHoverText();
	log.info("successfully has scrolled uptp the text of mouse Hover");
	
	hp.MouseHandlingDemo();
	log.info("successfully has performed the mouse hover action using the actions class on the webpage");
	
	hp.getAllLinks();
	log.info("successfully got the total numbers of the links on the webtable");
	
	hp.linksTextDemo();
	log.info("successfully got the text of the links on the webpage");
	
	hp.cookiesTotalDemo();
	log.info("successfully got the cookies and its values which are on the webpage");
	
	hp.iframeHandlingDemo();
	log.info("successfully has switched into the frame");
	
	hp.ClickOnCourses();
	log.info("successfully clicked on the courses link on the webtable");
	
	
	
	

	
	//hp.frameMouseHoverDemo();
	//log.info("successfully handle the mouse hover in the iframe");
	
	//hp.scrollUptoWindowText();
	//wlog.info("scrolled the page from the bottom to up upto perticular elements");
	
	//hp.frameMouseHoverDemo();
	//log.info("successfully performed the mouse hover action in iframe of the Webpage");
	
	hp.checkBrokenLinks();
	log.info("successfully has checked the broken links on the webpage");
	
	hp.verifyLink(null);
	log.info("successfully has verified the broken links on the webpage");
	
	hp.scrollThePageDemo();
	log.info("successfully has scrolled the page till the bottom of it");
	
	
	hp.averageOfColumnDemo();
	log.info("successfully handled the last column and count the addition and the average of that");
	
	
	
	
	 
	
	
	
	
	
	
	
		
	
	
}
}
