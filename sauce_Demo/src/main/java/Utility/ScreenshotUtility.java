package Utility;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtility {

	public static String capture(WebDriver driver, String testName) throws IOException {

		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		Path destination = Paths.get("screenshots", testName + ".png");

		Files.createDirectories(destination.getParent());

		Files.copy(source.toPath(), destination, java.nio.file.StandardCopyOption.REPLACE_EXISTING);

		return destination.toString();
	}
}