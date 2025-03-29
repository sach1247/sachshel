package com.NewAutomationProject.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductSearchPage {
	
WebDriver driver;
	
	public ProductSearchPage(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		

}
	
	@FindBy(xpath="//h2[text()='My Account']")
	WebElement accountText;
	
	@FindBy(xpath="//input[@name='search']")
	WebElement enterSearch;
	
	
	@FindBy(xpath="//div[@id='search']/button")
	WebElement searchItemClick;
	
	
	
	
	
	
	
	
	
	public String myAccountText() {
		String myAccount=accountText.getText();
		return myAccount;
		
	}
	
	
	public void searchItem(String item) {
		
		enterSearch.sendKeys(item);
		
		
		
	}
	
	public void searchItemClickBox() {
		
		searchItemClick.click();
	}
	
	
	
}