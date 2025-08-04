
@api
Feature: Mary_Web_ReactApp_ API

Background:
Given The base URI of API is "http://10.192.190.130:5000"


Scenario: Verify GET /api/trainings returns 200 status
When I send a GET request to the API with endpoint "/api/trainings"
Then I should receive the response 
And the status code is "200"


Scenario: Verify POST /api/trainings returns 201 status

When I send a POST request to the API with endpoint "/api/trainings"
Then I should receive the post response 
And verify the status code is "201"



Scenario: Verify PUT /api/trainings returns 200 status

When I send a PUT request to the API with endpoint "/api/trainings/688bc565f91ef3e7e477ccda"
Then I should receive the response3 
And the status code contains "200"


Scenario: Verify DELETE /api/trainings returns 204 status

When I send a DELETE request to the API with endpoint "/api/trainings/688bc53cf91ef3e7e477ccd5"
Then I should receive the delete response 
And verify if the status code has "204"



