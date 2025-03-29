package com.NewAutomationProject.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	
WebDriver driver;
	
	public AddToCartPage(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);

}
	
	
	
	@FindBy(xpath="//h1[text()='iMac']")
	WebElement imacText;
	
	@FindBy(xpath="//div[@class='container']//ul//span[text()='$100.00']")
	WebElement priceText;
	
	
	
	public String textOfMacImage() {
		String T=imacText.getText();
		return T;
	}
	
	public String TextOfPrice() {
		
	String T1=priceText.getText();
	return T1;
	}
	
}
