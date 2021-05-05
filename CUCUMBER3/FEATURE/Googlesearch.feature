Feature: Validate the google search 

Scenario: google search

    Given user lauch the browser
    And user is on google search page
    When user enter the text in search page
    Then click on search button
    Then click on navigate page
    And Veriy the title of the page
    And close the browser