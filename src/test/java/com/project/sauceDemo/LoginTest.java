package com.project.sauceDemo;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends TestBase{
	LoginPage lp;
	HomePage hp;
	
	@BeforeTest
	public void OpenBrowser() throws IOException{
		
		initializeDriver();
		lp = new LoginPage();
		
	}
	
	@Test
	public void performLogin(){
		
		hp = lp.login("standard_user", "secret_sauce");
	}
	
	@AfterTest
	public void tearDown(){
		
		driver.close();
		
	}
}
