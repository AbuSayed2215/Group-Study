package com.api.hw;

import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import cucumber.api.cli.Main;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class HWapi {
	
	static String domain = "https://www.smarttechqa.com";
	static Response response;
	static String token;
	
	@Test
	void getApi() {
		RestAssured.baseURI = domain;
		RequestSpecification req = RestAssured.given();
		response = req.request(Method.GET, "/api/products");
		
		String responseBody = response.getBody().asString();
		System.out.println(responseBody);
		
		int statusCode = response.getStatusCode();
		System.out.println("ststus code is:"+statusCode);
		Assert.assertEquals(statusCode, 200);
	}
	@Test
	void generateToken() {
		RestAssured.baseURI = domain;
		RequestSpecification req = RestAssured.given();
		req.header("Content-Type","application/json");
		
		Map <String, String> data = new LinkedHashMap();
		data.put("email", "apiuser@email.com");
		data.put("password", "api123");
		
		JSONObject obj = new JSONObject(data);
		String json = obj.toJSONString();
		
		response = req.body(json).request(Method.POST,"/api/users/login");
		token = response.jsonPath().get("token");
		
		System.out.println("My token is: "+token);
	}
	@Test
	void postData() {
		
		RestAssured.baseURI = domain;
		RequestSpecification req = RestAssured.given();
		Response response = req.request(Method.PUT, "/api/products/{product_id}");
		
	}
	@Test
	void setup () {
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		driver.get("https://www.smarttechqa.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		String expectedtitle = "TECHSHOP";
//		String actualtitle = driver.findElement(By.xpath("//*[@class='active navbar-brand']")).getText();
//		Assert.assertEquals(actualtitle, expectedtitle);
		String actual = driver.findElement(By.xpath("//*[@class='active navbar-brand']")).getText();
		Assert.assertTrue(actual.contains("cart"));
	}
	@Test
	
	int age () {
		return 20;
	}
	static void student() {
		String name = "jen";
		System.out.println(name);
	}
	public static void main(String[] args) {
		
		HWapi.student();
	}
}
