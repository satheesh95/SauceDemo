package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.project.sauceDemo.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(id = "user-name")WebElement userNameInputBox;
	@FindBy(id = "password")WebElement passwordInputBox;
	@FindBy(id = "login-button")WebElement loginButton;
	
	public LoginPage(){
		
		PageFactory.initElements(driver, this);
		
	}
	public HomePage login(String username, String password){
		
		userNameInputBox.sendKeys(username);
		passwordInputBox.sendKeys(password);
		loginButton.click();
		return new HomePage();
	}
}
