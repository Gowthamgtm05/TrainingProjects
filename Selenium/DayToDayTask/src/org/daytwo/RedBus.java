package org.daytwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RedBus {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\LENOVO-HOMEPC\\Selenium\\DayToDayTask\\Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
	
		driver.get("https://www.redbus.in/");
		
		WebElement fromTxtBox = driver.findElement(By.id("src"));
		fromTxtBox.sendKeys("Chennai");
		
		WebElement toTxtBox = driver.findElement(By.id("dest"));
		toTxtBox.sendKeys("Trichy");
		
		
		
		
		
	
	}
	

}
