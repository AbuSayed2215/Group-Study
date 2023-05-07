package com.api.practicr;

import io.restassured.response.Response;

public class ExecuteTest {
	
	public static void main(String[] args) {
		ReadData td = new ReadData();
		Response response = td.GetsetUp();
		
		CommonTestCase ct = new CommonTestCase();
		ct.checkStatusCode(response);
		ct.checkResponse(response);
		ct.checkContenttype(response);
		ct.checkbodynotnull(response);
	}

}
