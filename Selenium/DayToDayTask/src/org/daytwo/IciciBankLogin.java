package org.daytwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IciciBankLogin {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\LENOVO-HOMEPC\\Selenium\\DayToDayTask\\Drivers\\geckodriver.exe");
	
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		
		WebElement entry = driver.findElement(By.name("DUMMY1"));
		entry.click();
		
		Thread.sleep(2000);
		
		WebElement userId = driver.findElement(By.name("AuthenticationFG.USER_PRINCIPAL"));
		userId.sendKeys("arun");
		
		WebElement pass = driver.findElement(By.className("login-input-password"));
		pass.sendKeys("Password@123");
		
		
		
	}

}
