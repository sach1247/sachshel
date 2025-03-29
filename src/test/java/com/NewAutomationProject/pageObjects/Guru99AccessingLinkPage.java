package com.NewAutomationProject.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99AccessingLinkPage {
	WebDriver driver;
	
	public Guru99AccessingLinkPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	// initialization of webelement
	
	@FindBy(xpath="//a[text()='Accessing Link']")
	WebElement accessinglink;
	
	@FindBy(tagName = "a")
	List<WebElement> allLinks;
	
	
	
	
	
	//respective action method
	
	public void clickOnAccessingLink()
	{
		accessinglink.click();
	}
	
	public void getAllTheLinks()
	{
		System.out.println("links are:"+allLinks);
		
	}
	
	

}
