package org.just;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class JustTest {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\LENOVO-HOMEPC\\Selenium\\SeleniumPractice\\Drivers\\geckodriver.exe");
	
		WebDriver f = new FirefoxDriver();
		
		f.get("https://www.google.com");
		
		WebElement he = f.findElement(By.xpath("//input[@type='text']"));
			he.sendKeys("what is selenium");
			
			Robot t = new Robot();
			t.keyPress(KeyEvent.VK_ENTER);
			t.keyRelease(KeyEvent.VK_ENTER);
			
//			Thread.sleep(2000);
			
			WebElement text11 = f.findElement(By.xpath("//input[@type=('text')])[1])"));
			
			String tury = text11.getText();
			System.out.println(tury);
			
			
//			f.quit();
			
//			String text = he.getText();
//			System.out.println(text);
//			
			
			
	}
	
	
	
}
