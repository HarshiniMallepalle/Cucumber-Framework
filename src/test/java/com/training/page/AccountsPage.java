package com.training.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class AccountsPage extends BasePage{

	static WebDriver driver;

	public AccountsPage() {
		super(driver = BaseTest.getDriverH());

		addObject("AccountsTab",By.xpath("//li[@id='Account_Tab']//a[text()='Accounts']"));
		addObject("ClosePopUp",By.id("tryLexDialogX"));
		addObject("NewButton",By.name("new"));
		addObject("AccountName",By.id("acc2"));
		addObject("TypeDropDown",By.id("acc6"));
		addObject("CustomerPriority",By.id("00N3x00000CuIkp"));
		addObject("SaveNewAccount",By.name("save"));
		addObject("validateAccountName",By.xpath("//h2[contains(text(),'HarshSaanvi')]"));
		addObject("EnterViewname",By.id("fname"));
		addObject("EnterViewUniqueName",By.id("devname"));
		addObject("Save",By.xpath("//div[@class='pbHeader']//input[@name='save']"));	
		addObject("ViewListBox",By.name("fcf"));
		addObject("Edit",By.xpath("//a[text()='Edit']"));
		addObject("Delete",By.name("delID"));
		addObject("CreateNewView",By.xpath("//a[text()='Create New View']"));	
		addObject("Field",By.id("fcol1"));
		addObject("Operator",By.id("fop1"));
		addObject("Value",By.name("fval1"));
		addObject("MergeAccounts",By.xpath("//a[text()='Merge Accounts']"));
		addObject("FindAccountsText",By.name("srch"));
		addObject("FindAccounts",By.name("srchbutton"));
		addObject("FirstCheckBox",By.id("cid0"));
		addObject("SecondCheckBox",By.id("cid1"));
		addObject("Next",By.name("goNext"));
		addObject("MergeAccountssave",By.xpath("//div[@class='pbWizardHeader']//input[@name='save']"));
		addObject("validateAccountsHome",By.xpath("//h2[text()=' Home']"));
		addObject("AccountsLastActivity",By.xpath("//a[contains(text(),'Accounts with last')]"));
		addObject("DateFieldDropDown",By.id("ext-gen148"));
		addObject("CreateDate",By.xpath("//div[text()='Created Date']"));
		addObject("FromCalendarIcon",By.id("ext-gen152"));
		addObject("FromTodayCalendar",By.xpath("//button[@id='ext-gen281']"));
		addObject("ToCalendarIcon",By.id("ext-gen154"));
		addObject("ToTodayCalendar",By.xpath("//button[@id='ext-gen296']"));
		addObject("SaveReport",By.id("ext-gen49"));
		addObject("ReportName",By.id("saveReportDlg_reportNameField"));
		addObject("ReportUniqueName",By.id("saveReportDlg_DeveloperName"));
		addObject("SaveAndRunReport",By.id("ext-gen316"));
		addObject("ReportText",By.xpath("//h2[text()='Report Generation Status:']"));


	
	
	
	}

}
