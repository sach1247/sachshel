package com.NewAutomationProject.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoQaMainWebTable_Page {
	
	WebDriver driver;
	//constructor
	
	public DemoQaMainWebTable_Page(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	// webElement initialization
	
	// to print all the text from the webtable
	@FindBy(xpath="//div[@class='rt-table']//div//div[@role='row']//div[@class='rt-td']")
	List<WebElement> countTotalTextInWebTable;
	
	// to get the specific data from the webtable
	
	@FindBy(xpath="//div[text()='Insurance']")
	WebElement insuranceText;
	
	
	//@FindBy(xpath="")
	//WebElement btns;
	
	
	
	
	
	
	
	
	
	
	
	
	//respective actions methods
	
	public void getAllTextWebTable()
	{
		
		for(WebElement ele:countTotalTextInWebTable)
		{
			String value=ele.getText();
			
			System.out.println(value);
		}
	}
	
	public void getSpecificText()
	{
		String T=insuranceText.getText();
		System.out.println("text is:"+T);
	}
	
//	public void clickOnBtns()
//	{
//		
//		btns.click();
//	}
//	
//	

}

