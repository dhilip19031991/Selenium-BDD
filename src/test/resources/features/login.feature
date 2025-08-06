@regression
Feature: Web_Demo Saas_Validating Login Functionality
  
  Scenario: Successful login
    Given I open the login page
    When I enter valid credentials
    Then I should see the homepage
    And I click logout
    And validate the response message "success"
