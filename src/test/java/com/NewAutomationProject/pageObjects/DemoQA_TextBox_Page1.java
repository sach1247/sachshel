package com.NewAutomationProject.pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQA_TextBox_Page1 {
	
	
	// constructor initialization
	WebDriver driver;
	
	public DemoQA_TextBox_Page1(WebDriver driver)
	{
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	// webElement initialization
	
	@FindBy(xpath="//span[text()='Text Box']")
	WebElement clickTextBox;
	
	@FindBy(xpath="//input[@id='userName']")
	WebElement nameText;
	
	@FindBy(xpath="//input[@id='userEmail']")
	WebElement emailText;
	
	@FindBy(xpath="//textarea[@id='currentAddress']")
	WebElement addressText;
	
	@FindBy(xpath="//span[text()='Text Box']")
	WebElement scrollPage;
	
	@FindBy(xpath="//div[@id='permanentAddress-wrapper']")
	WebElement perAddress;
	
	@FindBy(xpath="//button[text()='Submit']")
	WebElement submitBtn;
	
	
	
	
	
	
	
	
	
	
	
	// respective action methods
	
	public void clickTextBox()
	{
		
		clickTextBox.click();
		
		
	}
	
	
	public void enterTextName(String name)
	{
		
		nameText.sendKeys(name);
		
		System.out.println("successfully entered the name");
		
		
	}
	
	
	public void enterEmail(String email)
	{
		emailText.sendKeys(email);
		
	}
	
	public void addressText(String address)
	{
		addressText.sendKeys(address);
		
	}
	
	public void scrollThePage()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", scrollPage);
		
	}
	
	public void perAddress(String perAdd)
	
	{
		
		perAddress.sendKeys(perAdd);
	}
	
	
	public void clickSubmitBtn()
	{
		submitBtn.click();
		
	}
	
	
	
	
	
	
	
	
	
	

}
