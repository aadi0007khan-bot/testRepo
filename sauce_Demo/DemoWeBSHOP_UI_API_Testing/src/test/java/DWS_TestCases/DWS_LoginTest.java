package DWS_TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import DWC_Pages.DWS_HomePage;
import DWC_Pages.DWS_LoginPage;

public class DWS_LoginTest {
@Test
public void TC3() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	
	//create an object of Home Page 
	DWS_HomePage homepage=new DWS_HomePage(driver);
	homepage.clickLoginLink();
	//create an object of Login page
	DWS_LoginPage loginpage=new DWS_LoginPage(driver);
	loginpage.enterUsername("ram@kmail.com");
	loginpage.enterPassword("manager");
	loginpage.clickLoginButton();
	
	driver.close();
}
}
