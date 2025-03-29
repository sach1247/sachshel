package com.NewAutomationProject.testCases;

import org.testng.annotations.Test;

import com.NewAutomationProject.BaseClass.BaseClass2;
import com.NewAutomationProject.pageObjects.RahulShettyHomePage;

public class TC_001_RahulShettyHomeTest extends BaseClass2 {
	public RahulShettyHomePage lp;
	
	@Test()
	public void rahulShettyPageValidation()
	
	{
		lp=new RahulShettyHomePage(driver);
		
		lp.totalRadBtn();
		log.info("captured the total radio button size ");
		
		
		lp.selectDrp();
		log.info("selected the dropDown");
		
		lp.selectSuggetion("India");
		log.info("selected the dropDown option from the dropDown");
		
		lp.selectDrpOption();
		log.info("selected the dropDown option");
		
		lp.clickOnCheckBoxes();
		log.info("clicked on the checkBoxes");
		
		lp.alertDemo();
		log.info("handled an alert successfully");
		
		lp.clickOnWindow();
		log.info("Handled and click on the window");
		//lp.closeSingleWindow();
		
	//	lp.clickOnMouseBtn();
		
		lp.MoveUptotext();
		log.info("moved upto the text using javascript executor class");
		
		lp.MouseHoverAction();
		log.info("Handled the mouse hover action");
		
		lp.webTableContent();
		log.info("captured and print all the content from the webtable");
		
		lp.webtableSingleData();	
		log.info("got the single specific data from the webtable");
	
		lp.thirdColumnData();
		log.info("printed the third column data size");
		
		lp.thirdColumnData();
		log.info("successfully got the text which are in the third webtable");
		
	}
	

}
