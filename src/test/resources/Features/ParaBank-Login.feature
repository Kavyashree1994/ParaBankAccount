Feature: ParaBank-Login Feature
  Description: This feature will test a Login feature
  
	Scenario Outline: Log-in with valid username and password 
	Given Open the browser
	When Enter the URL "https://parabank.parasoft.com/parabank/index.htm?"
	And Enter registered <username> and <password>
	And Click on login button
	Then User must successfully login to the Account page
	
	Examples:
	|username|password|
	|Drithi|drithi@123|