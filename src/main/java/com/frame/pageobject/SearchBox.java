package com.frame.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.frame.reusable.BaseCases;
import com.frame.uistore.ContactusStore;

public class SearchBox extends BaseCases{
       
	ContactusStore ct = new ContactusStore();
	public void clickonSearchbox(WebDriver driver)
	{
		driver.navigate().to(browserURL);
		driver.findElement(ct.searchbox).sendKeys("Gifts for Sister");
		driver.findElement(ct.searchbox).sendKeys(Keys.ARROW_DOWN.ENTER);
	}
}
