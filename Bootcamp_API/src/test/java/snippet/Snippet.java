package snippet;

import static org.testng.Assert.assertEquals;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Snippet {
	
	@Test
    public void testCreateUser() {
        // Define the base URI and base path for the API endpoint
        RestAssured.baseURI = " https://petstore.swagger.io/v2";
        RestAssured.basePath = "/store/order";

        // Create a RequestSpecification object using the given() method
        JSONObject requestBody = new JSONObject();
        		requestBody.put("id", "11");
        		requestBody.put("petId", "0");
        		requestBody.put("quantity", "0");
        		requestBody.put("shipDate", "2023-05-06T01:03:45.478+0000");
        		requestBody.put("status", "placed");
        		requestBody.put("complete", "true");
        		
        		

        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(requestBody.toString())
                .when()
                .post();

        // Validate the response using assertions
        assertEquals(201, response.getStatusCode());
        assertEquals("John Doe", response.jsonPath().getString("name"));
        assertEquals("johndoe@example.com", response.jsonPath().getString("email"));
    }
}

	


