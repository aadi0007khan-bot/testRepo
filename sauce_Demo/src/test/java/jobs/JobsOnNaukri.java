package jobs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JobsOnNaukri {
public static void main(String[] args) throws Exception {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.linkedin.com");
	driver.findElement(By.xpath("//span[contains(text(),'Jobs')]")).click();
	Thread.sleep(8000);
	driver.quit();
}
}
