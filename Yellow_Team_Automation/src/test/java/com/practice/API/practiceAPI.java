package com.practice.API;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class practiceAPI {
	@Test
	void getRequist () {
		
		RestAssured.baseURI = "https://www.smarttechqa.com";
		RequestSpecification requist = RestAssured.given();
		Response response = requist.request(Method.GET, "api/products");
		String responseBody = response.getBody().asString();
		System.out.println(responseBody);
		
	}
	

}
