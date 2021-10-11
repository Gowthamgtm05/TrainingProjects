package org.daytwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBook {
	
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\LENOVO-HOMEPC\\Selenium\\DayToDayTask\\Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement txtEmail = driver.findElement(By.name("email"));
		txtEmail.sendKeys("Hello");
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("Password");
		
		WebElement hideIcon = driver.findElement(By.className("_9luh"));
		hideIcon.click();
		
		
		WebElement btnLogin = driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
		btnLogin.click();
		
		
	}

}
