package com.training.steps;

import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;
import com.training.page.UserMenuDropDownPage;
import com.training.pagefactory.PageFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps extends BaseTest {
	
	String UniqueName = RandomStringUtils.randomAlphanumeric(6);


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

	@Then("user enter into Name {string}")
	public void user_enter_into_name(String logicalName) {
		page.enterintoTextbox(logicalName, UniqueName);
	}

	@Then("click on  Button {string}")
	public void click_on_button(String logicalName) {
		page.clickonButton(logicalName);
	}

	@When("check the Box {string}")
	public void check_the_box(String logicalName) {
		page.checkTheBox(logicalName);
	}

	@Then("check the Box Selected {string}")
	public void check_the_box_selected(String logicalName) {
		page.checkRememberMeSelected(logicalName);
	}
	
	
	@Then("click on  Link {string}")
	public void click_on_link(String logicalName) {
		page.clickTheLink(logicalName);
	}

	@Then("clear the Textbox {string}")
	public void clear_the_textbox(String logicalName) {
		page.clearTextboxField(logicalName);
	}

	@Then("Switch to alert accept")
	public void switch_to_alert_accept() {
		page.switchToAlertAccept();
	}

	@Then("Switch to ActiveElement")
	public void switch_to_active_element() {
		page.switchToActiveElement();
	}

	@Then("switch to frame {string}")
	public void switch_to_frame(String logicalName) {
		page.switchToFrame(logicalName);
	}

	@Then("Switch to NewWindow {int}")
	public void switch_to_new_window(Integer number) {
		page.switchToNewWindow(number);
	}

	@Then("close Newwindow")
	public void close_newwindow() {
		page.closeNewWindow();
	}

	@Then("switch to parentFrame")
	public void switch_to_parent_frame() {
		page.switchToParentFrame();
	}

	@Then("select from DropDown {string} {string}")
	public void select_from_drop_down(String logicalName, String Value) {
		page.selectFromDropdown(logicalName, Value);
	}

	@Then("mouseHover {string}")
	public void mouse_hover(String logicalName) {
		page.mouseHover(logicalName);
	}

	@Then("crop photo {string}")
	public void crop_photo(String logicalName) {
		page.cropper(logicalName);
	}

	@Then("validate text {string} {string}")
	public void validate_text(String logicalName, String Value) {
		page.validateText(logicalName, Value);
	}

	@Then("validate ValueFromList {string}")
	public void validate_value_from_list(String logicalName) {
		page.validateValueList(logicalName, UniqueName);
	}

	@Then("validate ValueLeadList {string} {string}")
	public void validate_value_lead_list(String logicalName, String a) {
		page.validateValueList(logicalName, a);
	}
	
	@Then("validate Dropdown {string}")
	public void validate_dropdown(String logicalName,DataTable dataTable) {
		List<String>Expected=dataTable.asList();
		page.validateTheElements(logicalName,Expected);
	}


	@Then("validate title {string} {string}")
	public void validate_title(String logicalName, String Value) {
		page.validateTitle(Value);
	}

	@Then("User ThreadSleepWait {int}")
	public void user_thread_sleep_wait(Integer time) throws InterruptedException {
		page.ThreadSleepWait(time);
	}

	@After
	public void teardown(Scenario scenario) {
		byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", scenario.getName());
		// driver.close();
		driver = null;
	}

}
