package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features={"Features/Login.feature"},
		glue= {"com.stepdef"},
		plugin= {"pretty","json:target/cucumber.json"},
		monochrome= true,
		dryRun= false
		
		
		
		)

public class RunnerClass extends AbstractTestNGCucumberTests {
	
	
	
	

	

}
