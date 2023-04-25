package com.myrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features = "./Features", // path of feature folder
		glue ="com/usa/stepdefinition",
		tags ="@smoke"
		
		)
public class MyRunner extends AbstractTestNGCucumberTests {

}
