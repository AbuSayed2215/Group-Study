package com.richman.hooks;

import com.richman.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass{
	
	@Before
	public static void initiate() {
		BaseClass.setUp();
	}
 @After
 public static void tearDown() {
	 //driver.quit();
 }
}
