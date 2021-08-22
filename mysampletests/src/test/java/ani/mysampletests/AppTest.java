package ani.mysampletests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class AppTest 
{
	@Test
	public void openGoogleChrome() {
		WebDriver webDriver;
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		options.addArguments("disable-gpu");
		webDriver = new ChromeDriver(options);
		webDriver.get("https://www.google.com");
		System.out.println("Title of Page is: " + webDriver.getTitle());
	}
}
