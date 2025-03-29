package com.NewAutomationProject.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99LoginPage {
	
	WebDriver driver;
	
	public Guru99LoginPage(WebDriver driver)
	{
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	//WebElement initialization
	
	@FindBy(xpath="//input[@name='emailid']")
	WebElement enterEmail;
	
	@FindBy(xpath="//input[@name='btnLogin']")
	WebElement submitBtnClick;
	
	@FindBy(xpath="//h2[text()='Guru99 Bank']")
	WebElement verfiyDashboard;
	
	
	
	
	
	//respective action method
	
	
	public void enterEmail(String email)
	{
		
		enterEmail.sendKeys(email);
		
	}
	
	public void  clickOnSubmitBtn()
	{
		submitBtnClick.click();
	}
	
	public String verifyDashboardPage() {
	String value=verfiyDashboard.getText();
	return value;
		
	}

}
