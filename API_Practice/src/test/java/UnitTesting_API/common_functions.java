package UnitTesting_API;

import static io.restassured.RestAssured.given;

import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class common_functions {
	
	@Test
	public void getMethod() {
		given()
		
		.when()
		.get("https://www.smarttechqa.com/api/products")
		
		.then()
		.statusCode(200)
		.contentType("application/json")
		;
	}
	
	@Test
	public void createData() {
		Map <String, String> data = new LinkedHashMap<>();
		data.put("id", "100");
		data.put("name", "Spider_man");
		data.put("releasedata", "2019-08-20T08:55:58.510Z");
		data.put("reviewScore", "5");
		data.put("catagort", "adventure");
		data.put("rating", "universal");
		
		
		given()
		.contentType("application/json")
		.body(data)
		
		.when()
		.post("https://localhost:8080/app/videogames")
		
		
		.then()
		.statusCode(200)
		.log().body()
		.extract().response()
		
		;
		
	}

}
