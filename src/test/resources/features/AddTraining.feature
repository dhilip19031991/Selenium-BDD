@smk
Feature: Add a new training

Scenario: Validating the creation of new training

Given launch the employee training url
When click the add training button
And verify the user is navigated to the add training page
And Select the project name "ABC"
And enter the employee name "Arun"
And enter the course "New"
And enter the trainer name "Kumar"
And select the training type "Udemy"
And enter the start date "21/07/2025"
And enter the end date "22/07/2025"
And select the status "Completed"
And enter the percentage completed "80"
And click the add button 
Then verify if the page is navigated to details page




