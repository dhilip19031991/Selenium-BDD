@regression
Feature: Mary_Web_View Category Products

Background:
Given launching the url "https://www.automationexercise.com/"


Scenario: View products based on category
When click the product button
And Verify user entered the all products page
And click on Category Women
And click on a sub category 
And Verify that category page is displayed and confirm text "WOMEN - TOPS PRODUCTS"
And click on Category Men
And Verify that the category page is displayed and confirm text "Men - Tshirts Products"






