package com.curd.function;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ReadData {
	
	public static Response getsetUp() {
		Response response = RestAssured.get("https://www.smarttechqa.com/api/products");
		response.prettyPrint();
		
		
		
		
		return response;
		
	}

}
