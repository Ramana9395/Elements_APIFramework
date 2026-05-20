package utilities;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestContext {
    public RequestSpecification request;
    public Response response;
    public String accessToken;
    public static String facultyId;
}