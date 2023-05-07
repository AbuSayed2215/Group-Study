package com.richman.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"Features/Login.feature"},
		glue = {"com.richman.steps", "com.richman.hooks"}, 
		plugin = {"pretty","json:target/cucumber.json"},
		dryRun = false,
		monochrome = true
		//tags = "@smoke"
		
		)
public class Runner extends AbstractTestNGCucumberTests {

}
