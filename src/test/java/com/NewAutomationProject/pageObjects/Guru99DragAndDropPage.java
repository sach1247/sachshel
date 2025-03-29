package com.NewAutomationProject.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99DragAndDropPage {
	
	WebDriver driver;
	
	public Guru99DragAndDropPage(WebDriver driver)
	{
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	//webElement initialization
	
	@FindBy(xpath="//a[text()='Drag and Drop Action']")
	WebElement dragAndDrop;
	
	@FindBy(xpath="//a[text()=' BANK ']")
	WebElement Bank;
	
	@FindBy(xpath="//*[@id=\"shoppingCart3\"]/h3")
	WebElement account;
	
	
	
	
	
	
	
	
	
	
	//respective action methods
	
	public void clickOnDragAndDrop()
	{
		dragAndDrop.click();
		
	}
	
	public void dragAndDrop()
	{
		Actions act=new Actions(driver);
		
		act.dragAndDrop(Bank, account).perform();
		
		
	}

}
