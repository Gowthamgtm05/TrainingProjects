package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO-HOMEPC\\Selenium\\JustTest\\Drivers\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_ESCAPE);
//		r.keyRelease(KeyEvent.VK_ESCAPE);
//		
//		Thread.sleep(3000);
		WebElement electronics = driver.findElement(By.xpath("(//div[@class='eFQ30H'][4]//following-sibling::div[@class='eFQ30H'])[1]//descendant::img"));
		electronics.click();
		
		electronics.getText();
		
//		List<WebElement> iphoneCounts = driver.findElements(By.xpath("(//span[@class='a-price-whole']//ancestor::span[@class='a-price']//following-sibling::span[@class='a-price a-text-price']//child::span[@class='a-offscreen'])"));
	
	
	}
}