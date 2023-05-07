package com.api.practicr;

import org.testng.asserts.SoftAssert;

import io.restassured.response.Response;

public class CommonTestCase {
	
	SoftAssert sa = new SoftAssert();
	
	public void checkStatusCode(Response response) {
		
		sa.assertEquals(response.statusCode(), 200);
		
	}
	
	public void checkResponse(Response response) {
		boolean status = response.time()<3000;
		sa.assertTrue(true);
		
	}
	public void checkContenttype(Response response) {
		boolean status = response.contentType().toString().contains("json");
		sa.assertTrue(status);
		
	}
	public void checkbodynotnull(Response response) {
		boolean status = !response.body().asString().equals(null);
		sa.assertTrue(status);
	}

}
