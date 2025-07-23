@smoke
Feature: Dhilip_Web_Register Functionality

Scenario: Register User with existing email
Given User is on the home page
When clicks on the Click on Signup / Login button
Then Verify New User Signup is visible
Then enter name "testUser"
Then already registered email address "testuser1@1991.com"
When Click Signup button
Then Verify error Email Address already exist is visible