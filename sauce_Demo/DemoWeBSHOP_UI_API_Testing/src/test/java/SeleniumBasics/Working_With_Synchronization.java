package SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Working_With_Synchronization {
public static void main(String[]args) throws Exception {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(3000);
	//WebDriver wait is nothing but the explicit wait
	WebElement searchtxt=driver.findElement(By.id("small-searchterms"));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
	wait.until(ExpectedConditions.elementToBeClickable(searchtxt));
	
	driver.findElement(By.id("small-searchterms")).sendKeys("computers");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(2000);
	WebElement searchpage=driver.findElement(By.xpath("//h1[text()='Search']"));
	
	//Synchronization for search txt
	wait.until(ExpectedConditions.visibilityOf(searchpage));
	
	driver.quit();
}
}
