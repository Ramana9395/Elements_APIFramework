package utilities;

import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class AuthUtil {

    public static String generateToken() {

        String response = given()
                .auth().preemptive().basic("tester", "password")
                .header("Referer","https://qathesissmlite.thesiscloud-rd.com/")
                .header("Content-Type","application/json")
        .when()
                .get("/api/Login/Authenticate")
        .then()
                .statusCode(200)
                .body("data.username", equalTo("tester"))
                .extract().asString();

        JsonPath js = new JsonPath(response);
        return js.getString("data.token");
    }
}