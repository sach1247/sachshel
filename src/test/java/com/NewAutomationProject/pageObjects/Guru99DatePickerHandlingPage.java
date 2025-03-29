package com.NewAutomationProject.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99DatePickerHandlingPage {
	
	WebDriver driver;
	
	public Guru99DatePickerHandlingPage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	//webElement initialization
	
	@FindBy(xpath="//a[text()='New Tours']")
	WebElement scrollThePage;
	
	@FindBy(xpath="//a[text()='Selenium DatePicker Demo']")
	WebElement datePicker;
	
	@FindBy(xpath="//input[@name='bdaytime']")
	WebElement datePickerTab;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//respective Action methods
	
	public void scrollThePage()
	{
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", scrollThePage);
	}
	
	public void DatePickerClick()
	{
		datePicker.click();
		
	}
	
	public void sendkeysOnTheDatePickerTab(String DOB)
	{
		
		datePickerTab.sendKeys(DOB);
	}

}
