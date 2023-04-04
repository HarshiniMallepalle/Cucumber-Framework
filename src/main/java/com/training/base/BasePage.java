package com.training.base;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {
	WebDriver driver;

public HashMap<String,By> ObjectRepo=new HashMap<String,By>();

public BasePage(WebDriver driver) {
	this.driver=driver;
}

public void addObject(String LogicalName,By by) {
	ObjectRepo.put(LogicalName, by);
}

private WebElement getElementH(String LogicalName) {
	By by = ObjectRepo.get(LogicalName);
	WebElement element = driver.findElement(by);
return element;
}

public void enterintoTextbox(String LogicalName, String Value) {
	WebElement element = getElementH(LogicalName);
	ExcplictWait(10, element);
	element.sendKeys(Value);
}
public void clickonButton(String LogicalName){
	WebElement element = getElementH(LogicalName);
	ExcplictWait(10, element);
	element.click(); 
}

public void chechTheBox(String LogicalName){
	WebElement element = getElementH(LogicalName);
	ExcplictWait(10, element);
	element.click(); 
}

public void clickTheLink(String LogicalName){
	WebElement element = getElementH(LogicalName);
	ExcplictWait(10, element);
	element.click(); 
}

public void validateText (String LogicalName, String Value) throws InterruptedException {
	Thread.sleep(3000);
	WebElement element = getElementH(LogicalName);
	String ActualValue = element.getText();
	Assert.assertEquals(ActualValue,Value );
}

public void validateTitle(String ExceptedValue) throws InterruptedException {
          Thread.sleep(3000);
	String ActualVaue = driver.getTitle();
	Assert.assertEquals(ActualVaue, ExceptedValue);
}

public  void ExcplictWait(int time,WebElement element) {
	
	WebDriverWait wait = new WebDriverWait(driver,time);
	wait.until(ExpectedConditions.visibilityOf(element));
	
}


}