package SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Working_With_FluentWait {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	
	WebElement searchtxt=driver.findElement(By.id("small-searchterms"));
	//Fluent wait
	FluentWait wait=new FluentWait(driver);
	wait.pollingEvery(Duration.ofSeconds(1));
	wait.withTimeout(Duration.ofSeconds(15));
	wait.until(ExpectedConditions.elementToBeClickable(searchtxt));
	driver.quit();

}
}
