@smoke
Feature: API_React_Add a new training_ Invalid input



Scenario Outline: Creation of new Training with Empty EmployeeName field

Given launch the employee training url "http://10.192.190.130:3000/"
When click the add training button
And verify the user is navigated to the add training page
And Select the project name "<index>"
And enter the name of employee 0
And enter the course "<course>"
And enter the name of trainer 6
And select the training type "<trainingType>"
And enter the start date "<startDate>"
And enter the end date "<endDate>"
And select the status "<status>"
And enter the completion percentage 100
And click the add button 
Then verify if the error msg is shown

Examples: 
|index|name|course|trainerName|trainingType|startDate|endDate|status|percentage|
|0|Arun|Selenium|Kumar|0|07232025|07252025|0|0|





Scenario Outline: Creation of new Training with Empty course field

Given launch the employee training url "http://10.192.190.130:3000/"
When click the add training button
And verify the user is navigated to the add training page
And Select the project name "<index>"
And enter the name of employee 8
#And enter the course 0
And enter the name of trainer 6
And select the training type "<trainingType>"
And enter the start date "<startDate>"
And enter the end date "<endDate>"
And select the status "<status>"
And enter the completion percentage 100
And click the add button 
Then verify if the error msg is shown

Examples: 
|index|name|course|trainerName|trainingType|startDate|endDate|status|percentage|
|0|Arun|Selenium|Kumar|0|07232025|07252025|0|0|



Scenario Outline: Creation of new Training with Empty trainerName field

Given launch the employee training url "http://10.192.190.130:3000/"
When click the add training button
And verify the user is navigated to the add training page
And Select the project name "<index>"
And enter the name of employee 8
And enter the course "<course>"
#And enter the name of trainer 6
And select the training type "<trainingType>"
And enter the start date "<startDate>"
And enter the end date "<endDate>"
And select the status "<status>"
And enter the completion percentage 100
And click the add button 
Then verify if the error msg is shown

Examples: 
|index|name|course|trainerName|trainingType|startDate|endDate|status|percentage|
|0|Arun|Selenium|Kumar|0|07232025|07252025|0|0|


Scenario Outline: Creation of new Training with Empty text fields

Given launch the employee training url "http://10.192.190.130:3000/"
When click the add training button
And verify the user is navigated to the add training page
And Select the project name "<index>"
#And enter the name of employee 8
#And enter the course "<course>"
#And enter the name of trainer 6
And select the training type "<trainingType>"
And enter the start date "<startDate>"
And enter the end date "<endDate>"
And select the status "<status>"
And enter the completion percentage 100
And click the add button 
Then verify if the error msg is shown

Examples: 
|index|name|course|trainerName|trainingType|startDate|endDate|status|percentage|
|0|Arun|Selenium|Kumar|0|07232025|07252025|0|0|






