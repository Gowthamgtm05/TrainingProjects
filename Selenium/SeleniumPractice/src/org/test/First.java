package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class First {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO-HOMEPC\\Selenium\\SeleniumPractice\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\LENOVO-HOMEPC\\Selenium\\SeleniumPractice\\Drivers\\geckodriver.exe");		
		WebDriver g = new ChromeDriver();
		WebDriver h = new FirefoxDriver();
		
		g.manage().window().maximize();
		h.manage().window().maximize();
		
		g.get("https://www.facebook.com");
		
		h.get("https://www.facebook.com");
		
	}
	
	
}
