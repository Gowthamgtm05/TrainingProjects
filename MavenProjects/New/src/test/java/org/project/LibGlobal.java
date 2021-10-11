package org.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal  {

	static WebDriver driver;
	
	public static void browserConfig() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void launch(String url) {
		driver.get(url);
	}

	public static void textBox(WebElement element, String text) {
		element.sendKeys(text);
	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void close() {
		driver.close();
	}
	public static void quit() {
		driver.quit();
	}
}