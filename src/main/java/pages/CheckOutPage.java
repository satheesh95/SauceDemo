package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.project.sauceDemo.TestBase;

public class CheckOutPage extends TestBase{
	
	@FindBy(id = "finish")WebElement finishButton;
	@FindBy(xpath = "//h2[@class='complete-header']")WebElement orderMessage;
	
	public CheckOutPage(){
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickFinishButton(){
		
		finishButton.click();
		
	}
	public void message(){
		String expectedText = prop.getProperty("message");
		String actualtext = orderMessage.getText();
		System.out.println(actualtext);
		Assert.assertEquals(expectedText, actualtext);
	}
}
