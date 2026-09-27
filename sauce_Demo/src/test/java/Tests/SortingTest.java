package Tests;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.InventoryPage;
import Pages.LoginPage;

public class SortingTest {

	WebDriver driver;
	InventoryPage inventoryPage;

	@BeforeMethod
	public void setup() {

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.saucedemo.com/");

		LoginPage loginPage = new LoginPage(driver);

		loginPage.login("standard_user", "secret_sauce");

		inventoryPage = new InventoryPage(driver);
	}

	@Test
	public void verifyPriceLowToHigh() {

		inventoryPage.sortBy("Price (low to high)");

		List<Double> actual = inventoryPage.getProductPrices();

		List<Double> expected = new ArrayList<>(actual);

		Collections.sort(expected);

		Assert.assertEquals(actual, expected, "Products are NOT sorted Low to High");
	}
}