package pages;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ReactApiTraining {
public Response allTrainingRecords(){
    return RestAssured
    .given()
    .header("Accept", "application/json")
    .when()
    .get("http://10.192.190.130:5000/api/trainings")
    .then()
    .extract()
    .response();
}
}
