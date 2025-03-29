package com.NewAutomationProject.pageObjects;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;

//import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



// construction initialization


public class ShettyAutomationFirst_Page {
	
	
	WebDriver driver;
	
	public ShettyAutomationFirst_Page(WebDriver driver){
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	//WebElement initialization
	
	
	
	// to get the tiltle of the mainpage
	//@FindBy(xpath="//a[text()='Free Access to InterviewQues/ResumeAssistance/Material']")
	//WebElement imgText;
	
	
	
	
	
	
	
	@FindBy(xpath="//button[normalize-space()='Home']")
	WebElement homeBtn;
	
	@FindBy(xpath="//h1[text()='Practice Page']")
	WebElement textPractisePage;
	
	@FindBy(xpath="//input[@value='radio1']")
	WebElement selectRad1;
	
	
	
	
	
	
	@FindBy(xpath="//div[@id='radio-btn-example']//label//input")
	List<WebElement> rads;
	
	@FindBy(xpath="//select[@id='dropdown-class-example']")
	WebElement Drps;
	
	@FindBy(xpath="//div[@id='checkbox-example']//label//input")
	List<WebElement>checkBoxes;
	
	//open new tab on the browser page
	@FindBy(xpath="//a[text()='Open Tab']")
	WebElement opentabs;
	
	
	
	@FindBy(xpath="//input[@id='alertbtn']")
	WebElement alertBtn;
	
	@FindBy(xpath="//legend[text()='Web Table Example']")
	WebElement WebTableExText;
	
	@FindBy(xpath="//table[@id='product']//tbody//tr//td")
	List<WebElement>webtableEle;
	
	@FindBy(xpath="//table[@id='product']//tbody//tr/td[3]")
	List<WebElement>thirdColumnText;
	
	
	// to get the specific value from the WebTable
	@FindBy(xpath="//table[@id='product']//tbody//tr[10]//td[2]")
	WebElement SpecifiValueWebTable;
	
	// to get the values which is belongs to the 25 values rows, first locate an elements for all the rows
	
	@FindBy(xpath="//table[@id='product']//tbody//tr")
	List<WebElement>TotalRows;
	
	
	// to scroll the page upto mouse hover
	@FindBy(xpath="//legend[text()='Mouse Hover Example']")
	WebElement MouseHoverText;
	
	@FindBy(xpath="//button[text()='Mouse Hover']")
	WebElement mouseHoverBtn;
	
	@FindBy(xpath="//a[text()='Reload']")
	WebElement ReloadBtnMouseHover;
	
	
	
	
	// to get the all The links which are on the webpage
	
	@FindBy(tagName = "a")
	List<WebElement>allLinks;
	
	@FindBy(xpath="//iframe[@id='courses-iframe']")
	WebElement iframe;
	
	@FindBy(xpath="/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[2]/a")
	WebElement coursesBtn;
	
	@FindBy(xpath="//legend[text()='Switch Window Example']")
	WebElement winowExampleText;
	
	//@FindBy(xpath="/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[9]/a")
	//WebElement moreBtn;
	
	//@FindBy(xpath="/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[9]/ul/li[3]/a")
	//WebElement contactHover;
	
	@FindBy(xpath="//table[@id='product']//tbody//tr//td[3]")
	List<WebElement>ThirdColumnValue;
	
	
	
	
	
	
	// respective actions Methods
	
	public void radioBtnSelectDemo()
	{
		boolean radBtn=selectRad1.isSelected();
		
		if(selectRad1.isSelected())
		{
			System.out.println("radio button is selected");
		}
		else {
			
			System.out.println("radio button is not selected ");
		}
		
		//Assert.fail();
		//System.out.println("assertion condition has failed");
		
	}
	
	
	
	public void getTitle()
	{
		
		String title=driver.getTitle();
		
		System.out.println("title of the webpage is:"+title);
	}
	
	
	
	
	
	
	public void textDisplyDemo()
	{
		
		boolean textDisp=textPractisePage.isDisplayed();
		
		if(textPractisePage.isDisplayed())
		{
			System.out.println("text is displaying on the webpage");
		}
		else {
			System.out.println("text is not displaying on the webpage");
		}
	}
	
	
	
	public void homeBtn()
	{
		
		boolean btnHome=homeBtn.isEnabled();
		
		if(homeBtn.isEnabled())
		{
			
			System.out.println("Home Button is Enabled");	
		}
		else {
			
			System.out.println("Home Button is disabled");
		}
		
	}
	
	
	
	
	
	
	public void radioBtnOperation()

	{
		int radBtns=rads.size();
		System.out.println("total numbers of the radio buttons which are on the webpage:"+radBtns);
	}
	
	public void radioBtnSelect()
	{
		for(int i=0;i<rads.size();i++)
		{
			if(i==1)
			{
				rads.get(i).click();
				
				Assert.assertTrue(rads.get(i).isSelected(), "radio button is not selected in a selenium");
				
				System.out.println("successfully selected the second radio button from the option");
				
				break;
			}
		}
		}
		
		
		
		public void DrpHandling()
		{
			Select sl = new Select(Drps);
			sl.selectByIndex(0);
			
			System.out.println("successfullu selected the option first of the dropdown");
		}
		
		
		public void checkboxesHandling()
		{
			int checkSize=checkBoxes.size();
			System.out.println("total numbers of the checkBoxes in the string are:"+checkSize);
			
		}
		
		// to select the last Two checkBoxes
		public void checkBoxesSelection()
		{
			 for(int i=1;i<checkBoxes.size();i++)
			 {
				 checkBoxes.get(i).click();
				 
				 System.out.println("successfully selected the last two checkBoxes");
			 }
		}
		
//		public void openTabDemo()
//		{
//			
//			opentabs.click();
//			
//			System.out.println("perform the clicked action on the open tab link which are on the webpage");;
//			
//		}
//		
//		public void windowId()
//		{
//			
//			Set<String>winIds=driver.getWindowHandles();
//			System.out.println("window ids are on the webtable:"+winIds);
//		}
//		
//		public void closeBrowserDemo()
//		{
//			
//			//driver.close();
//		}
//		
		public void AlertBtnClick()
		{
			alertBtn.click();
			System.out.println("successfully has clicked on the alert");
			
		}
		
		public void alertHandleDemo()
		{
			Alert myalert=driver.switchTo().alert();
			
			driver.switchTo().alert().accept();
		}
		
		public void ScrollWebTableText()
		{
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true)", WebTableExText);
		}
		
		public void webtableElementSizeDemo()
		{
			
			int tableEle=webtableEle.size();
			System.out.println("total element which are in the webtable are:"+tableEle);
		}
		
		public void WebTableEleText()
		
		{
			for(WebElement ele:webtableEle)
			{
				String eleTextWebTable=ele.getText();
				
				System.out.println("text which are in the webtable:"+eleTextWebTable);
			}
		}
		
		public void thirdColumnText()
		{
			for(WebElement ele:thirdColumnText)
			{
				String ThirdColumnText=ele.getText();
				
				System.out.println("text which are in the third column of the Webtable:"+ThirdColumnText);
			}
		}
		
		public void specificDataWebT()
		{
			String value=SpecifiValueWebTable.getText();
			System.out.println("the text which is in the webtable:"+value);
		}
		
		public void webtableValueBelongsTo()
		{
			
			
			for (WebElement row : TotalRows) {
	            List<WebElement> cols = row.findElements(By.tagName("td"));

	            if (cols.size() > 2) { 
	                String thirdColumnValue = cols.get(2).getText();

	                if (thirdColumnValue.equals("25")) {
	                    String firstColumn = cols.get(0).getText();
	                    String secondColumn = cols.get(1).getText();
	                    System.out.println(firstColumn + " - " + secondColumn);
	                }
	            }
			}
		}
	            
			
			
			
		
		
		public void scrollMouseHoverText()

        {
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView", MouseHoverText);
			
			
			
			
			}
		
		
		public void MouseHandlingDemo()
		{
			Actions act=new Actions(driver);
			
			act.moveToElement(mouseHoverBtn).moveToElement(ReloadBtnMouseHover).click().perform();
			
			System.out.println("Successfully has performed the mouse hover action on the Webpage");
			
			
			
		}
		
		
		public void getAllLinks()
		{
			int links=allLinks.size();
			System.out.println("total numbers of links which are on  the webpage");
		}
		
		public void linksTextDemo()
		{
			
			for(WebElement Li:allLinks)
			{
				
				String Links=Li.getText();
				System.out.println("total links text which are on the webtable are:"+Links);
			}
			
			
		}
		
		public void cookiesTotalDemo()
		
		{
			Set<Cookie>cookies=driver.manage().getCookies();
			System.out.println("total numbers of the cookies on the webtable are:"+cookies.size());
			
			for(Cookie c:cookies)
			{
				 System.out.println("Name: " + c.getName() + " | Value: " + c.getValue());
				
				
		}
		}
		
			
			public void iframeHandlingDemo()
			{
				
				driver.switchTo().frame(iframe);
				
				
				
				
			}
			
			public void ClickOnCourses()
			{
				coursesBtn.click();
				System.out.println("successfully cliked on the courses link after switching into the frame");
			}
			
			
//           public void frameMouseHoverDemo()
//			
//			{
//				Actions act=new Actions(driver);
//				
//				act.moveToElement(moreBtn).moveToElement(contactHover).click().perform();
//				System.out.println("mouse hover done in the iframe");
//			}
//			
			public void scrollUptoWindowText()
			{
				JavascriptExecutor js=(JavascriptExecutor)driver;
				//js.executeScript("arguments[0].scrollIntoView(true)", winowExampleText);
				//js.executeScript("arguments[0].scrollIntoView(true);", winowExampleText);
	
				
				// Scroll to bottom first
		        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		        System.out.println("Scrolled to bottom of the page");

		
				
		        // Scroll up to the element
		        js.executeScript("arguments[0].scrollIntoView(false);", winowExampleText);  
		        System.out.println("Scrolled up to the target element");
				
		        System.out.println("scrolled the page to perform the window operation");
			}
			
			
			
			public void checkBrokenLinks() {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

			    List<WebElement> links = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.tagName("a")));

			    if (links.isEmpty()) {
			        System.out.println("⚠️ No links found on the page!");
			        return;
			    }

			    System.out.println("Total Links Found: " + links.size());

			    for (int i = 0; i < links.size(); i++) {
			        try {
			            links = driver.findElements(By.tagName("a")); // ✅ Refresh list
			            WebElement link = links.get(i);

			            String url = link.getAttribute("href");

			            if (url != null && !url.isEmpty()) {
			                verifyLink(url);
			            } else {
			                System.out.println("⚠️ Skipping empty or null link");
			            }
			        } catch (StaleElementReferenceException e) {
			            System.out.println("🔄 Stale Element Found, Retrying...");
			            i--; // ✅ Retry the same index
			        } catch (IndexOutOfBoundsException e) {
			            System.out.println("❌ Index Out of Bounds: Skipping invalid index");
			        }
			    }
			}
		    // Method to verify if a link is broken
		    public void verifyLink(String linkUrl) {
		        try {
		            URL url = new URL(linkUrl);
		            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		            connection.setRequestMethod("HEAD");
		            connection.connect();

		            int responseCode = connection.getResponseCode();

		            if (responseCode >= 400) {
		                System.out.println("❌ Broken Link: " + linkUrl + " - Response Code: " + responseCode);
		            } else {
		                System.out.println("✅ Valid Link: " + linkUrl + " - Response Code: " + responseCode);
		            }
		        } catch (IOException e) {
		            System.out.println("⚠️ Exception Checking URL: " + linkUrl + " - " + e.getMessage());
		        }
		    }
		    
		    public void scrollThePageDemo()
		    {
		    	
		    	JavascriptExecutor js=(JavascriptExecutor)driver;
		    	
		    	//js.executeScript(window.scrollTo(0, document.body.scrollHeight);
		    	
		    	js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		    	
		    	
		    	
		    	
		    		
		    		
		    	}
		    
		    public void averageOfColumnDemo()
		    {
		    	
		    	int sum=0;
		    	 
		    	int count = ThirdColumnValue.size(); 

		         
		    	
		    	 for (WebElement priceElement : ThirdColumnValue) {
		             int price = Integer.parseInt(priceElement.getText().trim());
		             sum += price;
		         }
		    	 
		    	// Calculate average
		         double average = (double) sum / count;

		         // Print results
		         System.out.println("Total Sum: " + sum);
		         System.out.println("Average Price: " + average);
		    	
		    	
		    	
		    	
		    	
		    }
}



			

			
		
			
			
			
			
		
	
			
		





	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

