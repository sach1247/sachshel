package com.NewAutomationProject.pageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoQA_Checkboxes_Page1 {
	
	WebDriver driver;
	public DemoQA_Checkboxes_Page1(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	//WebElement initialization
	
	
	
	@FindBy(xpath="//span[text()='Check Box']")
	WebElement CheckBoxClickBtn;
	
	@FindBy(xpath="//div[@id='tree-node']//label//span[@class='rct-checkbox']")
	List<WebElement>TotalCheckBoxes;
	
	
	
	
	
	
	
	
	
	// respective action method
	
	
	public void checkBoxOptionClick()
	{
		CheckBoxClickBtn.click();
		
	}
	
	public void checkBoxSizeDemo()
	{
		
		int checkSize=TotalCheckBoxes.size();	
		System.out.println("total number of checkBoxes are:"+checkSize);
		
	}
	 
//	public void scrollCheckPage()
//	{
//		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", CheckBoxClickBtn);;
//		
//		
//	}
//	
	public void lastTwoCheckBoxes()
	{
		
		for(int i=1;i<TotalCheckBoxes.size();i++)
		{
			
			TotalCheckBoxes.get(i).click();
		}
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
	//

}
