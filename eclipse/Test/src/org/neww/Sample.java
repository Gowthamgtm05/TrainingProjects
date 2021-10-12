package org.neww;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {
	
	public void webPage() {
		System.out.println("selenium testing");

	}
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\LENOVO-HOMEPC\\eclipse\\Test\\Drivers\\geckodriver.exe");
		WebDriver sam = new FirefoxDriver();
		
		sam.get("https://www.facebook.com/");
	}
	
	

}
