package Selenium.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstRun {

	
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahb\\eclipse-workspace\\Practice\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.quit();
	}
}
