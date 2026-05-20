package stepDefinitions;

import static io.restassured.RestAssured.given;

import java.io.FileNotFoundException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import resources.APIResources;
import resources.TestDataBuild;
import utilities.TestContext;
import utilities.specBuilder;


public class Faculty_CRUD
{
	
	 RequestSpecification req;
	 Response response;
	 TestContext context;
	 int facultyId;
	 JsonPath jpath;
	 String responseBody;
	 APIResources resourceAPI;
	 
	 TestDataBuild dataBuild = new TestDataBuild();

	    public Faculty_CRUD(TestContext context) {
	        this.context = context;
	    }
	    
	@Given("Add Faculty Payload with {string} {string} {string}")
	public void add_faculty_payload_with(String fname,String lname,String mname) throws FileNotFoundException {

		 req = given()
	                .spec(specBuilder.getRequestSpec(context.accessToken))
	                .body(dataBuild.addFacultyPayload(fname,lname,mname));
	}
	@When("user calls {string} with {string} http request")
	public void user_calls_add_faculty_api_with_post_http_request(String resourceName, String httpMethod) {
		
		APIResources resourceAPI = APIResources.valueOf(resourceName);

	    System.out.println("Resource URL : " + resourceAPI.getResource());

	    if(httpMethod.equalsIgnoreCase("POST"))
	    {
	        response = req.when()
	                      .post(resourceAPI.getResource());
	    }

	    else if(httpMethod.equalsIgnoreCase("DELETE"))
	    {
	        response = req.when()
	                      .delete(resourceAPI.getResource());
	    }
	}
	@Then("the API call is success with status code {int}")
	public void the_api_call_is_success_with_status_code(Integer statusCode) {

		responseBody = response.getBody().asString();

	    System.out.println("Response Body : " + responseBody);

	    jpath = new JsonPath(responseBody);

	    if(responseBody.contains("facultyID"))
	    {
	        facultyId = jpath.getInt("data.facultyID");

	        System.out.println("Captured Faculty ID : " + facultyId);
	    }

	    response.then()
	            .spec(specBuilder.getResponseSpec())
	            .statusCode(statusCode);
	}
	
	@Given("verify delete the created faculty")
	public void verify_delete_the_created_faculty() throws FileNotFoundException 
	{
		
    req = given()
            .spec(specBuilder.getRequestSpec(context.accessToken))
            .pathParam("facultyID", facultyId);
	}

}





