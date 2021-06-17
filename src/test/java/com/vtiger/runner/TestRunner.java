package com.vtiger.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features/"
		,glue = {"com.vtiger.StepDefinations"}
		,plugin = {"pretty","html:target/cucumber-report"}
		//,tags = {"@run"}
		
		
)

public class TestRunner {

}
