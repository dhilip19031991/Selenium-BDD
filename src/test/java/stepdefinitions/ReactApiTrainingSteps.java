package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class ReactApiTrainingSteps {

private Response response;

@Given("url and getting all training records")
    public void url_and_getting_all_training_records() {
    response = RestAssured
    .given()
    .header("Accept", "application/json")
    .when()
    .get("http://10.192.190.130:5000/api/trainings")
    .then()
    .extract()
    .response();
}
@Then("verify response code should be {int}")
public void verify_response_code_should_be(int expectedstatuscode) {
  Assert.assertEquals(expectedstatuscode, response.getStatusCode());
}
@Then("verify response has list of trainings")
public void verify_response_has_list_of_trainings() {
  Assert.assertFalse(response.jsonPath().getList("$").isEmpty());
}
@Then("print first training record")
public void print_first_training_record() {
List<Map<String, Object>> trainings = response.jsonPath().getList("$");
    if (!trainings.isEmpty()) {
        System.out.println("First training record: " + trainings.get(0));
    } else {
        System.out.println("No training records found");
    }
}
}
