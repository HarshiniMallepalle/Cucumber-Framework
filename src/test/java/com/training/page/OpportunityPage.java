package com.training.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class OpportunityPage extends BasePage {

	static WebDriver driver;

	public OpportunityPage() {
		super(driver = BaseTest.getDriverH());
		
		addObject("OpportunityTab",By.id("Opportunity_Tab"));
		addObject("VerifyOppurtunitiesDropDown",By.id("fcf"));
		addObject("DropDownView",By.xpath("//select[@id='fcf']//option"));
		addObject("New",By.name("new"));
		addObject("OppurtunityName",By.id("opp3"));
		addObject("AccountName",By.id("opp4"));
		addObject("SearchIcon",By.id("opp4_lkwgt"));
		addObject("Frame",By.xpath("//frame[@id='resultsFrame']"));
		addObject("AccountNameLink",By.xpath("//a[text()='Edge Communications']"));
		addObject("CloseDate",By.xpath("//span[@class='dateFormat']"));
		addObject("StageDropDown",By.id("opp11"));
		addObject("Probability",By.id("opp12"));
		addObject("LeadSource",By.id("opp6"));
		addObject("CampaingLink",By.xpath("//a[text()='Harshini']"));
		addObject("Campaing",By.id("opp17"));
		addObject("SaveOppty",By.xpath("//td[@id='topButtonRow']//input[@name='save']"));
		addObject("CampaingSearchIcon",By.xpath("//a[@title='Primary Campaign Source Lookup (New Window)']//img[@class='lookupIcon']"));
		addObject("Pipeline",By.xpath("//a[text()='Opportunity Pipeline']"));
		addObject("StuckOpportunities",By.xpath("//a[text()='Stuck Opportunities']"));
		addObject("Interval",By.id("quarter_q"));
		addObject("Include",By.id("open"));
		addObject("RunReport",By.name("go"));
		//addObject("Probability",By.xpath("opp12"));
		//addObject("Probability",By.xpath("opp12"));



		
		
	}

}
