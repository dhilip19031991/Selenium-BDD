Feature: Dhilip_React API training
@demo
Scenario: Get method using react app all training records
Given url and getting all training records
Then verify response code should be 200
Then verify response has list of trainings
Then print first training record