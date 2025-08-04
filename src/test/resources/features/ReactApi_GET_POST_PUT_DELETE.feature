@smoke
Feature: Mary_Web_ReactApp_ API

Background:
  Given The base URI of API is "http://10.192.190.130:5000"

Scenario: Perform full CRUD cycle for /api/trainings
  When I send a POST request to the API with endpoint "/api/trainings" and name "Merlyn"
  Then I should receive the post response 
  And verify the status code is "201"

  When I send a PUT request to the API with endpoint "/api/trainings/"
  Then I should receive the response3 
  And the status code contains "200"

  When I send a GET request to the API with endpoint "/api/trainings"
  Then I should receive the response 
  And the status code is "200"

  When I send a DELETE request to the API with endpoint "/api/trainings/"
  Then I should receive the delete response 
  And verify if the status code has "204"