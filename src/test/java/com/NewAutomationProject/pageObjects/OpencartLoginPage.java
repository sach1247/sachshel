package com.NewAutomationProject.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpencartLoginPage {
	
	//constructor
		WebDriver driver;
		public OpencartLoginPage (WebDriver driver) {
			this.driver=driver;
			
			PageFactory.initElements(driver, this);
			
			
			

}
		
		@FindBy(xpath="//span[text()='My Account']")
		WebElement MyAcBtn;
		
		@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right show']//li//a[text()='Login']")
		WebElement loginOption;
		
		@FindBy(xpath="//input[@name='email']")
		WebElement enterEmailId;
		
		@FindBy(xpath="//input[@id='input-password']")
		WebElement enterPass;
		
		@FindBy(xpath="//button[text()='Login']")
		WebElement clickLoginBtn;
		
		
		
		
		
		
		
		
		public void clickOnMyAccount() {
			MyAcBtn.click();
			
		}
		
		public void clickOnLogin() {
			loginOption.click();
			
		}
		
		public void enterEmail(String email) {
			enterEmailId.sendKeys(email);
		}
		
		public void enterPass(String pwd) {
			
			enterPass.sendKeys(pwd);
			
			
		}
		
		public void LoginButton() {
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("arguments[0].click();", clickLoginBtn);
			//clickLoginBtn.click();
		}
}
