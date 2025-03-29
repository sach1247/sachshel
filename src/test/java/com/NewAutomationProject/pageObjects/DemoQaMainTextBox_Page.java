package com.NewAutomationProject.pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQaMainTextBox_Page {
	
	// constructor created for initialization for page class
	
	 WebDriver driver;
	 WebDriverWait wait;
	
	public DemoQaMainTextBox_Page(WebDriver driver) {
		
		this.driver=driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	// webElement initialization 
	
	@FindBy(xpath="//span[text()='Text Box']")
	WebElement clickOnTextbox;
	
	@FindBy(xpath="//input[@id='userName']")
	WebElement enterUseranmeTextboxField;
	
	@FindBy(xpath="//input[@type='email']")
	WebElement enterEmailTextboxField;
	
	@FindBy(xpath="//textarea[@id='currentAddress']")
	WebElement enterAddressTextboxField;
	
	@FindBy(xpath="//label[text()='Permanent Address']")
	WebElement scrollUptoPermanentAdd;
	
	@FindBy(xpath="//textarea[@id='permanentAddress']")
	WebElement enterPermanentAddressTextboxField;
	
	
	@FindBy(xpath="//button[text()='Submit']")
	WebElement clickOnSubmitBtn;
//	
//	@FindBy(xpath="")
//	WebElement 
//	
//	@FindBy(xpath="")
//	WebElement 
//	
//	@FindBy(xpath="")
//	WebElement 
//	
//	@FindBy(xpath="")
//	WebElement 
//	
	
	
	public void clickTextBoxDemo()
	{
		clickOnTextbox.click();
	}
	
	
	public void enterFullNameDemo(String name)
	
	{
		
		wait.until(ExpectedConditions.visibilityOf(enterUseranmeTextboxField)).sendKeys(name);
		//enterUseranmeTextboxField.sendKeys(name);
	}
	
	
	public void enterEmailDemo(String email)
	{
		enterEmailTextboxField.sendKeys(email);
	}
	
	
	public void enterAddressDemo(String Add)
	{
		
		enterAddressTextboxField.sendKeys(Add);
	}
	
	
	public void scrollPageDemo()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true);", scrollUptoPermanentAdd);
	}
	
	
	public void eneterPermanantAddDemo(String permAdd)
	{
		
		enterPermanentAddressTextboxField.sendKeys(permAdd);   
	}
	
	public void clickOnSubmitDemo()
	{
		clickOnSubmitBtn.click();
		
	}
	

}
