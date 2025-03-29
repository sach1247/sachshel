package com.NewAutomationProject.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoQaMainButtons_Page {
	
	WebDriver driver;
	
	public DemoQaMainButtons_Page(WebDriver driver)
	{
		this.driver=driver;
		
		
		PageFactory.initElements(driver, this);
	}
	
	
	//WebElement 
	
	@FindBy(xpath="//span[text()='Buttons']")
	WebElement btns;
	
	@FindBy(xpath="//button[@id='doubleClickBtn']")
	WebElement Dclick;
	
	@FindBy(xpath="//button[@id='rightClickBtn']")
	WebElement Rclick;
	
	@FindBy(xpath="//button[text()='Click Me']")
	WebElement click;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//respective actions method
	
	public void clickOnBtns()
	{
		btns.click();
	}
	
	public void DoubleClick()
	{
		
		Actions act=new Actions(driver);
		
		act.doubleClick(Dclick).click().perform();
	}
	
	public void RightClickBtn()
	{
		
		Actions act=new Actions(driver);
		act.contextClick(Rclick).click().perform();
		
	}
	
	public void scrollUptoRclick()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", Rclick);
	}
	
	public void clickOption()
	{
		click.click();
	}

}

