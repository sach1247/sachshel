package com.NewAutomationProject.pageObjects;




import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RahulShettyHomePage {
	
	WebDriver driver;
	
	public RahulShettyHomePage(WebDriver driver)
	
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//webElement initialization
	
	
	
	@FindBy(xpath="//div[@id='radio-btn-example']//input")
	List<WebElement> rad_btn;
	
	@FindBy(xpath="//input[@class='inputs ui-autocomplete-input']")
	WebElement enterCountrySuggestion;
	
	@FindBy(xpath="//select[@id='dropdown-class-example']")
	WebElement selectDrp;
	
	@FindBy(xpath="//div[@id='checkbox-example']//label//input")
	List<WebElement>checkBoxes;
	
	@FindBy(xpath="//input[@id='confirmbtn']")
	WebElement alertHandling;
	
	@FindBy(xpath="//button[@id='openwindow']")
	WebElement clickOnWindow;
	
	@FindBy(xpath="//button[@id='mousehover']")
	WebElement clickOnMouse;
	
	@FindBy(xpath="//a[text()='Top']")
	WebElement topHover;
	
	@FindBy(xpath="//legend[text()='Mouse Hover Example']")
	WebElement moveUpToElement;
	
	@FindBy(xpath="//table[@id='product']//tbody/tr/td")
	WebElement WebTable;
	
	@FindBy(xpath="//table[@id='product']//tbody/tr/td")
	List<WebElement> tableSize;
	
	@FindBy(xpath="//table[@id='product']//tbody/tr[5]/td[3]")
	WebElement specificValueFromTable;
	
	@FindBy(xpath="//table[@class='table-display']//tbody/tr/td[3]")
	List<WebElement> singleColumnData;
	
	//@FindBy(xpath="")
	
	
	
	
	
	
	
	//action method
	
	
	
	public void totalRadBtn()
	{
		System.out.println("total num of radio button:"+rad_btn.size());
	}
	
	public void selectDrp()
	{
		
	
			for(int i=2;i<rad_btn.size();i++)
			{
				rad_btn.get(i).click();
			}
			
				
				
		
	}
	
	public void selectSuggetion(String s) {
		 enterCountrySuggestion.sendKeys(s);
		
		
	}
	public void selectDrpOption()
	{
		Select sl=new Select(selectDrp);
		//sl.selectByIndex(0);
		sl.selectByValue("option2");
	}
	
	public void checkBoxesSize()
	{
		System.out.println("total number of checkboxes are:"+checkBoxes.size());
	}
	
	public void clickOnCheckBoxes()
	
	{
		for(int i=0;i<checkBoxes.size();i++)
		{
			if(i==0 && i==2) {
				
				checkBoxes.get(i).click();
			}
		}

}
	public void alertDemo()
	{
		alertHandling.click();
		
		Alert myalert=driver.switchTo().alert();
		
		System.out.println(myalert.getText());
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
				
	}
	
	public void clickOnWindow()
	{
		clickOnWindow.click();

}
	public void closeSingleWindow()
	{
		driver.close();
	}
	
	public void MoveUptotext()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", moveUpToElement);
	}
	
//	public void clickOnMouseBtn()
//	{
//		clickOnMouse.click();
//		
//	}
//	
	public void MouseHoverAction()
	{
		Actions act=new Actions(driver);
		act.moveToElement(clickOnMouse).moveToElement(topHover).click().perform();
	}
	
	public void webTableContent()
	{
		
//		String text=WebTable.getText();
//		System.out.println("text are in the webtable:"+text);
		
		for(WebElement T:tableSize)
		{
			
			String text=T.getText();
			System.out.println("text are:"+text);
		}
//		
		System.out.println("total webtable content size are:"+tableSize.size());
		
		
		
		
		
	} 
	
	public void webtableSingleData()
	{
		
		String value=specificValueFromTable.getText();
		System.out.println("text is:"+value);
		
	}
	
	public void thirdColumnData()
	{
		for(WebElement ele:singleColumnData)
		{
		String T=ele.getText();
		System.out.println("text are in the third column:"+T);
		}
		
		
		//System.out.println("third column data are:"+columnData);
	}
	    
}
