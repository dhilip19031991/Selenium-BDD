@regression
Feature: Web_fb_Login Page with Scenario outline

#Background: Browser launch
#Given launch the url


Scenario Outline: Validation of Login Page
Given launching url
When user enters the userone "<username>"
And user enters the passone "<password>"
#And clicks the fblogin button
#Then user is directed to the fb home page

Examples:
|username|password|
|Mary|1234|
|Muthu|4567|
|Dhilip|5436|


 Scenario: Login with valid credentials
        Given user is on login page
        When Enter valid UserName
        And Enter valid Password
        And Click the login button2 
        Then user is redirected to the home Page

# marymargaret.albert@expleogroup.com
# Maggy@2008
