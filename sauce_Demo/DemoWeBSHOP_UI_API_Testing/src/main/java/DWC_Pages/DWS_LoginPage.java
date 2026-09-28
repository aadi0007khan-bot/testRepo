package DWC_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWS_LoginPage {
//constructor
	public DWS_LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//WebElement
	@FindBy(id="Email")
	WebElement username;
	
	@FindBy(name="Password")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Log in']")
	WebElement loginButton;
	
	//Actions or methods of WebElements
	public void enterUsername(String usernameval) {
		username.sendKeys(usernameval);
	}
	public void enterPassword(String passwordval) {
		password.sendKeys(passwordval);
	}
	public void clickLoginButton() {
		loginButton.click();
	}

}
