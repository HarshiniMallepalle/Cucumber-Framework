Feature: Login sceanarios of SalesForce application LogIn Module
@TC2 @regression @story1 @priority1
Scenario: TC2 Login into  SalesForce with valid username and password
Given User is on "LoginPage"
When user enter into Textbox "Username" "harshini@software.com"
Then user enter into Textbox "Password" "Test@123"
Then click on  Button "Login"
Then User ThreadSleepWait 2000
And validate title "Title" "Home Page ~ Salesforce - Developer Edition"
