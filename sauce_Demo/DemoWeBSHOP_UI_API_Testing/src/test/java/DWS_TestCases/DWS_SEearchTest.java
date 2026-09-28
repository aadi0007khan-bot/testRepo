package DWS_TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import DWC_Pages.DWS_HomePage;

public class DWS_SEearchTest {
@Test
public void TC1() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	
	//create an object of Home Page and call the methods
	DWS_HomePage homepage=new DWS_HomePage(driver);
	homepage.enterSearchText("mobiles");
	homepage.clicksearchButton();
	driver.close();
}
}
