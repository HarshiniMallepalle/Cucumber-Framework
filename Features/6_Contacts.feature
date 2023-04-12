Feature: Login sceanarios of SalesForce application Leads Module

@TC25
Scenario: TC25 CreateNewContact
Given User is on "LoginPage"
When user enter into Textbox "Username" "harshini@software.com"
Then user enter into Textbox "Password" "Test@123"
Then click on  Button "Login"
Given User is on "ContactsPage"
Then click on  Link "ContactsTab"
Given User is on "AccountsPage"
Then User ThreadSleepWait 3000
Then Switch to ActiveElement
Then click on  Link "ClosePopUp"
Given User is on "ContactsPage"
Then User ThreadSleepWait 3000
Then click on  Button "New"
Then user enter into Textbox "LastName" "Harshini M"
Then click on  Button "ContactSearchIcon"
Given User is on "OpportunityPage"
Then User ThreadSleepWait 3000
Then Switch to NewWindow 1
Then switch to frame "Frame"
Then click on  Link "AccountNameLink"
Then Switch to NewWindow 0
Then click on  Button "Save"
Given User is on "ContactsPage"
Then User ThreadSleepWait 3000
And validate text "ValidateText" "Harshini M"

@TC26
Scenario: TC26 CreateNewViewContact
Given User is on "LoginPage"
When user enter into Textbox "Username" "harshini@software.com"
Then user enter into Textbox "Password" "Test@123"
Then click on  Button "Login"
Given User is on "ContactsPage"
Then click on  Link "ContactsTab"
Given User is on "AccountsPage"
Then User ThreadSleepWait 3000
Then Switch to ActiveElement
Then click on  Link "ClosePopUp"
Then click on  Link "CreateNewView"
Then User ThreadSleepWait 2000
Then user enter into Name "EnterViewname" 
Then click on  Button "EnterViewUniqueName"
Then User ThreadSleepWait 2000
Then clear the Textbox "EnterViewUniqueName"
Then User ThreadSleepWait 2000
Then user enter into Name "EnterViewUniqueName" 
Then click on  Button "Save"
Then User ThreadSleepWait 3000
Then validate ValueFromList "ViewListBox" 




