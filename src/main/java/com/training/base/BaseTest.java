package com.training.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.training.utilities.CommonUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	protected static WebDriver driver;
	static CommonUtilities common = new CommonUtilities();
	
	public static void launchapplicationH() throws IOException {
		
		driver=getDriverH();
		String url=common.getpropertyH("url");
		driver.get(url);
	}
	
	public static WebDriver getDriverH() {
		if(driver==null) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		return driver;
	}

}
