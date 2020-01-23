package com.test.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="D:\\Projects_Selenium\\TestBDDFramework\\src\\main\\java\\com\\test\\feature",
		glue= {"com\\test\\stepdefinitions"},
		format= {"pretty"},
		monochrome=true,
		dryRun=false,
		strict=true)

public class TestRunner {

}
