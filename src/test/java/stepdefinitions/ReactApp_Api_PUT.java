package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static io.restassured.RestAssured.given;

public class ReactApp_Api_PUT {

    private String response3;

    @When("I send a PUT request to the API with endpoint {string}")
    public void i_send_a_put_request_to_the_api_with_endpoint(String endpointB) {

        String response3 = given().log().all().queryParam("employee", "688b45f5f91ef3e7e477cb5b")
                .header("Content-Type", "application/json")

                .body("{\r\n" + //
                        "  \"employeeName\": \"Ramya12\",\r\n" + //
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
                .when().put(endpointB).then().log().all()
                .assertThat()
                .statusCode(200)
                .extract().asString();

        this.response3 = response3;

    }

    @Then("I should receive the response3")
    public void i_should_receive_the_response3() {
        System.out.println(response3);

    }

    @Then("the status code contains {string}")
    public void the_status_code_contains(String code3) {
        boolean status3 = response3.contains(code3);
        if (status3) {
            System.out.println("200 Status Code : success");

        } else {
            System.out.println("Received the error code");
        }

    }

}
