package com.frame.pageobject;

import org.openqa.selenium.WebDriver;

import com.frame.reusable.BaseCases;

public class HomePage extends BaseCases {

	public void OpenBrowser(WebDriver driver)
	{
		driver.get(browserURL);
		driver.manage().window().maximize();
	}
	
	
}
