package com.training.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Then;

public class BasePage {

	//public static String UniqueName = RandomStringUtils.randomAlphanumeric(6);

	public WebDriver driver;

	public HashMap<String, By> ObjectRepo = new HashMap<String, By>();

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public void addObject(String LogicalName, By by) {
		ObjectRepo.put(LogicalName, by);
	}

	public WebElement getElementH(String LogicalName) {
		By by = ObjectRepo.get(LogicalName);
		WebElement element = driver.findElement(by);
		return element;
	}

	public void enterintoTextbox(String LogicalName, String Value) {
		WebElement element = getElementH(LogicalName);
		ExcplictWait(60, element);
		element.sendKeys(Value);
	}

	public void clickonButton(String LogicalName) {
		WebElement element = getElementH(LogicalName);
		ExcplictWait(60, element);
		element.click();
	}

	public void checkTheBox(String LogicalName) {
		WebElement element = getElementH(LogicalName);
		ExcplictWait(60, element);
		element.click();
	}
	
	public void checkRememberMeSelected(String LogicalName) {

	}

	public void clickTheLink(String LogicalName) {
		WebElement element = getElementH(LogicalName);
		ExcplictWait(60, element);
		element.click();
	}

	public void clearTextboxField(String LogicalName) {
		WebElement element = getElementH(LogicalName);
		ExcplictWait(60, element);
		element.clear();
	}

	public void selectFromDropdown(String LogicalName, String Value) {
		WebElement element = getElementH(LogicalName);
		ExcplictWait(60, element);
		Select select = new Select(element);
		select.selectByVisibleText(Value);
	}

	public void cropper(String LogicalName) {
		WebElement element = getElementH(LogicalName);
		ExcplictWait(60, element);
		Actions crop1 = new Actions(driver);
		crop1.clickAndHold(element).moveByOffset(50, 30).build().perform();
	} 
	
	public void switchToAlertAccept() {
		driver.switchTo().alert().accept();
	}

	public void switchToActiveElement() {
		driver.switchTo().activeElement();
	}

	public void switchToFrame(String LogicalName) {
		WebElement element = getElementH(LogicalName);
		driver.switchTo().frame(element);
	}

	public void switchToParentFrame() {
		driver.switchTo().parentFrame();
	}

	public void closeNewWindow() {
		driver.close();
	}

	public void switchToNewWindow(int number) {
		Set<String> handle = driver.getWindowHandles();
		String[] indexOfWindows = handle.toArray(new String[handle.size()]);
		driver.switchTo().window(indexOfWindows[number]);
	}

	public void mouseHover(String LogicalName) {
		WebElement element = getElementH(LogicalName);
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}

	
	public void validateText(String LogicalName, String Value) {
		WebElement element = getElementH(LogicalName);
		String ActualValue = element.getText();
		Assert.assertEquals(ActualValue, Value);
	}

	public void validateValueList(String LogicalName, String ValueA) {
		WebElement element = getElementH(LogicalName);
		Select select = new Select(element);
		String Actual = select.getFirstSelectedOption().getText();
		Assert.assertEquals(Actual, ValueA);
	}
	
	public void validateTitle(String ExceptedValue) {
		String ActualVaue = driver.getTitle();
		Assert.assertEquals(ActualVaue, ExceptedValue);
	}

	public void ExcplictWait(int time, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void ThreadSleepWait(int time) throws InterruptedException {
		Thread.sleep(time);
	}

	private List<WebElement> getElementsH(String LogicalName) {
		By by = ObjectRepo.get(LogicalName);
		List<WebElement> element = driver.findElements(by);
		return element;
	}

	public void validateTheElements(String LogicalName,List<String> ExpectedOptions) {
		List<WebElement> element = getElementsH(LogicalName);
		WaitForElements(element);
		List<String> ActualOptions = new ArrayList<String>();
		for (WebElement elementList : element) {
			//Here we r adding list of elements to actualAllOptions List
			ActualOptions.add(elementList.getText());
		}
			Assert.assertEquals(ActualOptions,ExpectedOptions);
	}


	private void WaitForElements(List<WebElement> element) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElements(element));
	}

}