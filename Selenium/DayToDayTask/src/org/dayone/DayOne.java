package org.dayone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class DayOne {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\LENOVO-HOMEPC\\Selenium\\DayToDayTask\\Drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
			Thread.sleep(3000);
		
		driver.get("https://www.facebook.com");
		
		
		driver.get("https://www.amazon.in");
		
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		
		
		
		
		
		
	}

	

}
