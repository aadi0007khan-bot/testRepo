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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Working_with_ScreenShot {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	//typecasting
	TakesScreenshot tks=(TakesScreenshot)driver;
	//temp location
	File srcfile=tks.getScreenshotAs(OutputType.FILE);
	String dateTime=LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss"));
	
	File destfile=new File("./ScreenShot/Homepage"+dateTime+ ".png");
	FileHandler.copy(srcfile,destfile);

	driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
	driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	//screenshot after clicking on search
	
	File src=tks.getScreenshotAs(OutputType.FILE);
	File dest=new File("./ScreenShot/SearchPage.png");
	FileHandler.copy(src, dest);
	
	driver.quit();
			
	
}
}
