package com.NewAutomationProject.pageObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OmayoSingleMain_Page {
	
	WebDriver driver;
	
	public OmayoSingleMain_Page( WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}

	
	
	// WebElement Initialization
	
	// dropdwon selection
	@FindBy(xpath="//select[@id='multiselect1']")
	WebElement drpAll;
	
   // to handle the window 
    @FindBy(xpath="//a[text()='SeleniumTutorial']")
    WebElement windowHandleDemo;
	
	// to get the all links from the webpage
	 @FindBy(xpath = "//a")
	List<WebElement> AllLinks;
	
	 // to clear the text which is already in textBox
	 @FindBy(xpath="//input[@value='Selenium WebDriver']")
	 WebElement clearText;
	 
	 // to check button is enabled or disabled in Navigational commands
	 @FindBy(xpath="//button[@id='but1']")
	 WebElement disabled;
	 
	 // to scroll upto the disabled button
	 @FindBy(xpath="//button[@id='but2']")
	 WebElement enabledBtn;
	 
	 //to handling the radio button,like size,selection of the dropDown
	 @FindBy(xpath="//div[@class='widget-content']//input[@name='gender']")
	 List<WebElement>radBtn;
	 
	 // to handling the simple alert
	 @FindBy(xpath="//input[@id='alert1']")
	 WebElement alertDemo;
	 
	 // to handling the checkBoxes
	 @FindBy(xpath="//div[@class='widget-content']//input[@name='color']")
	List<WebElement> checkBtn;
	 
	 
	 // to handle the prompt alert
	 @FindBy(xpath="//input[@id='prompt']")
	 WebElement promtAlert;
	 
	 // window open thenn closed it
	 @FindBy(xpath="//a[text()='Open a popup window']")
	 WebElement Win;
	 
	 // handle the webtable and find the total numbers of webelement 
	 @FindBy(xpath="//table[@id='table1']//tbody//tr//td")
	 List<WebElement>tableEle;
	 
	 // to print the pune element from the webtable
	 @FindBy(xpath="//table[@id='table1']//tbody//tr[2]//td[3]")
	 WebElement city;
	 
	 // to locate element for username field of login page
	 @FindBy(xpath="//form[@name='form1']//input[@type='text']")
	 WebElement userLogin;
	 
	 // to locate element for password field of login page
	 @FindBy(xpath="//form[@name='form1']//input[@type='password']")
	 WebElement passLogin;
	 
	 // to locate element for login btn of login page
	 @FindBy(xpath="//button[text()=' LogIn ']")
	 WebElement loginBtn;
	 
	 // to scroll upto click after text disappear button to handle the frame no 10
	 @FindBy(xpath="//input[@value='ClickAfterTextDissappears']")
	 WebElement ClickAfterTextDissappearsBtn;
	 
	// to switch the frame
	 @FindBy(xpath="//iframe[@id='iframe1']")
	 WebElement  frame1Switch;
	 
	 //to  click on the link which in frame with 310 number series
	 @FindBy(xpath="//*[@id=\"HTML8\"]/div[1]/table/tbody/tr/td[1]/ol/li[36]/b/a")
	 WebElement frameLink;
	 
	 
	 // to switch into the frame 
	 @FindBy(xpath="//iframe[@name='f184a477be3939836']")
	 WebElement frame;
	 
	 // to click on element in the frame
	// @FindBy(xpath="/html/body/div[5]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[1]/div[4]/div/a")
	// WebElement atomEleInFrame;
	 
	 // to perform the double click action
	 @FindBy(xpath="//button[text()=' Double click Here   ']")
	 WebElement DclickBtn;
	 
	 //// to click on the check this button
	 @FindBy(xpath="//button[text()='Check this']")
	 WebElement checkThisBtn;
	 
	 @FindBy(xpath="//*[@id=\"HTML4\"]/div[1]/table/tbody/tr/td[1]/a/img")
	 WebElement telegramGroupNameLink;
	 
	
	 
	 
	
	
	
	// respective action methods
	
	public void drpOptionSelectiomn(String value)
	{
		Select sl=new Select(drpAll);
		
		sl.selectByValue(value);
	}
	
	public void windowHandleDemo()
	{
		windowHandleDemo.click();
		Set<String>Ids=driver.getWindowHandles();
		System.out.println("window ids are:"+Ids);
		
		ArrayList<String> array=new ArrayList<>(Ids);
		String c=array.get(1);
		System.out.println("child window id is");
		
		
		driver.switchTo().window(c);
		
	}
		
		public void newWindow() {
			telegramGroupNameLink.click();
		}
	
		
		
		
		
	
	
	// to get the all the links from the webpage
	
	public void getAllLinks()
	{
		
		System.out.println("total links are in the webpage:"+AllLinks.size());
		for(WebElement l: AllLinks )
		{
			System.out.println("texts of the all links are in the page:"+l.getText());
		}
		
	}
	public void clearText()
	
	{
		clearText.clear();
	}
	
	public void disabledButtonCheck()
	
	{
		boolean value=disabled.isEnabled();
		System.out.println(value);
		if(value==true)
		{
			System.out.println("button is enabled");
		}
		else
		{
			System.out.println("button is disabled");
		}
	}
	
	public void scrollUptEnabledButton()
	{
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", enabledBtn);
		
	}
	
	public void radBtnHandlingDemo()
	{
		// get all the radio buttons
		
		for(int i=1;i<=radBtn.size();i++)
			
		{
			//System.out.println(rad.getSize());
			
			//System.out.println(rad.getText());
			
			
		}
		
		
		
	}
	
	public void alertHandlingDemo()
	
	{
		alertDemo.click();
		
		// handle alert using select class
		
		Alert myalert=driver.switchTo().alert();
		//System.out.println("text in the alert is:"+myalert.getText());
		
		// Close the alert using by clicking on the ok button
		driver.switchTo().alert().accept();
		
	}
	
	public void checkHandlingDemo()
	{
		// to return the total numbers of checkboxes on the webtable
		
		System.out.println("total numbers of checkboxes are in the web table:"+checkBtn.size());
		
		
		for(int i=1;i<checkBtn.size();i++)
		{
			checkBtn.get(i).click();
		}
	}
	
	public void promptAlertDemo()
	
	{
		promtAlert.click();
		
		Alert myalert=driver.switchTo().alert();
		myalert.sendKeys("Welcome to prompt alert");
		
		driver.switchTo().alert().dismiss();
	}
	
	public void windOpenDemo()
	{
	//	Win.click();
	}
	
	public void closeWin()
	{
		//driver.close();
	}
	
	public void tableEle()
	{
		System.out.println(tableEle.size());
		
		for(WebElement t:tableEle)
		{
			System.out.println(t.getText());
		}
	}
	
	public void cityFromWebTableDemo()
	{
		System.out.println(city.getText());
	}
	
	public void loginUserPassDemo(String user,String pass)
	
	{
		userLogin.sendKeys(user);
		passLogin.sendKeys(pass);
	}
	
	public void clickLoginBtnDemo()
	{
		loginBtn.click();
	}
	
	public void scrollUpToLoginBtn()
	   
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", loginBtn);
	}
	public void scrollUptoClickAfterTextDissappearsBtn()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ClickAfterTextDissappearsBtn);
		
	}
	
	public void frameSwitchDemoAndClicked()
	{
		driver.switchTo().frame(frame1Switch);
        frameLink.click();             
		
	}
	
//	public void frameElementClick()
//	{
//		atomEleInFrame.click();
//	}
	
	public void doubleClickDemo()
	{
	  Actions act=new Actions(driver);
	  act.moveToElement(DclickBtn).click().perform();
		
	}
//	public void alertDoubleClick()
//		{
//			 Alert myalert=driver.switchTo().alert();
//			 
//		 driver.switchTo().alert().accept();
//		 
//	}
	
	public void checThisBtnDemo()
	{
		boolean value=checkThisBtn.isEnabled();
		System.out.println("boolean value is:"+value);
		if(checkThisBtn.isEnabled())
		{
			System.out.println("check this button is enabled");
		}
		else {
			System.out.println("check this button is disabled");
		}
	}
}




