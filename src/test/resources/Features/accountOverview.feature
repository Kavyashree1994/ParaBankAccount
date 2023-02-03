Feature: Accounts Overview feature
  Description: This feature will fetch all accounts and available balance
  
	Scenario Outline: Open accounts overview and fetch all accounts and available balance 
	Given Open the browser
	When Enter the URL "https://parabank.parasoft.com/parabank/index.htm?"
	And Enter registered <username> and <password>
	And Click on login button
	Then User must successfully login to the Account page
	When User click on Open New Account
	And User should select the Account type
	And User should select existing account to tranfer fund to new account
	And Click on open new account
	Then User can view New account opened message "Account Opened!"
  When  click on accounts overview 
  And user should fetch all accounts and available balance
  Then Logout of the application
  And close browser
  Examples:
	|username|password|
	|Drithi|drithi@123|
