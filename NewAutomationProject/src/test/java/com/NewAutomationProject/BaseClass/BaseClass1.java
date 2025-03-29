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
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {
public WebDriver driver;
	
  
	@BeforeClass
	
	public void setUp() throws IOException {
		//WebDriverManager.chromedriver().setup();
		// driver=new ChromeDriver();
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		 driver.get("https://demo.opencart.com/index.php?route=account/logout&language=en-gb");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	@AfterClass
	public void closeBrowser() {
		
		driver.quit();
	}
	
	
		
	}





