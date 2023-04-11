Feature: Login sceanarios of SalesForce application UserMenuDropDown Module

@TC5
Scenario: TC5 UserMenuDropDown
Given User is on "LoginPage"
When user enter into Textbox "Username" "harshini@software.com"
Then user enter into Textbox "Password" "Test@123"
Then click on  Button "Login"
Given User is on "UserMenuDropDownPage"
Then click on  Link "UserMenuDropDown"
Then validate Dropdown "DropDownText"


@TC6
Scenario: TC6 MyProfile
Given User is on "LoginPage"
When user enter into Textbox "Username" "harshini@software.com"
Then user enter into Textbox "Password" "Test@123"
Then click on  Button "Login"
Given User is on "UserMenuDropDownPage"
Then click on  Link "UserMenuDropDown"
Then click on  Link "MyProfile"
Then User ThreadSleepWait 2000
Then click on  Link "EditProfile"
Then User ThreadSleepWait 2000
Then switch to frame "Frame"
Then click on  Link "About"
Then clear the Textbox "Lastname"
When user enter into Textbox "Lastname" "Harshini"
Then click on  Button "SaveEditProfile"
Then click on  Link "Post"
Then User ThreadSleepWait 2000
Then switch to frame "Frame2"
Then user enter into Textbox "TextArea" "Hello this is Cucumber Framework"
Then switch to parentFrame
Then click on  Button "ShareButton"
Then User ThreadSleepWait 2000
Then click on  Link "File"
Then click on  Link "UploadFile"
Then User ThreadSleepWait 5000
Then user enter into Textbox "chooseFile" "C:\\Users\\harsh\\OneDrive\\Desktop\\FilePhoto.jpg"
Then click on  Button "shareButtonForFile"
Then mouseHover "ProfilePhoto"
Then User ThreadSleepWait 3000
Then click on  Link "Update"
Then User ThreadSleepWait 2000
Then switch to frame "Frame3"
Then user enter into Textbox "UploadPhoto" "C:\\Users\\harsh\\OneDrive\\Desktop\\ProfilePhoto.jpg"
Then click on  Button "SavePhoto"
Then User ThreadSleepWait 3000
Then crop photo "CropSW"
Then User ThreadSleepWait 3000
Then crop photo "CropSE"
Then click on  Button "SaveFinal"
Then User ThreadSleepWait 3000
And validate title "Title" "User: Sobha Harshini ~ Salesforce - Developer Edition"

@TC7
Scenario: TC7 MySettings
Given User is on "LoginPage"
When user enter into Textbox "Username" "harshini@software.com"
Then user enter into Textbox "Password" "Test@123"
Then click on  Button "Login"
Given User is on "UserMenuDropDownPage"
Then click on  Link "UserMenuDropDown"
Then click on  Link "MySettings"
Then User ThreadSleepWait 2000
Then click on  Link "PersonalTab"
Then click on  Link "LoginHistory"
Then click on  Link "DownloadLoginHistory"
Then click on  Link "MySettingsTab"
Then click on  Link "DisplayAndLayout"
Then click on  Link "CustomizeMyTab"
Then select from DropDown "CustomApp" "Salesforce Chatter"
Then select from DropDown "SelectReportSel" "Reports"
Then click on  Button "Remove"
Then select from DropDown "SelectReportAvl" "Reports"
Then click on  Button "Add"
Then click on  Button "Save"
Then click on  Link "TopRightDDwn"
Then click on  Link "Salesforcechatter"
Then click on  Button "Close"
Then click on  Link "TopRightDDwn"
Then click on  Link "Sales"
Then click on  Link "TopRightDDwn"
Then click on  Link "Marketing"
Then click on  Link "TopRightDDwn"
Then click on  Link "Content"
Then click on  Link "UserMenuDropDown"
Then click on  Link "MySettings"
Then click on  Link "Email"
Then click on  Link "Myemail"
Then clear the Textbox "EmailName"
When user enter into Textbox "EmailName" "Harshini M"
Then clear the Textbox "EmailID"
When user enter into Textbox "EmailID" "m.harshini.reddy@gmail.com"
Then click on  Link "AutomaticBCC"
Then click on  Link "Saveemail"
Then User ThreadSleepWait 2000
Then Switch to alert accept
Then User ThreadSleepWait 2000
Then click on  Link "MySettingsTab"
Then click on  Link "CalenderRemindersLink"
Then click on  Link "ActivityReminder"
Then click on  Link "OpenReminder"
Then User ThreadSleepWait 2000
Then Switch to NewWindow 1
Then User ThreadSleepWait 2000
And validate text "ValidationText" "Subject"
 
@TC8
Scenario: TC8 DeveloperConsoleFromUserMenu
Given User is on "LoginPage"
When user enter into Textbox "Username" "harshini@software.com"
Then user enter into Textbox "Password" "Test@123"
Then click on  Button "Login"
Given User is on "UserMenuDropDownPage"
Then click on  Link "UserMenuDropDown"
Then click on  Link "DeveloperConsole"
Then User ThreadSleepWait 2000
Then Switch to NewWindow 1
And validate title "Title" "Developer Console"
Then close Newwindow
Then Switch to NewWindow 0
And validate title "Title" "Home Page ~ Salesforce - Developer Edition"

 
@TC9
Scenario: TC9 LogoutFromSFDC
Given User is on "LoginPage"
When user enter into Textbox "Username" "harshini@software.com"
Then user enter into Textbox "Password" "Test@123"
Then click on  Button "Login"
Given User is on "UserMenuDropDownPage"
Then click on  Link "UserMenuDropDown"
Then click on  Link "Logout"
Then User ThreadSleepWait 2000
And validate title "Title" "Login | Salesforce"













































