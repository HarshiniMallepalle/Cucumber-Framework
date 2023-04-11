Feature: Login sceanarios of SalesForce application Accounts Module

@TC10
Scenario: TC10 CreateNewAccount
Given User is on "LoginPage"
When user enter into Textbox "Username" "harshini@software.com"
Then user enter into Textbox "Password" "Test@123"
Then click on  Button "Login"
Given User is on "AccountsPage"
Then click on  Link "AccountsTab"
Then User ThreadSleepWait 2000
Then Switch to ActiveElement
Then click on  Link "ClosePopUp"
Then click on  Button "NewButton"
Then user enter into Textbox "AccountName" "HarshSaanvi"
Then select from DropDown "TypeDropDown" "Technology Partner"
Then User ThreadSleepWait 3000
Then select from DropDown "CustomerPriority" "High"
Then click on  Link "SaveNewAccount"
And validate text "validateAccountName" "HarshSaanvi"

@TC11
Scenario: TC11 CreateNewView
Given User is on "LoginPage"
When user enter into Textbox "Username" "harshini@software.com"
Then user enter into Textbox "Password" "Test@123"
Then click on  Button "Login"
Given User is on "AccountsPage"
Then click on  Link "AccountsTab"
Then User ThreadSleepWait 3000
Then Switch to ActiveElement
Then click on  Link "ClosePopUp"
Then click on  Link "CreateNewView"
Then User ThreadSleepWait 2000
Then user enter into Name "EnterViewname" 
Then click on  Button "EnterViewUniqueName"
Then User ThreadSleepWait 2000
Then clear the Textbox "EnterViewUniqueName"
Then user enter into Name "EnterViewUniqueName" 
Then click on  Button "Save"
Then User ThreadSleepWait 3000
Then validate ValueFromList "ViewListBox" 


@TC12
Scenario: TC12 EditViewName
Given User is on "LoginPage"
When user enter into Textbox "Username" "harshini@software.com"
Then user enter into Textbox "Password" "Test@123"
Then click on  Button "Login"
Given User is on "AccountsPage"
Then click on  Link "AccountsTab"
Then User ThreadSleepWait 2000
Then Switch to ActiveElement
Then click on  Link "ClosePopUp"
Then click on  Link "ViewListBox"
Then click on  Button "Edit"
Then click on  Button "EnterViewname"
Then clear the Textbox "EnterViewname"
Then user enter into Textbox "EnterViewname" "HarshiniSrinivas"
Then select from DropDown "Field" "Account Name"
Then select from DropDown "Operator" "contains"
Then clear the Textbox "Value"
Then user enter into Textbox "Value" "a"
Then click on  Button "Save"
And validate title "Title" "Accounts ~ Salesforce - Developer Edition"


@TC13
Scenario: TC13 MergeAccounts
Given User is on "LoginPage"
When user enter into Textbox "Username" "harshini@software.com"
Then user enter into Textbox "Password" "Test@123"
Then click on  Button "Login"
Given User is on "AccountsPage"
Then click on  Link "AccountsTab"
Then User ThreadSleepWait 2000
Then Switch to ActiveElement
Then click on  Link "ClosePopUp"
Then click on  Link "MergeAccounts"
Then user enter into Textbox "FindAccountsText" "*a*"
Then click on  Link "FindAccounts"
When check the Box "FirstCheckBox"
When check the Box "SecondCheckBox"
Then click on  Button "Next"
Then click on  Button "MergeAccountssave"
Then Switch to alert accept
And validate text "validateAccountsHome" "Home"


@TC14
Scenario: TC14 CreateAccountReport
Given User is on "LoginPage"
When user enter into Textbox "Username" "harshini@software.com"
Then user enter into Textbox "Password" "Test@123"
Then click on  Button "Login"
Given User is on "AccountsPage"
Then click on  Link "AccountsTab"
Then User ThreadSleepWait 2000
Then Switch to ActiveElement
Then click on  Link "ClosePopUp"
Then click on  Link "AccountsLastActivity"
Then click on  Button "DateFieldDropDown"
Then click on  Link "CreateDate"
Then click on  Button "FromCalendarIcon"
Then click on  Link "FromTodayCalendar"
Then click on  Button "ToCalendarIcon"
Then click on  Link "ToTodayCalendar"
Then click on  Button "SaveReport"
Then user enter into Textbox "ReportName" "SSS5"
Then click on  Button "ReportUniqueName"
Then clear the Textbox "ReportUniqueName"
Then user enter into Name "ReportUniqueName" 
#Then user enter into Textbox "ReportUniqueName" "S5"
Then User ThreadSleepWait 2000
Then click on  Button "SaveAndRunReport"
Then User ThreadSleepWait 3000
And validate text "ReportText" "Report Generation Status:"
And validate title "Title" "SSS5 ~ Salesforce - Developer Edition"




































