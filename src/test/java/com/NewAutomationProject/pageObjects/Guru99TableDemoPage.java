package com.NewAutomationProject.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99TableDemoPage {
	WebDriver driver;
	
	public Guru99TableDemoPage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	//webElement initialization
	
	@FindBy(xpath="//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a/b")
	WebElement seleniumClickDrp;
	
	@FindBy(xpath="//a[text()='Table Demo']")
	WebElement tableDemo;
	
	@FindBy(xpath="/html/body/table//tbody//tr/td")
	List<WebElement>tablecount;
	
	@FindBy(xpath="/html/body/table//tbody//tr[2]/td")
	List<WebElement>SecondRowTableData;
	
	
	

	
	
	
	
	
	
	
	
	
	
	//respective action methods
	
	public void clickOnSeleniumDrp()
	{
		seleniumClickDrp.click();
	}
	
	public void clickOnTableDemo()
	{
		tableDemo.click();
	}
	
	public void tableSizeCount()
	{
		int size=tablecount.size();
		System.out.println("size is:"+size);
	}
	
	//second row print the data
	
	int sum=0;
	public void printSecondRowData()
	{
		for(WebElement ele:SecondRowTableData)
		{
			
			String value=ele.getText();
			System.out.println(value);
			
			sum=sum+Integer.parseInt(value);
		}
		System.out.println("Total sum of prices ="+ sum);
		float avg=sum/SecondRowTableData.size();
		System.out.println("Avg of prices ="+ avg);
		
		
	}
}
