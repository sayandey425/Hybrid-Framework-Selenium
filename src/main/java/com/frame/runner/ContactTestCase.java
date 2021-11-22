package com.frame.runner;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.frame.pageobject.CartItem;
import com.frame.pageobject.GiftCard;
import com.frame.pageobject.HomePage;
import com.frame.pageobject.SearchBox;
import com.frame.pageobject.SigninPage;
import com.frame.pageobject.WhatsNew;
import com.frame.pageobject.removecart;
import com.frame.reusable.BaseCases;
import com.frame.runner.CustomListen;
import com.frame.uistore.ContactusStore;
import com.frame.utilities.ExcelUtility;




@Listeners(CustomListen.class)
public class ContactTestCase extends BaseCases {
	
	
	ContactusStore ct = new ContactusStore();
	HomePage hp = new HomePage();
	CartItem ci = new CartItem();
	SearchBox sb = new SearchBox();
	WhatsNew wn = new WhatsNew();
	removecart rc = new removecart();
	GiftCard gc = new GiftCard();
	SigninPage sp = new SigninPage();
	
	@Test(priority=1)
	public void WebsiteLanding()
	{
		hp.OpenBrowser(driver);
		String title = driver.getTitle();
		System.out.println(title);
		//Validating the title of the website 
		if(title.equalsIgnoreCase("Gifts Online - Send Unique, Unusual Gifts in India, Buy Gifts– Bigsmall.in"))
		{
			logger.info("User is on correct WebPage");
			System.out.println("Website is Validate");
			System.out.println("---------------------------------------------------------------");
			System.out.println("\n");
		}
		
		
	}
	
	@Test(priority=2)
	public void Add_item_to_cart() throws InterruptedException 
	{
		ci.shp(driver);
		
		driver.findElement(ct.TravelGifts).click();
		Thread.sleep(3000);
		driver.findElement(ct.Item).click();
		Thread.sleep(3000);
		driver.findElement(ct.Cart).click();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(ct.itemCart).isDisplayed());
		boolean display = driver.findElement(ct.itemCart).isDisplayed();
	    
		System.out.println(display);
		
		System.out.println("Add_item_to_cart : Test has passed");
		
		
		System.out.println("---------------------------------------------------------------");
		System.out.println("\n");
		
	}
	
	@Test(priority=3)
	public void Verify_the_Item_on_the_Cart()
	{
		String itemName = driver.findElement(ct.itemCart).getText();
		
		if(itemName.equalsIgnoreCase("3D Plush Frog Eye Mask"))
		{
			logger.info("The selected item is in the cart");
			System.out.println("TestCase :Verify_the_Item_on_the_Cart  Succefull ");
			System.out.println("---------------------------------------------------------------");
			System.out.println("\n");
		}
		
	}
	
	@Test(priority=4)
	public void Search_Boxdropdown_validation()
	{
		sb.clickonSearchbox(driver);
		String mgifts = driver.findElement(ct.men_gifts).getText();
		
		if(mgifts.equalsIgnoreCase("Birthday gifts for men"))
		{
			logger.info("User on correct page");
			System.out.println("TestCase :Verify_the_Item_on_the_Cart  Succefull ");
			System.out.println("---------------------------------------------------------------");
			System.out.println("\n");
			
		}
	}
	
	@Test(priority=5)
	public void Feature_Validation_1and2()
	{
		wn.clickonWhatsNew(driver);
		String wntext = driver.findElement(ct.wnpage).getText();
		System.out.println(wntext);
		
		if(wntext.equalsIgnoreCase("What'S New"))
		{
			logger.info("User is What'S New PAage");
			
			System.out.println("TestCase :Feature_Validation_1  Succefull ");
			System.out.println("---------------------------------------------------------------");
			System.out.println("\n");
		}
	}
	
	@Test(priority=6)
	public void  Wishlist_Validation() throws InterruptedException
	{
		driver.findElement(ct.Bobblehead).click();
		Thread.sleep(4000);
		driver.findElement(ct.wishlist).click();
		Thread.sleep(3000);
		driver.findElement(ct.wishlistmenu).click();
		Thread.sleep(3000);
		driver.findElement(ct.access).click();
		Thread.sleep(3000);
		String addset = driver.findElement(ct.add).getText();
		System.out.println(addset);
	}
	
	@Test(priority=7)
	public void Cart_feature_validation() throws InterruptedException
	{
		rc.remove_cart(driver);
		Thread.sleep(3000);
		driver.findElement(ct.removeButton).click();
		Thread.sleep(3000);
		String emptycart = driver.findElement(ct.cartEmpty).getText();
		
		if(emptycart.equalsIgnoreCase("Your cart is currently empty."))
		{
			logger.info("Remove Feature is succesfully validated");
			System.out.println("TestCase :Cart_feature_validation  Succefull ");
			System.out.println("---------------------------------------------------------------");
			System.out.println("\n");
		}
	}
	
	@Test(priority=8)
	public void Gift_Card_validation()
	{
		gc.giftcard(driver);
		
		String card = driver.findElement(ct.rupees).getText();
		
		if(card.equalsIgnoreCase("Rs. 500"))
		{
			logger.info("giftcard features succesfully validate");
			
			System.out.println("TestCase :Gift_Card_validation  Succefull ");
			System.out.println("---------------------------------------------------------------");
			System.out.println("\n");
		}
	}
	
	@Test(priority=9)
	public void sign_in_page_validation1() throws IOException, InterruptedException
	{
		sp.sign(driver);
		
		ExcelUtility el = new ExcelUtility();
		ArrayList<String>data = el.getData("a");
		System.out.println(data.size());
		
		String mail1 = (String) data.get(1);
		String pass1 = data.get(2);
		driver.findElement(ct.mail).sendKeys(mail1);
		driver.findElement(ct.pass).sendKeys(pass1);
		Thread.sleep(3000);
		driver.findElement(ct.signin).click();
		
		
	}
	
	@Test(priority=10)
	public void sign_in_page_validation2()
	{
		sp.forget(driver);
		
		String reset = driver.findElement(ct.reset).getText();
		System.out.println(reset);
		
		if(reset.equalsIgnoreCase("Reset your password"))
		{
			logger.info("User is on Reset Password Page");
			System.out.println("TestCase :sign_in_page_validation2  Succefull ");
			System.out.println("---------------------------------------------------------------");
			System.out.println("\n");
		}
	}
}
