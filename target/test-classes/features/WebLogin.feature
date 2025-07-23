@smoke
Feature: Mary_Web_Login_Page

    Scenario: Login with valid credentials
        Given user is on login page
        When Enter valid UserName
        And Enter valid Password
        And Click the login button2 
        Then user is redirected to the home Page

# marymargaret.albert@expleogroup.com
# Maggy@2008