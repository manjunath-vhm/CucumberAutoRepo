package com.basic.multifeatureSD;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class googlesearchStepDef {
	
	WebDriver driver;
	
	@Given("^user is on the google home page$")
	public void user_is_on_the_google_home_page() {
		System.setProperty("webdriver.chrome.driver", "F:\\CucumberSetup\\chromedriver_win32\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");			
	}
	
	@When("^user \"([^\"]*)\" in search box$")
	public void user_in_search_box(String searchword) {
		driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys(searchword);
		Robot r;
		try {
			r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyPress(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			e.printStackTrace();
		}		
	}
	
	@Then("^user checks selenium web browser automation page is present$")
	public void user_checks_selenium_web_browser_automation_page_is_present() {
		//String actualText = driver.findElement(By.id("lst-ib")).getAttribute("value");
		//Assert.assertEquals("selenium", actualText);
		System.out.println("Then Statement");
	}
	
	@Then("^close the google browser$")
	public void close_the_google_browser() {
		driver.quit();
		driver = null;
	}

}
