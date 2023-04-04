package com.training.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;
import com.training.pagefactory.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps extends BaseTest {

	PageFactory pageFactory = new PageFactory();
	BasePage page;

	@Before
	public void setup() throws Exception {
		launchapplicationH();
	}

	@Given("User is on {string}")
	public void user_is_on(String Page) {
		page = pageFactory.initialize(Page);
		// page = new LoginPage();
	}

	@When("user enter into Textbox {string} {string}")
	public void user_enter_into_textbox(String logicalName, String Value) {
		// driver.findElement(By.id(logicalName)).sendKeys(Value);
		page.enterintoTextbox(logicalName, Value);
	}

	@Then("click on  Button {string}")
	public void click_on_button(String logicalName) {
		page.clickonButton(logicalName);
	}
	
	@When("check the Box {string}")
	public void check_the_box(String logicalName) {
	  page.chechTheBox(logicalName);  
	}
	
	@Then("click on  Link {string}")
	public void click_on_link(String logicalName) {
	  page.clickTheLink(logicalName);
	}

	@Then("validate text {string} {string}")
	public void validate_error(String logicalName, String Value) throws InterruptedException {
	page.validateText(logicalName, Value);
	}
	
	@Then("validate title {string} {string}")
	public void validate_title(String logicalName, String Value) throws InterruptedException {
	  page.validateTitle(Value);
	}
	
	@After
	public void teardown(Scenario scenario) {
		byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", scenario.getName());
		driver.close();
		driver = null;
	}

}
