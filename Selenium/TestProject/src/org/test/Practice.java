package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice {
	public static void main(String[] args)  {
		

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\LENOVO-HOMEPC\\Selenium\\TestProject\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");

		WebElement name = driver.findElement(By.name("firstname"));
		name.sendKeys("Hello");
		WebElement lName = driver.findElement(By.name("lastname"));
		lName.sendKeys("Friend");
		
		WebElement gender = driver.findElement(By.xpath("//input[@value='Male']"));
		gender.click();
		
		driver.findElement(By.xpath("//strong[contains(text(),'Years ')]//parent::td//following-sibling::td//child::input[@value='1']")).click();
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("12/12/2021");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement scrol = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[4]/div/form/table/tbody/tr[6]/td[1]/strong"));
		js.executeScript("arguments[0].scrollIntoView(true)", scrol);
		
		WebElement checkBox = driver.findElement(By.xpath("//input[@value='Automation Tester']"));
		checkBox.click();
	}

}
