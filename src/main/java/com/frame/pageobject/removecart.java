package com.frame.pageobject;

import org.openqa.selenium.WebDriver;

import com.frame.reusable.BaseCases;
import com.frame.uistore.ContactusStore;

public class removecart extends BaseCases{
	
	ContactusStore ct = new ContactusStore();
	public void remove_cart(WebDriver driver)
	{
		driver.navigate().to(browserURL);
	    driver.findElement(ct.rcart).click();	
	}

}
