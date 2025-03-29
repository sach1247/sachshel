package com.NewAutomationProject.testCases;

import org.testng.annotations.Test;

import com.NewAutomationProject.BaseClass.BaseClass1;
import com.NewAutomationProject.pageObjects.OpencartLoginPage;
import com.NewAutomationProject.pageObjects.ProductSearchPage;

import junit.framework.Assert;


public class TC_002_ProductSearchTest2 extends BaseClass1 {
	
	public OpencartLoginPage lp;
	public ProductSearchPage ps;
	
	@Test
	public void productSearchPage() {
		
		lp=new OpencartLoginPage(driver);
		ps=new ProductSearchPage(driver);
		
		
		lp.clickOnMyAccount();
		lp.clickOnLogin();
		
		lp.enterEmail("shelp@gmail.com");
		lp.enterPass("Pass@&1234");
		lp.LoginButton();
		
		
	Assert.assertEquals(ps.myAccountText(), "My Account");	
		ps.searchItem("imac");
		ps.searchItemClickBox();
		
	}

}
