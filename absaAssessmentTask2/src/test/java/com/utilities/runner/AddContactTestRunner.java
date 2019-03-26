package com.utilities.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\AKV_QA\\Work\\absaAssessmentTask2\\src\\test\\resources\\features\\AddContact.feature",
				glue = "classpath:com.utilities.stepDefinitions",
				plugin = {"pretty", "html:test-output","json:json_output/cucumber.json","junit:karthik_xml/cucumber.xml" },
			dryRun = false,
			monochrome=true,
			strict=true)

public class AddContactTestRunner {

}
