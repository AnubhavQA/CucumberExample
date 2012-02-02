package com.cengage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.annotation.After;
import cucumber.annotation.Before;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import static junit.framework.Assert.assertEquals;

public class BingStepdefs  {
	private WebDriver driver;
	private WebElement element;

	@Before
	public void setUp() {
		driver = new FirefoxDriver();
	}

	@After
	public void tearDown() {
		driver.close();
	}

	@Given("^I am on Bings's home page$")
	public void iAmOnBingsHomePage() {
		driver.get("http://www.bing.com");
	}

	@When("^I enter the keyword \"(.*)\"$")
	public void iEnterTheKeyword(String keyword) {
		element = driver.findElement(By.id("sb_form_q"));
		element.sendKeys(keyword);
	}

	@When("^click the Submit button$")
	public void clickTheSubmitButton() {
		element.submit();
	}

	@Then("^the page title should be \"(.*)\"$")
	public void thePageTitleReturned(String expectedResults) {
		assertEquals(expectedResults, driver.getTitle());
	}
}