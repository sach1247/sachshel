package com.NewAutomationProject.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;





// constructor initialization

public class OrangeHrmAdminDashboard_Page {
	
	WebDriver driver;
//	WebDriverWait wait;
	
	public OrangeHrmAdminDashboard_Page(WebDriver driver)
	{
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	//WebElement initialization
	
	
	
	
	@FindBy(xpath="//span[text()='Admin']")
	WebElement Admin;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")
	WebElement userDash;
	
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[2]/i")
	WebElement userSelect;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]")
	WebElement essSelectOption;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div")
	WebElement EmployeeN;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div")
	WebElement status;
	
	@FindBy(xpath="//div[text()='Disabled']")
	WebElement disabledStatus;
	
	
	
	// respective action method
	
	public void AdminBtnClick()
	{
		Admin.click();
		
	}
	
	
	public void userDashField(String dashUser)
	{
		userDash.sendKeys(dashUser);
		
	}
	
	public void userRoleFiledClick()
	{
		userSelect.click();
	}
	
	public void userOptionSelectEss()
	{
		essSelectOption.click();
	}
	
	public void EmployeeNameEnter(String EmpNum)
	{
		
		EmployeeN.sendKeys(EmpNum);
	}
	
	public void statusOptinClick()
	{
		status.click();
	}
	
	public void selectDisabledOption()
	
	{
		
		//wait.until(ExpectedConditions.visibilityOf(disabledStatus));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("arguments[0].click();", disabledStatus);
		//disabledStatus.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
