package com.training.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class LeadsPage extends BasePage {

	static WebDriver driver;

	public LeadsPage() {
super(driver = BaseTest.getDriverH());
		
		addObject("LeadsTab",By.xpath("//a[text()='Leads']"));
		addObject("ViewLeads",By.id("fcf"));
		addObject("LeadsDropDown",By.xpath("//select[@id='fcf']//option"));
		addObject("Today'sLeads",By.xpath("//select[@id='fcf']//option[4]"));
		addObject("Go",By.name("go"));
		addObject("LeadsView",By.name("fcf"));
		addObject("AllOpenLeads",By.xpath("//select[@id='fcf']//option[1]"));
		addObject("New",By.name("new"));
		addObject("LastName",By.id("name_lastlea2"));
		addObject("CompanyName",By.id("lea3"));
		addObject("ValidateText",By.xpath("//h2[@class='topName']"));


	}

}
