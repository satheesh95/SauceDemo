package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.project.sauceDemo.TestBase;

public class ItemsCartPage extends TestBase {
	
	@FindBy(id = "checkout")WebElement checkoutButton;
	
	public ItemsCartPage(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	public CustomerDetailsPage clickCheckout(){
		
		checkoutButton.click();
		return new CustomerDetailsPage();
		
	}
}
