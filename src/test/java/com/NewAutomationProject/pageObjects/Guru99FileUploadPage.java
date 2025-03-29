package com.NewAutomationProject.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99FileUploadPage {
	
	WebDriver driver;
	
	public Guru99FileUploadPage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	//webElement initialization
	
	
	@FindBy(xpath="//a[text()='File Upload']")
	WebElement fileUpload;
	
	@FindBy(xpath="//input[@name='uploadfile_0']")
	WebElement fileUploadBtn;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//respective action methods
	
	
	public void clickOnFileUpload()
	{
		fileUpload.click();
		
	}
	
	public void clickOnFileUploadBtn() {
		
		fileUploadBtn.sendKeys("C:\\Users\\a2z\\Videos\\Sachin_Shelke_Resume.pdf");
	}
	
	
	

}
