package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\LENOVO-HOMEPC\\Selenium\\JustTest\\Drivers\\geckodriver.exe");
		
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.makemytrip.com/flight/search?itinerary=DEL-BLR-15/07/2021&tripType=O&paxType=A-1_C-0_I-0&intl=false&cabinClass=E&ccde=IN&lang=eng");
	
//	WebElement findRef = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
//	
//	findRef.click();
//	
//	WebElement refName = driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")) ;
//	
//		refName.click();
//	
//			Alert al = driver.switchTo().alert();
//			
//			Thread.sleep(5000);
//			
//			al.dismiss();''
	
	WebElement time = driver.findElement(By.xpath("//span[starts-with(text(),'14:20')]"));
	
	


	}
	

}
