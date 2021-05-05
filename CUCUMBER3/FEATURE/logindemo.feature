Feature: Login the page 

Scenario Outline: Login with valid credentials 

	Given User launch the browser 
	When User enter the url 
	Then User enter the <username>and<password> 
	And click on login button 
	And verify the apge title 
	Then user select the country
	Then User enter "<email>" and "<address>" and "<phone>"
	Then User click on save button
	And verify the page title
	Then closing the browser
	
	
	Examples: 
	
	
		| username | password | email | address | phone |
		| mani    | 12345  | mani@gmail.com | st.thomas street | 8013645136 |
		|ram  | 12345  | ram12@gmail.com | kanan street | 9564123710 |
		
		
		
