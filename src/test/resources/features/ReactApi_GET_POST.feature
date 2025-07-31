
@smoke_API
Feature: Mary_Web_ReactApp_ API GET and POST

@get
Scenario: Verify GET /api/trainings returns 200 status

Given The base URI of API is "http://10.192.190.130:5000"
When I send a GET request to the API with endpoint "/api/trainings"
Then I should receive the response 
And the status code is "HTTP/1.1 200 OK"

@post
Scenario: Verify POST /api/trainings returns 201 status

Given The base URI of API is "http://10.192.190.130:5000"
When I send a POST request to the API with endpoint "/api/trainings"
Then I should receive the post response 
And verify the status code is "HTTP/1.1 201 Created"


