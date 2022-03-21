package org.stepdef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeLoginDataSteps {
	WebDriver driver;
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("the user enters the valid credentials  {string} and {string}")
	public void the_user_enters_the_valid_credentials_and(String string, String string2) {
		driver.findElement(By.id("txtUsername")).sendKeys(string);
		driver.findElement(By.id("txtPassword")).sendKeys(string2);  

	}

	@When("click on the login page")
	public void click_on_the_login_page() {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("the user should see home page")
	public void the_user_should_see_home_page() {
		boolean displayed = driver.findElement(By.id("welcome")).isDisplayed();
		Assert.assertTrue(displayed);
		System.out.println("All the Best");

	}
}
