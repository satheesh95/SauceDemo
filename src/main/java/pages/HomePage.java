package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.project.sauceDemo.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(id = "add-to-cart-sauce-labs-backpack")WebElement addToCart;
	@FindBy(xpath = "//a[@class = 'shopping_cart_link']")WebElement cartLink;
	
	public HomePage(){
		
		PageFactory.initElements(driver, this);
		
	}
	public void addToCart(){
		
		addToCart.click();
		
	}
	public ItemsCartPage goToCart(){
		
		cartLink.click();
		return new ItemsCartPage();
	} 
}


