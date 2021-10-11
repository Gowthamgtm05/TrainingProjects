package com.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	
	WebDriver driver;
	@Given("user should be in adactin login")
	public void a() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}

	@When("user should enter credentials")
	public void b() {

	}

	@When("user should click the login")
	public void c() {

	}

	@Then("close the browser")
	public void d() {

	
	}


}
