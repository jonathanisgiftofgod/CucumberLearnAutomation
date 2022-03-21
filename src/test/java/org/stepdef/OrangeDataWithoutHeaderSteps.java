package org.stepdef;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeDataWithoutHeaderSteps {
	WebDriver driver;
	@Given("you are on login page")
	public void you_are_on_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");}

	@When("you enter the below credentials")
	public void you_enter_the_below_credentials(io.cucumber.datatable.DataTable dataTable) {
		List<String> credentials = dataTable.asList(String.class);
		String userName = credentials.get(0);
		String userPassword = credentials.get(1);
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(userPassword); }

	@When("you click the login page")
	public void you_click_the_login_page() {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("you should see the home page")
	public void you_should_see_the_home_page() {
		boolean displayed = driver.findElement(By.id("welcome")).isDisplayed();
		Assert.assertTrue(displayed);
		System.out.println("All the Best");}

}
