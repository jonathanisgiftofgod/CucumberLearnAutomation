package org.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeDataTableUsingExamplesSteps {
	WebDriver driver;
	@Given("proceed to login page")
	public void proceed_to_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("user enters the {string} and password {string}")
	public void user_enters_the_and_password(String UserName, String Password) {
		driver.findElement(By.id("txtUsername")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
	}

	@Then("clicked button")
	public void clicked_button() {
		driver.findElement(By.id("btnLogin")).click();
	}
}
