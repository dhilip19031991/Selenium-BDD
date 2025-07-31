package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static io.restassured.RestAssured.given;

public class ReactApp_Api_DELETE {
    private String response4;

    @When("I send a DELETE request to the API with endpoint {string}")
    public void i_send_a_delete_request_to_the_api_with_endpoint(String endpointC) {
        String response4 = given().log().all().header("Content-Type", "application/json")
                .when().delete(endpointC).then().log().all().assertThat().statusCode(204)
                .extract().asString();

        this.response4 = response4;

    }

    @Then("I should receive the delete response")
    public void i_should_receive_the_delete_response() {
        System.out.println(response4);

    }

    @Then("verify if the status code has {string}")
    public void verify_if_the_status_code_has(String codeDel) {
        boolean status4 = response4.contains(codeDel);
        if (status4) {
            System.out.println("Deleted Successfully : " + codeDel);
        } else {
            System.out.println("Received the error code");
        }

    }

}
