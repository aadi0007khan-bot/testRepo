package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class InventoryPage {

	private WebDriver driver;

	private By sortDropdown = By.className("product_sort_container");

	private By productNames = By.className("inventory_item_name");

	private By productPrices = By.className("inventory_item_price");

	public InventoryPage(WebDriver driver) {
		this.driver = driver;
	}

	public void sortBy(String visibleText) {

		WebElement dropdown = driver.findElement(sortDropdown);

		Select select = new Select(dropdown);

		select.selectByVisibleText(visibleText);
	}

	public List<String> getProductNames() {

		List<String> names = new ArrayList<>();

		List<WebElement> elements = driver.findElements(productNames);

		for (WebElement element : elements) {
			names.add(element.getText());
		}

		return names;
	}

	public List<Double> getProductPrices() {

		List<Double> prices = new ArrayList<>();

		List<WebElement> elements = driver.findElements(productPrices);

		for (WebElement element : elements) {

			String price = element.getText().replace("$", "");

			prices.add(Double.parseDouble(price));
		}

		return prices;
	}
}