package com.frame.pageobject;

import org.openqa.selenium.WebDriver;

import com.frame.reusable.BaseCases;
import com.frame.uistore.ContactusStore;

public class SigninPage extends BaseCases{

	ContactusStore ct = new ContactusStore();
	public void sign(WebDriver driver)
	{
	     driver.findElement(ct.sign).click();	
	}
	
	public void forget(WebDriver driver)
	{
		driver.findElement(ct.forget).click();;
	}
}
