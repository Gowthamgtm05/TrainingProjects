package org.daytwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {

public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\LENOVO-HOMEPC\\Selenium\\DayToDayTask\\Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
	
		driver.get("https://google.com/");
	
		WebElement searchBox = driver.findElement(By.xpath("//input[@class = 'gLFyf gsfi']"));
		searchBox.sendKeys("GreensTech");
		
		Thread.sleep(3000);
		
		WebElement result = driver.findElement(By.xpath("//span[contains(text(),'Greens')]"));
		result.click();
		
		
		
		
		
		
		
	}
}
