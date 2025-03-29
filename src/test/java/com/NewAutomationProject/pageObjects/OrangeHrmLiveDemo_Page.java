package com.NewAutomationProject.pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHrmLiveDemo_Page {

	
		
		WebDriver driver;
		WebDriverWait wait;
		// constructor initialization
		public OrangeHrmLiveDemo_Page(WebDriver driver)
		{
			
			this.driver=driver;
			 this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			PageFactory.initElements(driver, this);
			
			
			
		}
		
		
		
		//WebElement initialization
		
		@FindBy(xpath="//input[@name='username']")
		WebElement user;
		
		
		@FindBy(xpath="//input[@name='password']")
		WebElement pass;
		
		@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
		WebElement loginBtn;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//respective action method
		
		public void enterCredentials(String username, String password) {
		   // user.sendKeys(username);
		   // pass.sendKeys(password);
			
			wait.until(ExpectedConditions.visibilityOf(user)).sendKeys(username);
	        wait.until(ExpectedConditions.visibilityOf(pass)).sendKeys(password);
		}
		
		public void LoginBtn()
		{
			loginBtn.click();
			
			
		}

		
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	

