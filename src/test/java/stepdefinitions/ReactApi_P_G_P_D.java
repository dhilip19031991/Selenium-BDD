package stepdefinitions;

import common.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import io.restassured.response.Response;

public class ReactApi_P_G_P_D extends BaseClass {
    private String trainingId;
    private Response response;
    private String responseBody;

    @Given("The base URI of API is {string}")
    public void the_base_uri_of_api_is(String baseURI) {
        RestAssured.baseURI = baseURI;
    }

    @When("I send a POST request to the API with endpoint {string} and name {string}")
    public void i_send_a_post_request_to_the_api_with_endpoint_and_name(String endpoint, String name) {
        response = given().log().all().header("Content-Type", "application/json")
                .body("{\r\n" +
                        "    \"employeeName\": \"" + name + "\",\r\n" +
                        "    \"course\": \"CSharp\",\r\n" +
                        "    \"startDate\": \"2025-05-17T00:00:00.000Z\",\r\n" +
                        "    \"endDate\": \"2025-05-18T00:00:00.000Z\",\r\n" +
                        "    \"status\": \"In Progress\",\r\n" +
                        "    \"trainerName\": \"efZyFj\",\r\n" +
                        "    \"trainingType\": \"Virtual\",\r\n" +
                        "    \"percentCompleted\": 82,\r\n" +
                        "    \"projectName\": \"HIJ\"\r\n" +
                        "}")
                .when().post(endpoint);

        responseBody = response.then().log().all().assertThat().statusCode(201).extract().asString();
        trainingId = response.jsonPath().getString("_id");
    }

    @Then("I should receive the post response")
    public void i_should_receive_the_post_response() {
        System.out.println("POST response: " + responseBody);
    }

    @Then("verify the status code is {string}")
    public void verify_the_status_code_is(String expectedStatusCode) throws InterruptedException {
        int expectedCode = Integer.parseInt(expectedStatusCode);
        int actualCode = response.getStatusCode();
        // System.out.println(actualCode == expectedCode ? "Created Successfully!" :
        // "Error code received");
        if (actualCode == expectedCode) {
            System.out.println("Created Successfully!");
            browserLaunch();
            driver.get("http://10.192.190.130:3000/");
            Thread.sleep(2000);
            driver.close();

        } else {
            System.out.println("Error code received");
        }
    }

    @When("I send a PUT request to the API with endpoint {string}")
    public void i_send_a_put_request_to_the_api_with_endpoint(String endpoint) {
        if (trainingId == null)
            throw new IllegalStateException("Training ID is null. Ensure POST ran before PUT.");

        response = given().log().all().header("Content-Type", "application/json")
                .body("{\r\n" +
                        "    \"employeeName\": \"MerlynHema\",\r\n" +
                        "    \"course\": \"Java\",\r\n" +
                        "    \"startDate\": \"2025-06-01T00:00:00.000Z\",\r\n" +
                        "    \"endDate\": \"2025-06-02T00:00:00.000Z\",\r\n" +
                        "    \"status\": \"Completed\",\r\n" +
                        "    \"trainerName\": \"UpdatedTrainer\",\r\n" +
                        "    \"trainingType\": \"Onsite\",\r\n" +
                        "    \"percentCompleted\": 100,\r\n" +
                        "    \"projectName\": \"ABC\"\r\n" +
                        "}")
                .when().put(endpoint + trainingId);

        responseBody = response.then().log().all().assertThat().statusCode(200).extract().asString();
    }

    @Then("I should receive the response3")
    public void i_should_receive_the_response3() {
        System.out.println("PUT response: " + responseBody);
    }

    @Then("the status code contains {string}")
    public void the_status_code_contains(String expectedStatusCode) throws InterruptedException {
        int expectedCode = Integer.parseInt(expectedStatusCode);
        int actualCode = response.getStatusCode();

        if (actualCode == expectedCode) {
            System.out.println("Updated Successfully!");
            browserLaunch();
            driver.get("http://10.192.190.130:3000/");
            Thread.sleep(3000);
            driver.close();

        } else {
            System.out.println("Error code received");
        }
        // System.out.println(actualCode == expectedCode ? "Updated Successfully!" :
        // "Error code received");
    }

    @When("I send a GET request to the API with endpoint {string}")
    public void i_send_a_get_request_to_the_api_with_endpoint(String endpoint) {
        response = given().log().all().header("Content-Type", "application/json")
                .when().get(endpoint);

        responseBody = response.then().log().all().assertThat().statusCode(200).extract().asString();
    }

    @Then("I should receive the response")
    public void i_should_receive_the_response() {
        System.out.println("GET response: " + responseBody);
    }

    @Then("the status code is {string}")
    public void the_status_code_is(String expectedStatusCode) {
        int expectedCode = Integer.parseInt(expectedStatusCode);
        int actualCode = response.getStatusCode();
        System.out.println(actualCode == expectedCode ? "GET request successful." : "GET request failed.");
    }

    @When("I send a DELETE request to the API with endpoint {string}")
    public void i_send_a_delete_request_to_the_api_with_endpoint(String endpoint) {
        if (trainingId == null)
            throw new IllegalStateException("Training ID is null. Ensure POST ran before DELETE.");

        response = given().log().all().header("Content-Type", "application/json")
                .when().delete(endpoint + trainingId);
    }

    @Then("I should receive the delete response")
    public void i_should_receive_the_delete_response() {
        System.out.println("DELETE response status code: " + response.getStatusCode());
    }

    @Then("verify if the status code has {string}")
    public void verify_if_the_status_code_has(String expectedStatusCode) {
        int expectedCode = Integer.parseInt(expectedStatusCode);
        int actualCode = response.getStatusCode();
        System.out.println(actualCode == expectedCode ? "Deleted Successfully!" : "Delete failed.");
    }
}
