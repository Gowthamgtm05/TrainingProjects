package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Third {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\LENOVO-HOMEPC\\eclipse\\SeleniumFirstDay\\Drivers\\geckodriver.exe");
	WebDriver hhh = new FirefoxDriver();
	hhh.get("https://facebook.com");
		
	}
}
