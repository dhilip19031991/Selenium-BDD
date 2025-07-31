@smokeD
Feature: Mary_Web_ReactApp_ API_PUT


Scenario: Verify PUT /api/trainings returns 200 status

Given The base URI of API is "http://10.192.190.130:5000"
When I send a PUT request to the API with endpoint "/api/trainings"
Then I should receive the response 
And the status code is "200"
