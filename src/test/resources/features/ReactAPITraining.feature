@regression
Feature: Dhilip_React API training
@demo
Scenario: Get method using react app all training records
Given url and getting all training records
Then verify response code should be 200
Then verify response has list of trainings
Then print first training record

Scenario: Crud react app training flow
Given url and getting all training records
Then verify response code should be 200
Then verify response has list of trainings
Then print first training record
When I create a new training record
Then the response code should be 201
And I store the training ID from response
When I update the training record using stored ID
Then the response code should be 200
When I delete the training record using stored ID
Then the response code should be 204