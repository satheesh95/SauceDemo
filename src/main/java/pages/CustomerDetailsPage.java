package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.project.sauceDemo.TestBase;

public class CustomerDetailsPage extends TestBase {
	
	
	@FindBy(id = "first-name")WebElement firstNameInputBox;
	@FindBy(id = "last-name")WebElement lastNameInputBox;
	@FindBy(id = "postal-code")WebElement postalCodeInputBox;
	@FindBy(xpath = "//input[@id='continue']")WebElement continueButton;
	
	public CustomerDetailsPage(){
		
		PageFactory.initElements(driver, this);
		
	}
	public CheckOutPage fillCustomerDetails(){
		String fname = prop.getProperty("fname");
		String lname = prop.getProperty("lname");
		String pin = prop.getProperty("pin");
		
		firstNameInputBox.sendKeys(fname);
		lastNameInputBox.sendKeys(lname);
		postalCodeInputBox.sendKeys(pin);
		continueButton.click();
		return new CheckOutPage();
		
	}
}
