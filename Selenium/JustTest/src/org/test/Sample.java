package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "G:\\"+"chromedriver\\chromedriver.exe");
		
		WebDriver f = new ChromeDriver();
		
		f.get("https://www.facebook.com/");
		
		f.manage().window().maximize();
		
		f.findElement(By.id("email")).sendKeys("hello world");
		f.findElement(By.name("pass")).sendKeys("Password");
		f.findElement(By.xpath("//button[@value='1']")).click();
		
		
		
		
	}
	
	
	

}
