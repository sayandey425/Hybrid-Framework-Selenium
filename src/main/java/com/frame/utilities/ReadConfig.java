package com.frame.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;//object for the properties class
	
	public ReadConfig()
	{
		File src = new File("./TestData\\config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch(Exception e)
		{
			System.out.println("No Such File to read Found .");
		}
	}
	
	public String getURL()
	{
		String URL = pro.getProperty("browserURL");
		return URL;
	}
	
	public String chromepath()
	{
		String chrpath = pro.getProperty("chromepath");
		return chrpath; 
	}
	
	public String getchrome()
	{
		String google = pro.getProperty("https://www.google.co.in/");
		return google;
		
	}
}
