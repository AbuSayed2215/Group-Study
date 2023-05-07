package com.api.testrun;

import com.curd.function.API_Common_TestCase;
import com.curd.function.ReadData;

import io.restassured.response.Response;

public class ExecuteTest {
	
	public static void main(String[] args) {
		
		ReadData obj = new ReadData();
		Response response = obj.getsetUp();
		API_Common_TestCase obj2 = new API_Common_TestCase();
		obj2.checkStatusCode(response);
		obj2.checkResponseTime(response);
		obj2.checkDataFormat(response);
		obj2.checkDataNotNull(response);
	}

}
