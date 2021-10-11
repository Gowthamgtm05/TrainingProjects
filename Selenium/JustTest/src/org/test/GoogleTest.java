package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleTest {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\LENOVO-HOMEPC\\Selenium\\JustTest\\Drivers\\geckodriver.exe");
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO-HOMEPC\\Selenium\\JustTest\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(3000);
		WebElement icn = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[2]/div/div/div/a/svg/path"));
		icn.click();
		Thread.sleep(3000);
		
		WebElement icon = driver.findElement(By.xpath("//a[@class='tX9u1b']//child::span[contains(text(),'Travel')]"));
		icon.click();
	}

}
