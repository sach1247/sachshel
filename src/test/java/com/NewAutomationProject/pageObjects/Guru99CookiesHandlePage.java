   package com.NewAutomationProject.pageObjects;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99CookiesHandlePage {
	WebDriver driver;
	
	public Guru99CookiesHandlePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	
	//weElement initialization
	
	
	@FindBy(xpath="//a[text()='Cookie Handling Demo']")
	WebElement cookiesDemo;
	
	@FindBy(xpath="//input[@name='username']")
	WebElement userC;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passC;
	
	@FindBy(xpath="//button[text()='Login']")
	WebElement loginC;
	
	@FindBy(xpath="//button[@id='submitbutton']")
	WebElement scrollTheBtn;
	
	
	
	
	
	
	
	
	
	
	
	
	//respective actions methods
	

	
	public void scrolltheSubmitBtn()
	{
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", scrollTheBtn);		
	}
	
	public void clickcookiesHandling()
	{
		cookiesDemo.click();
	}
	

	public void enterUserC(String user)
	{
		userC.sendKeys(user);
	}
	
	public void eneterPassC(String pass)
	{
		passC.sendKeys(pass);
	}
	public void clickOnLogin()
	{
		loginC.click();
	}
	
	public void captureAllCookies()
	
	{
		
		Set<Cookie>cookies=driver.manage().getCookies();
		System.out.println(cookies.size());
	

// to print the cookies from the browser
	
		for(Cookie c:cookies) {
			
		System.out.println(c.getName()+":"+c.getName());
		
		//how to add the cookies
		
		Cookie Cobj=new Cookie("myCookie","123");
		driver.manage().addCookie(Cobj);
		
			cookies=driver.manage().getCookies();
			System.out.println("size of cookies after adding the new one cookie:"+cookies);
			
			//how to delete Particular cookie from the browser
			
			driver.manage().deleteCookie(Cobj);
			cookies=driver.manage().getCookies();
			System.out.println("cookies after deletion is:"+cookies.size());
			
			//how to delete all the cookies from the browser
			driver.manage().deleteAllCookies();
			cookies=driver.manage().getCookies();
			System.out.println("size of cookies after deleting all:"+cookies.size());
	}
}
}




		
		


