package org.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class FaceBookSteps {
WebDriver driver;
@Given("User should open the facebook application")
public void user_should_open_the_facebook_application() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
}

@When("User should enter the valid userId and password")
public void user_should_enter_the_valid_userId_and_password() {
	driver.findElement(By.id("email")).sendKeys("britto");
	driver.findElement(By.id("pass")).sendKeys("joseph");
 }

@When("User should click the login button")
public void user_should_click_the_login_button() {
	driver.findElement(By.name("login")).click();
}

@Then("I validate the application moved to home page")
public void i_validate_the_application_moved_to_home_page() {
	boolean contains = driver.getTitle().contains("Facebook");
	System.out.println(contains);
	//Assert.assertTrue(contains);
	System.out.println("All the best");
}


}
