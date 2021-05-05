@FunctionalTests
Feature: Free CRM application testing

@SmokeTest
Scenario: Login with valid credentials
Given This is a valid login test

@SmokeTest @RegressionTest
Scenario: Login with invalid credentials
Given This is a invalid login test

@RegressionTest @EndtoEndTest
Scenario: Create a contact 
Given This is a contact  test

@RegressionTest
Scenario: Create a  deal
Given This is a  deal test


@SmokeTest @RegressionTest
Scenario: Create a  task
Given This is a  task test

@SmokeTest @RegressionTest
Scenario: Verify left panel links
Given clicking on the left oanel links

@EndtoEndTest
Scenario: Search a deal 
Given This is search deal test

@EndtoEndTest
Scenario: Search a contact 
Given This is search contact test

@SmokeTest @RegressionTest
Scenario: Search a task 
Given This is search task test

@RegressionTest
Scenario: Search a docs 
Given This is search docs test

@EndtoEndTest
Scenario: Search a forms 
Given This is search forms test

@SmokeTest
Scenario: close the brower
Given This is close browser test



