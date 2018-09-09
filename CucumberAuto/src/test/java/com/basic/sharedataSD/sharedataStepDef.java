package com.basic.sharedataSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class sharedataStepDef {
	
	WebDriver driver ;
	
	public sharedataStepDef(sharedClass share) {
		driver = share.setup();
	}
	

	@Given("^user is on the facebook login page$")
	public void user_is_on_the_facebook_login_page() {
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
	
	@After(order=2)
	public void tearDown() {
		driver.quit();
		driver = null;
		System.out.println("After1");
	}
	
}
