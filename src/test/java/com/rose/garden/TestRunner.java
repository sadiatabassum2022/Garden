package com.rose.garden;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/features/DemoContact.feature"} , 
plugin = {"json:target/cucumber.json"},
glue = "StepDefinition") //tags= {"@Test"})








public class TestRunner extends AbstractTestNGCucumberTests {

}
