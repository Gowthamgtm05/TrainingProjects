package org.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class First {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\LENOVO-HOMEPC\\Selenium\\SeleniumPractice\\Drivers\\geckodriver.exe");
		
		WebDriver f = new FirefoxDriver();
		
		f.manage().window().maximize();
		
		f.get("https://www.facebook.com");
		
		WebElement lang = f.findElement(By.xpath("//a[contains(@href,'en-gb')]"));
		
		lang.click();
		
		
				
	}

}
