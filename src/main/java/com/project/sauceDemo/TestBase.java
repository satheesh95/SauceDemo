package com.project.sauceDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	public void initializeDriver() throws IOException{
		
		String filePath = System.getProperty("user.dir");
		Properties prop = new Properties();
		FileInputStream file  = new FileInputStream(filePath+"\\src\\main\\java\\resources\\Data.properties");
		prop.load(file);
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", filePath+"\\src\\main\\java\\resources\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}else if(browserName.equals("Firefox")){
			System.setProperty("webdriver.gecko.driver", filePath+"\\src\\main\\java\\resources\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}else if(browserName.equals("Edge")){
			System.setProperty("webdriver.edge.driver", filePath+"\\src\\main\\java\\resources\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			
		}
		driver.get(prop.getProperty("Url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
