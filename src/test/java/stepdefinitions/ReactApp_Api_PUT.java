package stepdefinitions;

import io.cucumber.java.en.When;
import static io.restassured.RestAssured.given;

public class ReactApp_Api_PUT {

    private String response3;

    @When("I send a PUT request to the API with endpoint {string}")
    public void i_send_a_put_request_to_the_api_with_endpoint(String endpoint) {

        given().log().all().header("Content-Type", "application/json")
                .body("")
                .when().put(endpoint).then().log().all().assertThat().statusCode(200).extract().asString();

    }

}
