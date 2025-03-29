package com.NewAutomationProject.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoQaMainLinks_page {
	
	WebDriver driver;
	
	public DemoQaMainLinks_page(WebDriver driver)
	{
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	//webElment initialization
	
	@FindBy(tagName = "a")
	List<WebElement>links;
	
	
	
	
	
	
	
	
	

	
	
	//respective actions method
	
	public void totalLinks()
	{
		for(WebElement ele:links)
		{
			
			System.out.println("links size are:"+links.size());
			System.out.println(ele.getText());
		}
		
	}

}










