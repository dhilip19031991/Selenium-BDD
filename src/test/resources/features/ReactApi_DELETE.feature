@smoke
Feature: Mary_Web_ReactApp_ API_DELETE

@delete
Scenario: Verify DELETE /api/trainings returns 204 status

Given The base URI of API is "http://10.192.190.130:5000"
When I send a DELETE request to the API with endpoint "/api/trainings"
Then I should receive the response 
And verify the status code has "204"
