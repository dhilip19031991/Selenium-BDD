@ss
Feature: Mary_Web_Verify Practice page

Background: 
Given launch the url "https://rahulshettyacademy.com/AutomationPractice/"

Scenario: Validation of elements in practicepage

When clicking the radio button
And enter the conuntry name "Indi"
And select the option from drop down
And click the check box
Then click the home button
And verify if navigated to home page


