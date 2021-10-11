package org.daytwo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HdfcBank {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\LENOVO-HOMEPC\\Selenium\\DayToDayTask\\Drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
//		driver.manage().window().maximize();
		
//		Thread.sleep(3000);
		
		List<WebElement> frames = driver.findElements(By.tagName("frame"));
		int size = frames.size();
		System.out.println(size);
		
		driver.switchTo().frame(0);
		
		WebElement custId = driver.findElement(By.name("fldLoginUserId"));
		
		
		custId.sendKeys("76247646");
		
	}
	
}
