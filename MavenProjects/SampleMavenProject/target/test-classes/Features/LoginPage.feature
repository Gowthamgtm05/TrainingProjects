Feature: 
	Scenario: verify if login using invalid credentials
	
	Given user should be in adactin login
	When user should enter credentials
	And user should click the login
	Then close the browser