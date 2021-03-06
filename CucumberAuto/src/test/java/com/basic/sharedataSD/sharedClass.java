package com.basic.sharedataSD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class sharedClass {

	WebDriver driver;
	
	@Before
	public WebDriver setup() {
		
		if (driver==null) {
			System.setProperty("webdriver.chrome.driver", "F:\\CucumberSetup\\chromedriver_win32\\chromedriver.exe");	
			driver = new ChromeDriver();
		}
		return driver;
	}
	
	@After
	public void teardown() {
		driver.quit();
		driver=null;
	}
}
