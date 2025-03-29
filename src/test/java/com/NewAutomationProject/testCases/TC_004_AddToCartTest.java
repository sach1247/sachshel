package com.NewAutomationProject.testCases;

import org.testng.annotations.Test;

import com.NewAutomationProject.BaseClass.BaseClass1;
import com.NewAutomationProject.pageObjects.AddToCartPage;
import com.NewAutomationProject.pageObjects.OpencartLoginPage;
import com.NewAutomationProject.pageObjects.ProductDisplayPage;
import com.NewAutomationProject.pageObjects.ProductSearchPage;

import junit.framework.Assert;

public class TC_004_AddToCartTest extends BaseClass1{
	
	public OpencartLoginPage lp;
	public ProductSearchPage ps;
	public ProductDisplayPage pd;
	public AddToCartPage ac;
	
	
	@Test
	public void addToCart() {
		
	
	
	lp=new OpencartLoginPage(driver);
	ps=new ProductSearchPage(driver);
	pd=new ProductDisplayPage(driver);
	ac=new AddToCartPage(driver);
	

	lp.clickOnMyAccount();
	lp.clickOnLogin();
	
	lp.enterEmail("shelp@gmail.com");
	lp.enterPass("Pass@&1234");
	lp.LoginButton();
	
	

String myAccountText=ps.myAccountText();
System.out.println("text of my account is:" +myAccountText);

	ps.searchItem("imac");
	ps.searchItemClickBox();
	
	pd.scrollUpToMacImg();
	pd.clickOnMac();
	
	
	
	
	String macImageText = ac.textOfMacImage();
    String priceText = ac.TextOfPrice();

    
    System.out.println("Text of Mac Image: " + macImageText);
    System.out.println("Price Text: " + priceText);

	

}
}

