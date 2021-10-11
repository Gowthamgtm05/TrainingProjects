package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewPorject {
	
	
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.navigate().to("https://www.google.com/");
	
	driver.findElement(By.xpath("//*[@id=\"gbwa\"]/div/a")).click();
	
	Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	WebElement newOne = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/ul[1]/li[4]"));
	
	js.executeScript("arguments[0].scrollIntoView(false)", newOne);
	
	
	
	}
}
