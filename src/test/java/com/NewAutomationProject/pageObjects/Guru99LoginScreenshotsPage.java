package com.NewAutomationProject.pageObjects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99LoginScreenshotsPage {
	WebDriver driver;
	
	public Guru99LoginScreenshotsPage(WebDriver driver){
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		
		//WebElement initialization
		
		
		
	}
	
	@FindBy(xpath="")
	WebElement LoginLink;
	
	
	
	
	
	
	
	
	
	
	
	
	//respective action method
	
	public void clickOnLoginOption()
	{
		LoginLink.click();
	}
	
	public void screenshotOfPage() throws IOException
	{
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sFile=ts.getScreenshotAs(OutputType.FILE);
		
		File Tfile=new File("C:\\Users\\a2z\\eclipse-workspace\\NewAutomationProject\\Screenshots\\screenshots.jpg");
		
		FileUtils.copyFile(sFile, Tfile);
	}
	

}
