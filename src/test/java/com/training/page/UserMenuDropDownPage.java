package com.training.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class UserMenuDropDownPage extends BasePage {

	static WebDriver driver;

	public UserMenuDropDownPage() {
		super(driver = BaseTest.getDriverH());

		//addObject("Username",By.id("username"));
		//addObject("Password",By.id("password"));
		//addObject("Login",By.name("Login"));
		
		addObject("UserMenuDropDownList",By.id("userNav-arrow"));//Used in LoginPage
		
		addObject("UserMenuDropDown", By.id("userNavButton"));
		addObject("DropDownText",By.xpath("//div[@id='userNav-menuItems']/a"));

		addObject("MyProfile",By.xpath("//div[@id='userNav-menuItems']/a[1]"));
		addObject("MySettings",By.xpath("//div[@id='userNav-menuItems']/a[2]"));
		addObject("DeveloperConsole",By.xpath("//div[@id='userNav-menuItems']/a[3]"));
		addObject("DropDownText4",By.xpath("//div[@id='userNav-menuItems']/a[4]"));
		addObject("DropDownText5",By.xpath("//div[@id='userNav-menuItems']/a[5]"));
		
		addObject("Logout",By.xpath("//a[text()='Logout']"));//Used in LoginPage

		addObject("EditProfile",By.xpath("//div//a[@class='contactInfoLaunch editLink']//img[@alt='Edit Profile']"));
		addObject("Frame",By.xpath("//iframe[@id='contactInfoContentId']"));
		addObject("About",By.xpath("//a[contains(text(),'About')]"));
		addObject("Lastname",By.id("lastName"));
		addObject("SaveEditProfile",By.xpath("//input[@value='Save All']"));
		addObject("Post",By.xpath("//span[text()='Post']"));
		addObject("Frame2",By.xpath("//iframe[@frameborder='0']"));
		addObject("TextArea",By.xpath("//body[contains(text(),'Share an update')]"));
		addObject("ShareButton",By.id("publishersharebutton"));
		addObject("File",By.xpath("//span[text()='File']"));
		addObject("UploadFile",By.id("chatterUploadFileAction"));
		addObject("chooseFile",By.id("chatterFile"));
		addObject("shareButtonForFile",By.id("publishersharebutton"));
		addObject("ProfilePhoto",By.xpath("//span[@class='profileImage chatter-avatarFull chatter-avatar']//img[@class='chatter-photo']"));
		addObject("Update",By.id("uploadLink"));
		addObject("Frame3",By.id("uploadPhotoContentId"));
		addObject("UploadPhoto",By.id("j_id0:uploadFileForm:uploadInputFile"));
		addObject("SavePhoto",By.id("j_id0:uploadFileForm:uploadBtn"));
		addObject("CropSW",By.xpath("//div[@class='imgCrop_handle imgCrop_handleSW']"));
		addObject("CropSE",By.xpath("//div[@class='imgCrop_handle imgCrop_handleSE']"));
		addObject("SaveFinal",By.id("j_id0:j_id7:save"));
		addObject("PersonalTab",By.id("PersonalInfo_font"));
		addObject("LoginHistory",By.id("LoginHistory_font"));
		addObject("DownloadLoginHistory",By.xpath("//a[contains(text(),'Download login history')]"));
		addObject("MySettingsTab",By.xpath("//span[text()='My Settings']"));
		addObject("DisplayAndLayout",By.id("DisplayAndLayout_font"));
		addObject("CustomizeMyTab",By.id("CustomizeTabs_font"));
		addObject("CustomApp",By.id("p4"));
		addObject("SelectReportSel",By.xpath("//select[@id='duel_select_1']"));
		addObject("Remove",By.xpath("//img[@alt='Remove']"));
		addObject("SelectReportAvl",By.xpath("//select[@id='duel_select_0']"));
		addObject("Add",By.xpath("//img[@alt='Add']"));
		addObject("Save",By.xpath("//input[@name='save']"));
		addObject("TopRightDDwn",By.id("tsid-arrow"));
		addObject("Salesforcechatter",By.xpath("//a[text()='Salesforce Chatter']"));
		addObject("Close",By.id("tryLexDialogX"));
		addObject("Sales",By.xpath("//a[text()='Sales']"));
		addObject("Marketing",By.xpath("//a[text()='Marketing']"));
		addObject("Content",By.xpath("//a[text()='Content']"));
		addObject("Email",By.id("EmailSetup_font"));
		addObject("Myemail",By.id("EmailSettings_font"));
		addObject("EmailName",By.id("sender_name"));
		addObject("EmailID",By.id("sender_email"));
		addObject("AutomaticBCC",By.id("auto_bcc1"));
		addObject("Saveemail",By.xpath("//td[@id='bottomButtonRow']//input[@name='save' ]"));
		addObject("CalenderRemindersLink",By.xpath("//span[text()='Calendar & Reminders']"));
		addObject("ActivityReminder",By.xpath("//span[text()='Activity Reminders']"));
		addObject("OpenReminder",By.id("testbtn"));
		addObject("ValidationText",By.xpath("//th[text()='Subject']"));
		
	}


	
	
 }
