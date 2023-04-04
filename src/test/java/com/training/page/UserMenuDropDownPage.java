package com.training.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.training.base.BasePage;
import com.training.base.BaseTest;

public class UserMenuDropDownPage extends BasePage {

	static WebDriver driver;

	public UserMenuDropDownPage() {
		super(driver = BaseTest.getDriverH());

		addObject("Username",By.id("username"));
		addObject("Password",By.id("password"));
		addObject("Login",By.name("Login"));
		addObject("UserMenuDropDown", By.id("userNavButton"));
		addObject("DropDownText1",By.xpath("//div[@id='userNav-menuItems']/a[1]"));
		addObject("DropDownText2",By.xpath("//div[@id='userNav-menuItems']/a[2]"));
		addObject("DropDownText3",By.xpath("//div[@id='userNav-menuItems']/a[3]"));
		addObject("DropDownText4",By.xpath("//div[@id='userNav-menuItems']/a[4]"));
		addObject("DropDownText5",By.xpath("//div[@id='userNav-menuItems']/a[5]"));

	}

}
