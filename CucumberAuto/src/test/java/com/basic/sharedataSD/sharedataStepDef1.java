package com.basic.sharedataSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class sharedataStepDef1 {
	
	WebDriver driver;

	
	public sharedataStepDef1(sharedClass share) {
		driver = share.setup();
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
	
}
