package com.training.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class LoginPage extends BasePage{

	static WebDriver driver;
	
	public LoginPage() {
		super(driver=BaseTest.getDriverH());
		
		addObject("Username",By.id("username"));
		addObject("Password",By.id("password"));
		addObject("Login",By.name("Login"));
		addObject("ErrorMessage",By.id("error"));
		addObject("RememberMe",By.id("rememberUn"));
		addObject("UserMenuDropDown",By.id("userNav-arrow"));
		addObject("Logout",By.xpath("//a[text()='Logout']"));
		addObject("UsernameIdentification",By.xpath("//span[@id='idcard-identity']"));
		addObject("ForgotPassword",By.id("forgot_password_link"));
		addObject("UsernameInForgotPswd",By.id("un"));
		addObject("Continue",By.id("continue"));
		addObject("Text",By.id("header"));
		addObject("Text1",By.xpath("//div[contains(text(),'Please check your ')]"));


	}
	
	
}
 