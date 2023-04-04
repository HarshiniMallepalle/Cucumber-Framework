Feature: Login sceanarios of SalesForce application UserMenuDropDown Module

@TC5
Scenario: TC5 UserMenuDropDown
Given User is on "UserMenuDropDownPage"
When user enter into Textbox "Username" "harshini@software.com"
Then user enter into Textbox "Password" "Test@123"
Then click on  Button "Login"
Then click on  Link "UserMenuDropDown"
And validate text "DropDownText1" "My Profile"
And validate text "DropDownText2" "My Settings"
And validate text "DropDownText3" "Developer Console"
And validate text "DropDownText4" "Switch to Lightning Experience"
And validate text "DropDownText5" "Logout"


