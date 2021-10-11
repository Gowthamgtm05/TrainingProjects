package org.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowsExample {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\LENOVO-HOMEPC\\Selenium\\JustTest\\Drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://leafground.com/pages/Window.html");
		
		WebElement multiWind = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/button"));
		multiWind.click();
		Set<String> windowHandles = driver.getWindowHandles();
		
		for (String string : windowHandles) {
			System.out.println(string);
			WebDriver window = driver.switchTo().window("80ccf3d7-03c8-4b11-9224-6e8fe55a85ee");
			window.close();
		}
	
	}
}

