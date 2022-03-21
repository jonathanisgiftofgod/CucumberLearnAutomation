package org.stepdef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeSteps {
	WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("the user enters the valid username and password")
	public void the_user_enters_the_valid_username_and_password() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}

	@When("clicks the login page")
	public void clicks_the_login_page() {
		driver.findElement(By.id("btnLogin")).click();
	  	}

	@Then("the user should be navigated to home page")
	public void the_user_should_be_navigated_to_home_page() {
		boolean displayed = driver.findElement(By.id("welcome")).isDisplayed();
		Assert.assertTrue(displayed);
		System.out.println("All the Best");
	}

	}
