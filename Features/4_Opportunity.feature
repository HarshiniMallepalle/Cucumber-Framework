Feature: Login sceanarios of SalesForce application Opportunity Module

@TC15
Scenario: TC15 VerifyOpportunities
Given User is on "LoginPage"
When user enter into Textbox "Username" "harshini@software.com"
Then user enter into Textbox "Password" "Test@123"
Then click on  Button "Login"
Given User is on "OpportunityPage"
Then click on  Link "OpportunityTab"
Given User is on "AccountsPage"
Then User ThreadSleepWait 3000
Then Switch to ActiveElement
Then click on  Link "ClosePopUp"
Given User is on "OpportunityPage"
Then User ThreadSleepWait 2000
Then click on  Link "VerifyOppurtunitiesDropDown"
Then validate DropdownOppty "DropDownView"



@TC16
Scenario: TC16 CreateOpportunities
Given User is on "LoginPage"
When user enter into Textbox "Username" "harshini@software.com"
Then user enter into Textbox "Password" "Test@123"
Then click on  Button "Login"
Given User is on "OpportunityPage"
Then click on  Link "OpportunityTab"
Given User is on "AccountsPage"
Then User ThreadSleepWait 3000
Then Switch to ActiveElement
Then click on  Link "ClosePopUp"
Given User is on "OpportunityPage"
Then User ThreadSleepWait 2000
Then click on  Button "New"
Then user enter into Textbox "OppurtunityName" "SHPSPSS"
Then click on  Button "AccountName"
Then clear the Textbox "AccountName"
Then click on  Button "SearchIcon"
Then Switch to NewWindow 1
Then switch to frame "Frame"
Then click on  Link "AccountNameLink"
Then Switch to NewWindow 0
Then click on  Button "CloseDate"
Then select from DropDown "StageDropDown" "Needs Analysis"
Then click on  Button "Probability"
Then clear the Textbox "Probability"
Then user enter into Textbox "Probability" "21"
Then select from DropDown "LeadSource" "Phone Inquiry"
Then click on  Button "Campaing"
Then clear the Textbox "Campaing"
Then click on  Button "CampaingSearchIcon"
Then Switch to NewWindow 1
Then switch to frame "Frame"
Then click on  Link "CampaingLink"
Then Switch to NewWindow 0
Then click on  Button "SaveOppty"
And validate title "Title" "Opportunity: SHPSPSS ~ Salesforce - Developer Edition"


@TC17
Scenario: TC17 OpportunitePipelineReport
Given User is on "LoginPage"
When user enter into Textbox "Username" "harshini@software.com"
Then user enter into Textbox "Password" "Test@123"
Then click on  Button "Login"
Given User is on "OpportunityPage"
Then click on  Link "OpportunityTab"
Given User is on "AccountsPage"
Then User ThreadSleepWait 3000
Then Switch to ActiveElement
Then click on  Link "ClosePopUp"
Given User is on "OpportunityPage"
Then User ThreadSleepWait 2000
Then click on  Link "Pipeline"
And validate title "Title" "Opportunity Pipeline ~ Salesforce - Developer Edition"

@TC18
Scenario: TC18 opportuniteStuckReport
Given User is on "LoginPage"
When user enter into Textbox "Username" "harshini@software.com"
Then user enter into Textbox "Password" "Test@123"
Then click on  Button "Login"
Given User is on "OpportunityPage"
Then click on  Link "OpportunityTab"
Given User is on "AccountsPage"
Then User ThreadSleepWait 3000
Then Switch to ActiveElement
Then click on  Link "ClosePopUp"
Given User is on "OpportunityPage"
Then User ThreadSleepWait 2000
Then click on  Link "StuckOpportunities"
And validate title "Title" "Stuck Opportunities ~ Salesforce - Developer Edition"

@TC19
Scenario: TC19 opportunityQuaterlySummaryReport
Given User is on "LoginPage"
When user enter into Textbox "Username" "harshini@software.com"
Then user enter into Textbox "Password" "Test@123"
Then click on  Button "Login"
Given User is on "OpportunityPage"
Then click on  Link "OpportunityTab"
Given User is on "AccountsPage"
Then User ThreadSleepWait 3000
Then Switch to ActiveElement
Then click on  Link "ClosePopUp"
Given User is on "OpportunityPage"
Then User ThreadSleepWait 2000
Then select from DropDown "Interval" "Previous FQ"
Then select from DropDown "Include" "All Opportunities"
Then click on  Button "RunReport"
And validate title "Title" "Opportunities ~ Salesforce - Developer Edition"












