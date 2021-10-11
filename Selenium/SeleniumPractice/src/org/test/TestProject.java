package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestProject {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\LENOVO-HOMEPC\\Selenium\\SeleniumPractice\\Drivers\\geckodriver.exe");
		
		//Browser COnfiguration
		
		WebDriver driver = new FirefoxDriver();
		
		
		// To Open the URl 
		
		driver.get("https://google.com");
		
	}
	

}
