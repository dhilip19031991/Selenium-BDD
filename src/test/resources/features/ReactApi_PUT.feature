@smoke
Feature: Mary_Web_ReactApp_ API_PUT

@put
Scenario: Verify PUT /api/trainings returns 200 status

Given The base URI of API is "http://10.192.190.130:5000"
When I send a PUT request to the API with endpoint "/api/trainings/688bc565f91ef3e7e477ccda"
Then I should receive the response3 
And the status code contains "200"
