package com.basic.tagsSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class tagsStepDef {
	
	WebDriver driver;
	
	@Given("^user is on the facebook login page$")
	public void user_is_on_the_facebook_login_page() {
		System.setProperty("webdriver.chrome.driver", "F:\\CucumberSetup\\chromedriver_win32\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");			
	}
	
	@When("^user enters \"([^\"]*)\" first name$")
	public void user_enters_first_name(String firstname) {
		driver.findElement(By.xpath("//input[@id='u_0_c']")).sendKeys(firstname);
		
	}
	
	@Then("^user checks user \"([^\"]*)\" first name is present$")
	public void user_checks_user_first_name_is_present(String firstname) {
		String usernameActual = driver.findElement(By.xpath("//input[@id='u_0_c']")).getAttribute("value");
		Assert.assertEquals(firstname, usernameActual);
		
	}
	
	@And("^user enter \"([^\"]*)\" surname$")
	public void user_enter_surname(String surname) {
		driver.findElement(By.xpath("//input[@id='u_0_e']")).sendKeys(surname);
	}
	@And("^user cheks user \"([^\"]*)\" surname is present$")
	public void user_cheks_user_surname_is_present(String surname) {
		String surnameActual = driver.findElement(By.xpath("//input[@id='u_0_e']")).getAttribute("value");
		Assert.assertEquals(surname, surnameActual);
	}
	@Then("^User mobile field should be blank$")
	public void User_mobile_field_should_be_blank() {
		String mobileField = driver.findElement(By.xpath("//input[@id='u_0_h']")).getAttribute("value");
		Assert.assertEquals("", mobileField);
	}
	
	@Then("^close the browser$")
	public void close_the_browser() {
		driver.quit();
		driver = null;
	}

}
