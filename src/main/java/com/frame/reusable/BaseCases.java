package com.frame.reusable;



import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;


import com.frame.utilities.ExcelUtility;
import com.frame.utilities.ReadConfig;





public class BaseCases {
 
 //Decalir variables that are common .
	
	ReadConfig rf = new ReadConfig();
	
	
	
	public String browserURL = rf.getURL();
	public String chromepath = rf.chromepath();
	public String google = rf.getchrome();
	protected static WebDriver driver;
	public static Logger logger;
	
	
	//"webdriver.chrome.driver"
	
	@BeforeClass
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", chromepath);
		driver=new ChromeDriver();
		
		logger = Logger.getLogger("FrameeorkPractise");
		PropertyConfigurator.configure("Log4j.properties");
		
	}
	
	
    
	
	/*@AfterClass
	public void close()
	{
		driver.quit();
	}*/
}
