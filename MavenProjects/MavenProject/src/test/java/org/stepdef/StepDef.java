package org.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	
	static WebDriver driver;
	
	@Given("User is on Adactin Page")
	public void a() {
		
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");

	}

	@When("User should enter credentials")
	public void b() {
		
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("Hello");
		
		WebElement passWord = driver.findElement(By.name("password"));
		passWord.sendKeys("Password@123");
	
	}

	@When("User should click Login")
	public void c() {
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
	}

	@Then("User Should Validate Credentials")
	public void d() {
	
			driver.quit();
	}
}
