@regression
Feature: Web_AutomationExercise_Functionalities

Scenario: verify test case page works
Given Given User is on the home page
Then verify test cases option is visible
When clicks on test cases page
Then user navigates to test page successfully

Scenario: verify product searched in search option  
Given Given User is on the home page
Then click on product option
Then verify user is navigated to all products page
Then  Enter product name in search input "T-shirt"
Then click searchoption button
Then verify searched product is visible
Then verify searched product "T-shirt" are visible

Scenario: Register User with existing email
Given User is on the home page
When clicks on the Click on Signup / Login button
Then Verify New User Signup is visible
Then enter name "testUser"
Then already registered email address "testuser1@1991.com"
When Click Signup button
Then Verify error Email Address already exist is visible

Scenario: verify product details visible
Given User is on the home page
Then verify product option is visible
When click on product option
Then verify user is navigated to all products page
When Click on View Product of first product
Then verify product name, price and availability

Scenario: ContactUs Form without file upload
Given User is on the home page
Then Verify Contact Us is visible
When Click on Contact Us button
Then enter name in contact us form "abcd" 
Then enter email in contact us form "abcb@xyz.com"
Then enter subject in contact us form "Checking"
Then enter message in contact us form "New Message"
Then Click Submit in contact us form
When Click OK alert in contact us form
Then Verify success message is visible