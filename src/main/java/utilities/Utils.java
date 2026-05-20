package utilities;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Utils 
{
	
	public String getJsonPath(Response response, String key)
	{
		String responseBody = response.getBody().asString();
		JsonPath js = new JsonPath(responseBody);
		return js.get(key).toString();
	}
}
