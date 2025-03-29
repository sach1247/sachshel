package com.NewAutomationProject.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ProductDisplayPage {
	
	
WebDriver driver;
	
	public ProductDisplayPage(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		


}
	
	
//	@FindBy(xpath="//h5[text()='Information']")
//	WebElement scrollUpToText;
//	
	
	@FindBy(xpath="//*[@id=\"product-list\"]/div/form/div/div[1]/a/img")
	WebElement imacLink;
	
	
	
	
	
	public void scrollUpToMacImg() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		
	}
	public void clickOnMac() {
		
		imacLink.click();
	}
	
	
	
	
	
	
	
	
	
}
