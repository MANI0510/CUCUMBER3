Feature: Login the page 

Scenario: Login with valid credentials 

	Given User launch the browser 
	When User enter the url 
	Then User enter the username and password
	|mani | 12345 |
	And click on login button 
	And verify the apge title 
	Then user select the country
	Then User enter contact details
	| sivan koil |mani@gmail.com | 8023625145 |
	Then User click on save button
	And verify the page title
	Then closing the browser
	