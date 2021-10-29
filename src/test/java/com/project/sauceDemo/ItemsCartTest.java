package com.project.sauceDemo;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CustomerDetailsPage;
import pages.HomePage;
import pages.ItemsCartPage;
import pages.LoginPage;

public class ItemsCartTest extends TestBase {
	
	LoginPage lp;
	HomePage hp;
	ItemsCartPage ip;
	CustomerDetailsPage cd;
	
	@BeforeTest
	public void openBrowser() throws IOException{
		
		initializeDriver();
		lp = new LoginPage();
		hp = lp.login();
		ip = hp.goToCart();
	}
	
	@Test
	public void clickCheckOut(){
		
		cd = ip.clickCheckout();
		
	}
	
	@AfterTest
	public void tearDown(){
		
		driver.close();
		
	}
}
