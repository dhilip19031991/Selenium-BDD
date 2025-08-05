@regression
Feature: Web_Search Product

Scenario: verify product searched in search option  
Given Given User is on the home page
Then click on product option
Then verify user is navigated to all products page
Then  Enter product name in search input "T-shirt"
Then click searchoption button
Then verify searched product is visible
Then verify searched product "T-shirt" are visible