package com.api.practicr;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ReadData {
	
	public Response GetsetUp() {
		
		Response response = RestAssured.get("https://www.smarttechqa.com/api/products");
		response.prettyPrint();
		
		
		return response;
		
		
	}

}
