@smoke
Feature: Web_SampleWebsite_Register_Form_Scenario

Scenario Outline:
Given Launch the url "file:///C:/Users/malbert/Desktop/htmlFolder/index.html"
When Enter the name "<name>"
And Enter the email "<email>"
And Enter the password "<password>"
Then click the Register button
And click the forgot passord link

Examples:
|name|email|password|
|Mary|a.b@gmail.com|1234|
|Muthu|c.d@gmail.com|3456|
