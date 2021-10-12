package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Second {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\LENOVO-HOMEPC\\eclipse\\SeleniumFirstDay\\Drivers\\geckodriver.exe");
		
		WebDriver var = new FirefoxDriver();
		
		var.get("http://greenstech.in/selenium-course-content.html");
	
	}

}

