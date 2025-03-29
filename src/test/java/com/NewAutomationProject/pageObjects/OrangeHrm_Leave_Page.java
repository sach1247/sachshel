package com.NewAutomationProject.pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHrm_Leave_Page {

	WebDriver driver;
//	WebDriverWait wait;
	
	
	// constructor Initialization
	public OrangeHrm_Leave_Page(WebDriver driver)
	{
		
               this.driver=driver;
               
               PageFactory.initElements(driver, this);
	}
	
	
	// WebElement Initialization
	
	@FindBy(xpath="//a[@class='oxd-main-menu-item active']")
	WebElement leaveBtn;
	
	@FindBy(xpath="//div[@class='oxd-grid-4 orangehrm-full-width-grid']//div[1]//div[1]//div[2]//div[1]//div[1]//i[1]")
	WebElement datePickerClick;
	
	@FindBy(xpath="//li[@class='oxd-calendar-selector-year']//p[1]")
	WebElement yearSelect;
	
	@FindBy(xpath="//div[@class='oxd-calendar-selector-month-selected']")
	WebElement monthSelect;
	
	
	
	
	
	
	
	
	
	
	
	
	// respective action method
	
	public void leaveBtnClick()
	{
		
		leaveBtn.click();
		
	}
	
	public void datePickerClick()
	
	{
		//wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		///wait.until(ExpectedConditions.visibilityOf(datePickerClick));
		datePickerClick.click();
		
	}
	
	public void yearSelectDatepicker()
	{
		Select sl=new Select(yearSelect);
		sl.selectByIndex(0);
	}
	
	public void monthSelectDatepicker()
	{
		
		Select sl=new Select(monthSelect);
		sl.selectByIndex(2);
	}
	
	
	
	
	

}
