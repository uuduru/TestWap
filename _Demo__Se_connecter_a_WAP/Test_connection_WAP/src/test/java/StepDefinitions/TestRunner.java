package StepDefinitions;

import io.cucumber.testng.*;

@CucumberOptions(features="src/test/resources/Features", glue= {"StepDefinitions"},
monochrome=true,
plugin= {"pretty","junit:target/JunitReports/reports.xml",
		"json:target/JsonReports/reports.json",
		"html:target/HtmlReports/reports.html"})

public class TestRunner extends AbstractTestNGCucumberTests {

}


