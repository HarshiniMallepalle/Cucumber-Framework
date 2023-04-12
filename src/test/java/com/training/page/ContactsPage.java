package com.training.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class ContactsPage extends BasePage {

	static WebDriver driver;

	public ContactsPage() {
		super(driver = BaseTest.getDriverH());

		 addObject("ContactsTab",By.xpath("//a[text()='Contacts']"));
		 addObject("New",By.name("new"));
		 addObject("LastName",By.id("name_lastcon2"));
		 addObject("ContactSearchIcon",By.id("con4_lkwgt"));
		 addObject("ValidateText",By.xpath("//h2[@class='topName']"));
		//addObject("ViewLeads",By.id("fcf"));
		//addObject("ViewLeads",By.id("fcf"));
		//addObject("ViewLeads",By.id("fcf"));

	}
}