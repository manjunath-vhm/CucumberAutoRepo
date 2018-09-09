package com.basic.FirstFeatureFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyFirstStepDef {
	
	WebDriver driver;
	
	@Given("^user is on the facebook login page$")
	public void user_is_on_the_facebook_login_page() {
		System.setProperty("webdriver.chrome.driver", "F:\\CucumberSetup\\chromedriver_win32\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");			
	}
	
	@When("^user enters first name$")
	public void user_enters_first_name() {
		driver.findElement(By.xpath("//input[@id='u_0_c']")).sendKeys("Bro");
		
	}
	
	@Then("^user checks user first name is present$")
	public void user_checks_user_first_name_is_present() {
		String usernameActual = driver.findElement(By.xpath("//input[@id='u_0_c']")).getAttribute("value");
		Assert.assertEquals("Bro", usernameActual);
		
	}

}
