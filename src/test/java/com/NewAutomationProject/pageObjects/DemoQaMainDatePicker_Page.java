package com.NewAutomationProject.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DemoQaMainDatePicker_Page {
	
	WebDriver driver;

public DemoQaMainDatePicker_Page(WebDriver driver)
{
	this.driver=driver;
	
	PageFactory.initElements(driver, this);
	
}

//WebElement initialization

//@FindBy(xpath="//h1[text()='Accordian']")
//WebElement scrollUptoAccordianText;

@FindBy(xpath="//*[@id=\"datePickerMonthYearInput\"]")
WebElement clickDatePickerBox;

@FindBy(xpath="//select[@class='react-datepicker__year-select']")
WebElement select_yrs;

@FindBy(xpath="//select[@class='react-datepicker__month-select']")
WebElement select_mts;












//respective actions method

//public void scrollPage() {
//	
//	JavascriptExecutor js=(JavascriptExecutor)driver;
//	 js.executeScript("arguments[0].scrollIntoView(true);", scrollUptoAccordianText);
//}

public void clickOnDatePickerB()
{
	
	clickDatePickerBox.click();
	
	
}

public void yearSelect()
{
	Select sl=new Select(select_yrs);
	sl.selectByValue("2000");
	
}

public void monthsSelect()
{
	Select sl=new Select(select_mts);
	sl.selectByValue("3");
	
}







}

