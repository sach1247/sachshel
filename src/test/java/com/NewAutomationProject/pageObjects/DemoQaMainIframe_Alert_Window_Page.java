package com.NewAutomationProject.pageObjects;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQaMainIframe_Alert_Window_Page {

	WebDriver driver;
	WebDriverWait wait;
	
	public DemoQaMainIframe_Alert_Window_Page(WebDriver driver) 
	
	{
		
		this.driver=driver;
	wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
				
				
				
		
		PageFactory.initElements(driver, this);
	}
	
	
	//webElement initialization
	
	
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/span[1]/div[1]/div[2]/div[2]/*[name()='svg'][1]")
	WebElement clickOnAlertWinFrame;
	
    @FindBy(xpath="//a[@class='ns-k0mus-e-11']")
    WebElement startHereText;
//	
	@FindBy(xpath="//span[text()='Alerts']")
	WebElement alertClick;
	
	@FindBy(xpath="//button[@id='promtButton']")
	WebElement clickPromptAlert;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void allDrpClick()
	{
		wait.until(ExpectedConditions.elementToBeClickable(clickOnAlertWinFrame));
		//clickOnAlertWinFrame.click();
		
	}
	
	public void scrollByStartAWP()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", clickOnAlertWinFrame);
		
	}
	
	public void alertClick()
	{
		
		//alertClick.click();
		
	}
	
	public void clickOnPromptAlert()
	{
		clickPromptAlert.click();
		
	}
	
	
	public void handlePromptAlert()
	{
		Alert myalert=driver.switchTo().alert();
		
		//System.out.println(myalert.getText());
		
		driver.switchTo().alert().accept();
	}
}

