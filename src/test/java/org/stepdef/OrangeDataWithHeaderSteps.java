package org.stepdef;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeDataWithHeaderSteps {
	WebDriver driver;
	@Given("Go to login page")
	public void go_to_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");	}

	@When("type the below credential")
	public void type_the_below_credential(io.cucumber.datatable.DataTable dataTable) {
	   List<Map<String, String>> keyValuePair = dataTable.asMaps(String.class,String.class);
	   String userName = keyValuePair.get(0).get("userName");
	   String password = keyValuePair.get(0).get("Password");
	   driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	}

	@When("enter the option login")
	public void enter_the_option_login() {
		driver.findElement(By.id("btnLogin")).click();	}

	@Then("see the successfull home page")
	public void see_the_successfull_home_page() {
		boolean displayed = driver.findElement(By.id("welcome")).isDisplayed();
		Assert.assertTrue(displayed);
		System.out.println("All the Best");
	}
}


