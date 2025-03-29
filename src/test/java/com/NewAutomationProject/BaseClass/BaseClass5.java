package com.NewAutomationProject.BaseClass;



	import java.io.File;
import java.io.FileReader;
	import java.io.IOException;
	import java.text.SimpleDateFormat;
	import java.time.Duration;
	import java.util.Date;
	import java.util.Properties;

	import org.apache.logging.log4j.LogManager;
	import org.apache.logging.log4j.Logger;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class BaseClass5 {
		
		public WebDriver driver;
	    //C:\Users\a2z\eclipse-workspace\NewAutomationProject\src\test\resources\config.properties
	public Properties pf;
	public Logger log;
	@BeforeClass
//	@Parameters("browser")
	public void setupData() throws IOException {

	FileReader file=new FileReader(".//src/test/resources/config.properties");
	pf=new Properties();
	pf.load(file);

	log=LogManager.getLogger(this.getClass());

	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();

//	switch(br.toLowerCase())
//	{
//	case "chrome":WebDriverManager.chromedriver().setup();
//	driver=new ChromeDriver();
//	break;
//
//	
//	case "edge":WebDriverManager.edgedriver().setup();
//	driver=new EdgeDriver();
//	break;
//	
// default: System.out.println("No Matching browser found");
//	return;
//	}
	
	//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
driver.get(pf.getProperty("url"));
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

}
	
@AfterClass
public void tearDownBrowser()
{
driver.quit();
}


//DataProvider is used to achieve the data driven testing
//@DataProvider(name="loginData")
//public String[][] loginDataProvider() {
//    String data[][] = {
//        {"sachshelpat@gmail.com"},
//        {"ramdasshelke638@gmail.com"},
//        {"sachinshelke1123@gmail.com"}
//    };
//    return data;
//}
//
//	}

public String captureScreenshot(String tname) {


String timeStamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
TakesScreenshot takesScreenShot=(TakesScreenshot)driver;
File sourceFile=takesScreenShot.getScreenshotAs(OutputType.FILE);

String targetFilePath=System.getProperty("user.dir")+"\\Screenshots\\"+tname+"_"+timeStamp+".png";

File targetFile=new File(targetFilePath);
sourceFile.renameTo(targetFile);
return targetFilePath;





	
}
	}
	




	


	
	
	
