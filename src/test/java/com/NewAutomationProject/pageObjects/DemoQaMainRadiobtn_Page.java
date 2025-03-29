package com.NewAutomationProject.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoQaMainRadiobtn_Page {
	
	WebDriver driver;
	
	public DemoQaMainRadiobtn_Page(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	//WebElement
	
	@FindBy(xpath="//div[@class='custom-control custom-radio custom-control-inline']//input")
	List<WebElement>radioBtn;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//respective action methods
	
	public void radioBtnSize()
	{
		int rad=radioBtn.size();
		
		System.out.println("radio button size are:"+rad);
	}
	
	// to click on the second radio button
	
	public void clickOnRadBtn()
	{
		for(int i=0;i<radioBtn.size();i++)
		{
			if(i<=1)
			{
				radioBtn.get(i).click();
			}
			
		}
		
	}

}
