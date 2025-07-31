package api;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

public class apiCall {

    @Test
    public void test1() {

        // get call

        RestAssured.baseURI = "http://10.192.190.130:5000/";
        String response = given().log().all().header("Content-Type", "application/json")
                .when().get("/api-docs/").then().log().all().assertThat().statusCode(200)
                .extract().asString();

        System.out.println("Response: " + response);

    }

}
