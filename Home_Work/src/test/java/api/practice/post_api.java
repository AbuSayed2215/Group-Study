package api.practice;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

	public class post_api {

	  @Test
	  public void testPostRequest() {
	    String requestBody = "{ \"name\": \"John\", \"email\": \"john@example.com\" }";
	    
	    Response response = RestAssured.given()
	        .contentType(ContentType.JSON)
	        .body(requestBody)
	        .when()
	        .post("https://petstore.swagger.io/v2/user/createWithArray");
	    
	    int statusCode = response.getStatusCode();
	    String responseBody = response.getBody().asString();
	    
	    // Assert that the response status code is 201 (Created)
	    assert statusCode == 201 : "Unexpected status code: " + statusCode;
	    
	    // Assert that the response body contains the created user's ID
	    assert responseBody.contains("\"id\":") : "Response body does not contain ID";
	  }
	}



