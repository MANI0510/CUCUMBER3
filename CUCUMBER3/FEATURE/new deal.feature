Feature: Add new deal

Scenario: Login with valid credentials
   Given User Launch the browser
   When User enter the URL "https://www.freecrm.com/"
   Then User click the login button
   And User enter the email id
   And User enter the email password   
   And User click on login button
   Then User verify the loginpage
   When click on add button in new deal
   Then Enter the User info
   And click on save button
   Then veriy the page title
   Then close teh browser
   