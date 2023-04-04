Feature: Login sceanarios of SalesForce application LogIn Module

@TC1 @smoke @story1 @priority0
Scenario: TC1 Login into  SalesForce with valid username and clear password 
Given User is on "LoginPage"
When user enter into Textbox "Username" "harshini@software.com"
Then user enter into Textbox "Password" ""
Then click on  Button "Login"
And validate text "ErrorMessage" "Please enter your password."

@TC2 @regression @story1 @priority1
Scenario: TC2 Login into  SalesForce with valid username and password
Given User is on "LoginPage"
When user enter into Textbox "Username" "harshini@software.com"
Then user enter into Textbox "Password" "Test@123"
Then click on  Button "Login"
And validate title "Title" "Home Page ~ Salesforce - Developer Edition"

@TC3
Scenario: TC3 Check RememberMe
Given User is on "LoginPage"
When user enter into Textbox "Username" "harshini@software.com"
Then user enter into Textbox "Password" "Test@123"
When check the Box "RememberMe"
Then click on  Button "Login"
Then click on  Button "UserMenuDropDown"
Then click on  Button "Logout"
And validate text "UsernameIdentification" "harshini@software.com"

@TC4A
Scenario: TC4A Enter ForgotPassword
Given User is on "LoginPage"
When check the Box "ForgotPassword"
Then user enter into Textbox "UsernameInForgotPswd" "harshini@software.com"
Then click on  Button "Continue"
And validate text "Text" "Check Your Email"

@TC4B
Scenario: TC4B Invalid Username and Password
Given User is on "LoginPage"
When user enter into Textbox "Username" "123"
Then user enter into Textbox "Password" "22131"
Then click on  Button "Login"
And validate text "Text1" "Please check your username and password. If you still can't log in, contact your Salesforce administrator."
