package DWC_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWS_HomePage {
//constructor
	public DWS_HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//WebElement
	@FindBy(id="small-searchterms")
	WebElement searchtxt;
	
	@FindBy(linkText="Register")
	WebElement registerLink;
	
	@FindBy(linkText="Log in")
	WebElement loginLink;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement searchbutton;
	
	//Actions or methods of WebElements
	public void enterSearchText(String value) {
		searchtxt.sendKeys(value);
	}
	public void clicksearchButton() {
		searchtxt.click();
	}
	public void clickRegisterLink() {
		registerLink.click();
	}
	public void clickLoginLink() {
	loginLink.click();
	}

}
