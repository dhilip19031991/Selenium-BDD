@regression
Feature: Mary_Web_Brand Products

Background:
Given launching the url "https://www.automationexercise.com/"


Scenario: Validating the brand page of products
When clicking product button
And Verify user entered the all products page
And click on any brand1
And verify if the user is navigated to the particular brand page "Brand - Mast & Harbour Products"
And click on any other brand 
And verify if the user is navigated to the coresponding brand page "Brand - Madame Products"
Then navigate back to the home page






