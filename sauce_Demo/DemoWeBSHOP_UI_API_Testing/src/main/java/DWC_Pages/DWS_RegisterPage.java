package DWC_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWS_RegisterPage {
//constructor
	public DWS_RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="gender-male")
	WebElement gender;
	
	@FindBy(name="FirstName")
	WebElement firstname;

@FindBy(id="LastName")
WebElement lastName;

@FindBy(id="Email")
WebElement email;

@FindBy(id="Password")
WebElement password;

@FindBy(id="ConfirmPassword")
WebElement confirmpassword;

@FindBy(name="register-button")
WebElement registerbutton;

public void clickGender() {
	gender.click();
}
public void enterFirstName(String firstnameval) {
	firstname.sendKeys(firstnameval);
}
public void enterLastName(String lastNameval) {
	lastName.sendKeys(lastNameval);
}
public void enterEmail(String emailval) {
	email.sendKeys(emailval);
}
public void enterPassword(String passwordval) {
	password.sendKeys(passwordval);
}
public void enterConfirmPassword(String confirmpasswordval) {
	confirmpassword.sendKeys(confirmpasswordval);
}
public void clickRegisterButton() {
	registerbutton.click();
}

}