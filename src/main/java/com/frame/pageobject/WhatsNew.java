package com.frame.pageobject;

import org.openqa.selenium.WebDriver;

import com.frame.reusable.BaseCases;
import com.frame.uistore.ContactusStore;

public class WhatsNew extends BaseCases{
     
	ContactusStore ct = new ContactusStore();
	
	public void clickonWhatsNew(WebDriver driver)
	{
		driver.navigate().to(browserURL);
		driver.findElement(ct.whatsnew).click();
	}
}
