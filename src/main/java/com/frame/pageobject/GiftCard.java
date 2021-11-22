package com.frame.pageobject;

import org.openqa.selenium.WebDriver;

import com.frame.reusable.BaseCases;
import com.frame.uistore.ContactusStore;

public class GiftCard extends BaseCases {
      
	ContactusStore ct = new ContactusStore();
	
	 public void giftcard(WebDriver driver)
	 {
		 driver.navigate().to(browserURL);
		 driver.findElement(ct.giftcard).click();
	 }
}
