package com.curd.function;

import org.testng.asserts.SoftAssert;

import io.restassured.response.Response;

public class API_Common_TestCase {
	
	SoftAssert sa = new SoftAssert();
	
	public void checkStatusCode(Response response){ 
		//response.statusCode();
		sa.assertEquals(response.statusCode(), 200);
		
	}
	
		public void checkResponseTime(Response response){ 
			
			
			boolean status = response.time()<3000;
			sa.assertTrue(status);
			
		}

		public void checkDataFormat(Response response){ 
			boolean status = response.contentType().toString().contains("json");
			sa.assertTrue(status);
			
		}
		
		public void checkDataNotNull(Response response){ 
		boolean status = !response.body().asString().equals(null);
			sa.assertTrue(status);
			
			sa.assertAll();
		}
}
