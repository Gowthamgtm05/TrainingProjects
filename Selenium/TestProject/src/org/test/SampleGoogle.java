package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleGoogle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO-HOMEPC\\"
				+ "Selenium\\TestProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		WebElement icon = driver.findElement(By.xpath("//*[@class='gb_Ve']"));
		icon.click();
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		WebElement scroller = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/ul[2]/li[7]/a"));
//		js.executeScript(, args)
		
		
		WebElement travel = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/ul[2]/li[16]/a"));
		
		travel.click();
			
	}
	
}
