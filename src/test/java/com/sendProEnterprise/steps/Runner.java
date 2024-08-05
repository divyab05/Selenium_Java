package com.sendProEnterprise.steps;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/",
				"rerun:Failed/failedrerun.txt"
				}, 
		monochrome = true,
		glue = { "com.sendProEnterprise.steps" },
		features = { "src/test/resources/features" },
		tags = "@WooCommerce",
		dryRun = false
		
)


public class Runner extends AbstractTestNGCucumberTests{
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}

}
