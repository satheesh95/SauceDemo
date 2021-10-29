package com.project.sauceDemo;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CheckOutPage;
import pages.CustomerDetailsPage;
import pages.HomePage;
import pages.ItemsCartPage;
import pages.LoginPage;

public class CustomerDetailsTest extends TestBase{
	
	LoginPage lp;
	HomePage hp;
	ItemsCartPage ip;
	CustomerDetailsPage cd;
	CheckOutPage cp;
	
	
	@BeforeTest
	public void openBrowser() throws IOException{
		
		initializeDriver();
		lp = new LoginPage();
		hp = lp.login();
		ip = hp.goToCart();
		cd = ip.clickCheckout();
		
	}
	
	@Test
	public void enterCustomerDetails(String fname,String lname,String pin){
		
		cp = cd.fillCustomerDetails();
	}
	
	@AfterTest
	public void tearDown(){
		
		driver.close();
		
	}

}
