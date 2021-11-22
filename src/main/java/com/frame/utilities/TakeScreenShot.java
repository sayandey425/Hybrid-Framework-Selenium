package com.frame.utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.frame.reusable.BaseCases;
import com.frame.runner.CustomListen;

public class TakeScreenShot extends BaseCases{

	public static  void takeSnapShotonPass(String tr) throws IOException{
		
		 Date currentdate = new Date();
	     
	     File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 try {
			FileUtils.copyFile(screenshotFile, new File(".//screenshots on Pass//"+tr+".png"));
		} catch (IOException e) {
			
			System.out.println("SS file not found");
		}
		 
		}
	
	public static  void takeSnapShotonFail(String tr) throws IOException{
		
		 Date currentdate = new Date();
	     
	     File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 try {
			FileUtils.copyFile(screenshotFile, new File(".//screenshots on Fail//"+tr+".png"));
		} catch (IOException e) {
			
			System.out.println("SS file not found");
		}
		 
		}

	 

	
	}

	



