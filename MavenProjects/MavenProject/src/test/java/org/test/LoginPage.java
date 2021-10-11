package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
		
	WebDriver driver;
		
	@Given("User is on Adactin Page")
	public void user_is_on_Adactin_Page() {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");

	}

	@When("User should enter credentials")
	public void user_should_enter_credentials() {
		
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("Hello");
		
		WebElement passWord = driver.findElement(By.name("password"));
		passWord.sendKeys("Password@123");
	
	}

	@When("User should click Login")
	public void user_should_click_Login() {
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
	}

	@Then("User Should Validate Credentials")
	public void user_Should_Validate_Credentials() {
		
		driver.quit();
	}
	
	



}
