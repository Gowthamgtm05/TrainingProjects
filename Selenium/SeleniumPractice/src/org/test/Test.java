package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {

	public static void main(String[] args) throws AWTException {
		
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\LENOVO-HOMEPC\\Selenium\\SeleniumPractice\\Drivers\\geckodriver.exe");	
	
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	
	Actions acc = new Actions(driver);
	
	
	WebElement accGmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
	acc.contextClick(accGmail).perform();
	
	Robot r = new Robot();
	
	for (int i = 1; i <= 6; i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
	}
	
	
	
	
	
	
	}
	
	
}
