package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue= {"StepDefinitions"},
monochrome=true,
plugin= {"pretty","junit:target/JunitReports/reports.xml",
		"json:target/JsonReports/reports.json",
		"html:target/HtmlReports/reports.html"})

public class TestRunner {

}
