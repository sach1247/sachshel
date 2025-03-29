package com.NewAutomationProject.testCases;


import org.testng.annotations.Test;

import com.NewAutomationProject.BaseClass.BaseClass1;
import com.NewAutomationProject.pageObjects.OpencartLoginPage;
import com.NewAutomationProject.pageObjects.ProductDisplayPage;
import com.NewAutomationProject.pageObjects.ProductSearchPage;

import junit.framework.Assert;

public class TC_003_ProductDisplayTest extends BaseClass1 {
	
	public OpencartLoginPage lp;
	public ProductSearchPage ps;
	public ProductDisplayPage pd;
	
	
	@Test
	public void DisplayProduct() {
		
	
	
	lp=new OpencartLoginPage(driver);
	ps=new ProductSearchPage(driver);
	pd=new ProductDisplayPage(driver);
	

	lp.clickOnMyAccount();
	lp.clickOnLogin();
	
	lp.enterEmail("shelp@gmail.com");
	lp.enterPass("Pass@&1234");
	lp.LoginButton();
	
	
Assert.assertEquals(ps.myAccountText(), "My Account");	
	ps.searchItem("imac");
	ps.searchItemClickBox();
	
	pd.scrollUpToMacImg();
	pd.clickOnMac();
	
	
	
	
	

}
}