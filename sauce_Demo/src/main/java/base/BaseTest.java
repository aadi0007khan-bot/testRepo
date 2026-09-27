package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Pages.LoginPage;
import utilities.Utilities;

public class BaseTest {

	protected WebDriver driver;

	@BeforeMethod
	public void setup() {

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.saucedemo.com/");

		LoginPage loginPage = new LoginPage(driver);

		loginPage.login("standard_user", "secret_sauce");
	}

	@AfterMethod
	public void tearDown(ITestResult result) {

		// Screenshot ONLY when test fails
		if (result.getStatus() == ITestResult.FAILURE) {

			Utilities.captureScreenshot(driver, result.getName());
		}

		driver.quit();
	}
}