package SeleniumBasics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Working_With_ScreenShot_Webelement {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	
	//SEarch texrt Field
	WebElement searchtxt=driver.findElement(By.id("small-searchterms"));
	searchtxt.sendKeys("mobiles");
	//type casting
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File srcfile=searchtxt.getScreenshotAs(OutputType.FILE);
	String dateTime = LocalDateTime.now()
	        .format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss"));
	
	File destfile=new File("./ScreenShot/searchfield"+dateTime+".png");
	FileHandler.copy(srcfile, destfile);
	System.out.println("ScreenShot of searchtxt was successfull");
	driver.quit();
}
}
