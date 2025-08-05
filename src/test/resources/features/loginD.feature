@regression
Feature: Web_Login functionality

Scenario: Successful login
Given User is on the login page
When User enters username "testuser1@1991.com"
And User enters password "testuser123"
And User clicks the login button
Then Login should be successful

Scenario Outline: Successful login multiple users
Given User is on the login page
When User enters username "<username>"
And User enters password "<password>"
And User clicks the login button
Then Login should be successful

Examples:
|username|password| 
|testuser1@1991.com|testuser123|
|testuser2@1992.com|testuser1234|

Scenario: Logout User
Given User is on the login page
When User enters username "testuser1@1991.com"
When User enters password "testuser123"
When User clicks the login button
Then User should be Logged in as "testuser1"
Then Click Logout button