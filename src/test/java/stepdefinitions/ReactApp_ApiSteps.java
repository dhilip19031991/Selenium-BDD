package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

public class ReactApp_ApiSteps {

    private String response;
    private String response2;

    @Given("The base URI of API is {string}")
    public void the_base_uri_of_api_is(String baseURI) {

        RestAssured.baseURI = baseURI;

    }

    @When("I send a GET request to the API with endpoint {string}")
    public void i_send_a_get_request_to_the_api_with_endpoint(String endpoint) {
        String response = given().log().all().header("Content-Type", "application/json")
                .when().get(endpoint).then().log().all().assertThat().statusCode(200).extract().asString();

        this.response = response;

    }

    @Then("I should receive the response")
    public void i_should_receive_the_response() {
        System.out.println(response);

    }

    @Then("the status code is {string}")
    public void the_status_code_is(String statusCode) {
        boolean status = response.contains(statusCode);
        if (status) {
            System.out.println("Received 200 Status Code : Success");

        } else {
            System.out.println("Received the error code");
        }
    }

    @When("I send a POST request to the API with endpoint {string}")
    public void i_send_a_post_request_to_the_api_with_endpoint(String endpoint1) {
        String response2 = given().log().all().header("Content-Type", "application/json")
                .body("{\r\n" + //
                        "  \"employeeName\": \"Ramya\",\r\n" + //
                        "  \"course\": \"Selenium\",\r\n" + //
                        "  \"startDate\": \"2025-07-24\",\r\n" + //
                        "  \"endDate\": \"2025-07-24\",\r\n" + //
                        "\r\n" + //
                        "  \"status\": \"Completed\",\r\n" + //
                        "  \"trainerName\": \"Malar\",\r\n" + //
                        "  \"trainingType\": \"Udemy\",\r\n" + //
                        "  \"percentCompleted\": \"100\",\r\n" + //
                        "  \"projectName\": \"ABC\"\r\n" + //
                        "}")
                .when().post(endpoint1)
                .then().log().all().assertThat().statusCode(201)
                .extract().asString();

        this.response2 = response2;

    }

    @Then("verify the status code is {string}")
    public void verify_the_status_code_is(String code) {
        boolean status1 = response2.contains(code);
        if (status1) {
            System.out.println("Received 201 Status Code : created");

        } else {
            System.out.println("Received the error code");
        }

    }

}
