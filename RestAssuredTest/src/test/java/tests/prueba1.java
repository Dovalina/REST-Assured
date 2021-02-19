package tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class prueba1 {
	
	@Test
	public void test_1() {
		
		
		
		Response response = get("https://jsonplaceholder.typicode.com/posts");
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody().asString());
		System.out.println(response.getHeader("content-type"));
	}
	
	@Test
	
	public void test_2() {
		
		baseURI = "https://jsonplaceholder.typicode.com";
		given().
		get("/posts").
		then().statusCode(200).
		body("[90].userId", equalTo(10));
	}
}
