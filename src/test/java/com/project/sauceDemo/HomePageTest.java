package com.project.sauceDemo;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.ItemsCartPage;
import pages.LoginPage;

public class HomePageTest extends TestBase{
	HomePage hp;
	LoginPage lp;
	ItemsCartPage ip;
	
	@BeforeTest
	public void openBrowser() throws IOException{
		
		initializeDriver();
		lp = new LoginPage();
		hp = lp.login();
		
	}
	
	@Test
	public void addItemsToCart(){
		
		hp.addToCart();
		ip = hp.goToCart();
	}
	
	@AfterTest
	public void teraDown(){
		
		driver.close();
		
	}
	
}
