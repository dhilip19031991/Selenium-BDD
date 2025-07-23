@smk
Feature: Add a new training

Scenario Outline: Validating the creation of new training

Given launch the employee training url "http://10.192.190.130:3000/"
When click the add training button
And verify the user is navigated to the add training page
And Select the project name "<index>"
And enter the employee name "<name>"
And enter the course "<course>"
And enter the trainer name "<trainerName>"
And select the training type "<trainingType>"
#And enter the start date "21/07/2025"
#And enter the end date "22/07/2025"
#And select the status "Completed"
And enter the percentage completed "<percentage>"
And click the add button 
Then verify if the page is navigated to details page

Examples: 
|index|name|course|trainerName|trainingType|percentage|
|1|Arun|Selenium|Kumar|Udemy|80|
|2|Muthu|Playwright|Navin|Udemy|70|
|3|Divya|Cypress|Priya|Coursera|85|
|4|Divya|Cypress|Priya|Coursera|85|
|5|Divya|Cypress|Priya|Coursera|85|





