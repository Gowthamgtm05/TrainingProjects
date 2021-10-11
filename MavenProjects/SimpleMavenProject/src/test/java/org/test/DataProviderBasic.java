package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderBasic {
	
	String [][] data = {
			{"admin","ad123"},
			{"Admin","dummy"},
			{"Admi","admin"},
			{"Admin","admin123"}
			};
	
	@DataProvider(name="logindata")
		public String[][] dataProvider() {
		
		return data;
	}
	
	@Test(dataProvider = "logindata")
	public void loginFunctionality(String userName,String password) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		WebElement txtUsername = driver.findElement(By.id("txtUsername"));
		txtUsername.sendKeys(userName);
		System.out.println(txtUsername.getAttribute(userName));
		
		WebElement txtPassword = driver.findElement(By.id("txtPassword"));
		txtPassword.sendKeys(password);
		System.out.println(txtPassword.getAttribute(password));
		
		WebElement txtButton = driver.findElement(By.id("btnLogin"));
		txtButton.click();
		
		driver.close();
		
		
		
	}
	

}
