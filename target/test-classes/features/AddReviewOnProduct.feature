@santity9
Feature: Mary_Web_Add Review On Product

Background:
Given launching the url "https://www.automationexercise.com/"


Scenario Outline: Adding review for product and validating response
When click the product button
And Verify user entered the all products page
And click on view product
And verify Write your Review element is visible
And enter your name "<name>"
And enter the email address "<email>"
And write your review "<review>"
And click the submit button
Then validate the response message

Examples:
|name|email|review|
|Mary|a.b@gmail.com|good quality|
#|Muthu|b.c@gmail.com|nice product|





