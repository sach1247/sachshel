package com.NewAutomationProject.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoQaMainCheckBox_Page {
	
	WebDriver driver;
	 // constructor
	
	public DemoQaMainCheckBox_Page(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	// webElement initialization
	
	@FindBy(xpath="//span[text()='Check Box']")
	WebElement clickOnCheckBx;
	
	@FindBy(xpath="//button[@title='Toggle']//*[name()='svg']")
	WebElement clickOnCheckDrp;
	
	
	// to get the total checkboxes 
	
	@FindBy(xpath="//li[@class='rct-node rct-node-parent rct-node-expanded']//span[@class='rct-text']//span[@class='rct-checkbox']")  
	List<WebElement>checkBoxeSize;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// respective  actions  methods
	
	public void clickOnCheckBxDemo
	()
	{
		clickOnCheckBx.click();
	}
	
	public void clickOnDrpCheckBxDemo
	()
	{
		
		clickOnCheckDrp.click();
	}
	
	public void checkboxSizeDemo()
	{
		int checkBoxes=checkBoxeSize.size();
		System.out.println("total number of checkBoxes are:"+checkBoxes);
	}
	
	public void clickOnFirstTwoCheckBxDemo()
	{
		
		for(int i=0;i<checkBoxeSize.size()-2;i++)
		{
			
			checkBoxeSize.get(i).click();
			
			
			
		}
	}
	
	
	

}
