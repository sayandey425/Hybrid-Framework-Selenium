package com.frame.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.frame.reusable.BaseCases;
import com.frame.uistore.ContactusStore;

   public class CartItem extends BaseCases {

	   
	   
	ContactusStore ct = new ContactusStore();
	
	 public void shp(WebDriver driver) throws InterruptedException 
	 {
	    Actions a=new Actions(driver);
	    a.moveToElement(driver.findElement(ct.ShopByCategory)).build().perform();
		Thread.sleep(3000);
	 }
}
