package DWS_TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import DWC_Pages.DWS_HomePage;
import DWC_Pages.DWS_RegisterPage;

public class DWS_RegisterTest {
@Test
public void TC2() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	
	//create an object of Home Page and call the methods
	DWS_HomePage homepage=new DWS_HomePage(driver);
	homepage.clickRegisterLink();
	//create an Object of registerPage
	DWS_RegisterPage registerpage=new DWS_RegisterPage(driver);
	registerpage.clickGender();
	registerpage.enterFirstName("Raka");
	registerpage.enterLastName("khan");
	registerpage.enterEmail("ram@kmail.com");
	registerpage.enterPassword("manager");
	registerpage.enterConfirmPassword("manager");
	registerpage.clickRegisterButton();
	
	Thread.sleep(3000);
	driver.close();
}
}
