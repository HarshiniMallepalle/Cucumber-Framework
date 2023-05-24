Feature: Login sceanarios of SalesForce application Leads Module

@TC20
Scenario: TC20 ClickLeadsTab
Given User is on "LoginPage"
When user enter into Textbox "Username" "harshini@software.com"
Then user enter into Textbox "Password" "Test@123"
Then click on  Button "Login"
Given User is on "LeadsPage"
Then click on  Link "LeadsTab"
Given User is on "AccountsPage"
Then User ThreadSleepWait 3000
Then Switch to ActiveElement
Then click on  Link "ClosePopUp"
Given User is on "LeadsPage"
Then User ThreadSleepWait 3000
And validate title "Title" "Leads: Home ~ Salesforce - Developer Edition"


@TC21
Scenario: TC21 LeadsDropDown
Given User is on "LoginPage"
When user enter into Textbox "Username" "harshini@software.com"
Then user enter into Textbox "Password" "Test@123"
Then click on  Button "Login"
Given User is on "LeadsPage"
Then click on  Link "LeadsTab"
Given User is on "AccountsPage"
Then User ThreadSleepWait 3000
Then Switch to ActiveElement
Then click on  Link "ClosePopUp"
Given User is on "LeadsPage"
Then User ThreadSleepWait 3000
Then click on  Button "ViewLeads"
Then User ThreadSleepWait 3000
Then validate Dropdown "LeadsDropDown"
|All Open Leads|
|My Unread Leads|
|Recently Viewed Leads|
|Today's Leads|
|View - Custom 1|
|View - Custom 2|


@TC22
Scenario: TC22 LeadsDropDown
Given User is on "LoginPage"
When user enter into Textbox "Username" "harshini@software.com"
Then user enter into Textbox "Password" "Test@123"
Then click on  Button "Login"
Given User is on "LeadsPage"
Then click on  Link "LeadsTab"
Given User is on "AccountsPage"
Then User ThreadSleepWait 3000
Then Switch to ActiveElement
Then click on  Link "ClosePopUp"
Given User is on "LeadsPage"
Then User ThreadSleepWait 3000
Then click on  Button "ViewLeads"
Then click on  Link "Today'sLeads"
Given User is on "UserMenuDropDownPage"
Then click on  Button "UserMenuDropDownList"
Then click on  Button "Logout"
Given User is on "LoginPage"
Then User ThreadSleepWait 2000
When user enter into Textbox "Username" "harshini@software.com"
Then user enter into Textbox "Password" "Test@123"
Then click on  Button "Login"
Given User is on "LeadsPage"
Then click on  Link "LeadsTab"
Then click on  Button "Go"
Then validate ValueLeadList "LeadsView" "Today's Leads"

@TC23
Scenario: TC23 LeadsHomePage
Given User is on "LoginPage"
When user enter into Textbox "Username" "harshini@software.com"
Then user enter into Textbox "Password" "Test@123"
Then click on  Button "Login"
Given User is on "LeadsPage"
Then click on  Link "LeadsTab"
Given User is on "AccountsPage"
Then User ThreadSleepWait 3000
Then Switch to ActiveElement
Then click on  Link "ClosePopUp"
Given User is on "LeadsPage"
Then User ThreadSleepWait 3000
Then click on  Button "ViewLeads"
Then click on  Link "AllOpenLeads"
Then click on  Link "LeadsTab"
Then click on  Button "ViewLeads"
Then click on  Link "Today'sLeads"
Then validate ValueLeadList "LeadsView" "Today's Leads"


@TC24
Scenario: TC24 NewLead
Given User is on "LoginPage"
When user enter into Textbox "Username" "harshini@software.com"
Then user enter into Textbox "Password" "Test@123"
Then click on  Button "Login"
Given User is on "LeadsPage"
Then click on  Link "LeadsTab"
Given User is on "AccountsPage"
Then User ThreadSleepWait 3000
Then Switch to ActiveElement
Then click on  Link "ClosePopUp"
Given User is on "LeadsPage"
Then User ThreadSleepWait 3000
Then click on  Button "New"
Then user enter into Textbox "LastName" "Gosan"
Then user enter into Textbox "CompanyName" "PraSan"
Given User is on "OpportunityPage"
Then click on  Button "Save"
Given User is on "LeadsPage"
And validate text "ValidateText" "Gosan"












