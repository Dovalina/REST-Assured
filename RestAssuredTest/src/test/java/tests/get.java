package tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class get {

	@Test
	public void testGet() {
		baseURI = "https://jsonplaceholder.typicode.com";
		given().
			get("/posts").
		then().
			statusCode(200).log().all();
	}
}
