package utilities;

import io.restassured.RestAssured;

public class BaseURI {
    public static void setupBaseURI() {
        RestAssured.baseURI = "https://qacloud-usc-gateway.thesiscloud-rd.com";
    }
}