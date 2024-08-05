package com.sendProEnterprise.steps;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	
		monochrome = true,
		glue = { "com.sendProEnterprise.steps" },
		features = {"@Failed/failedrerun.txt"} ,
		plugin = { "pretty", "html:Failed/cucumber-reports" },
		dryRun = false
		
)
public class FailedRunner extends AbstractTestNGCucumberTests{
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
	
}
