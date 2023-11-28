package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", glue = { "stepDefinitions" }, plugin = { "pretty",
		"html: target/CucumberReports/CucumberReport.html", "json: target/CucumberReports/CucumberReport.json",
		"junit: target/CucumberReports/CucumberReport.xml" }, tags = "@all", publish = true)

public class TestRunner extends AbstractTestNGCucumberTests {
}
	