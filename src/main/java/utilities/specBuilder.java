package utilities;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class specBuilder 
{
	public static RequestSpecification req;
	public static RequestSpecification getRequestSpec(String token) throws FileNotFoundException
	{
		if(req==null)
		{
		PrintStream log = new PrintStream(new FileOutputStream("logging.txt"));
		req= new RequestSpecBuilder()
				.addHeader("Authorization", "Bearer " + token)
				.addHeader("Module", "CAMS Manager")
				.addHeader("Referer", "https://qathesissmlite.thesiscloud-rd.com/")
				.addFilter(RequestLoggingFilter.logRequestTo(log))
				.addFilter(ResponseLoggingFilter.logResponseTo(log))
				.setContentType(ContentType.JSON)
				.build();
		return req;
		}
		return req;
	}
	
	public static ResponseSpecification getResponseSpec()
	{
		return new ResponseSpecBuilder()
				.expectStatusCode(200)
				.build();
	}
}
