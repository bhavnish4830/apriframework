package org.testing.TestSteps;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class getmethod {

	
	public static Response getrequest(String url)
	{
		
		
		Response res= 
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(url);
		
		return res;
	}
	
	
	
	public static Response postrequest(String body,  String url)
	{
		Response res= 
				given()
				.contentType(ContentType.JSON)
				.body(body)
				.when()
				.post(url);
		
		return res;
		
		
	}
	public static Response putrequest(String body,  String url)
	{
		Response res= 
				given()
				.contentType(ContentType.JSON)
				.body(body)
				.when()
				.put(url);
		
		return res;
		
	}
	
	public static Response deletereqeust(String url)
	{
		
		Response res= 
				given()
				.contentType(ContentType.JSON)
				
				.when()
				.delete(url);
		
		return res;
	}
}
