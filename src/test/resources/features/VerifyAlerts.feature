
@smoke
Feature: Mary_Web_Verify Simple and Confirm Alerts 

  Background:
  Given I navigate to the automation practice page

  Scenario: Handling Simple Alert
   
    When I enter "<name>" in the alert textbox
    And I click on the Alert button
    Then an alert with text containing "<name>" should appear
    And accept the alert

  Scenario: Handling confirm Alert
   
    When I enter "<name>" in the alert textbox
    And I click on the Confirm button
    Then a confirm box with text containing "<name>" should appear
    And dismiss the alert

    Examples: 
    |name|
    |Muthu|
    |Dhilip|