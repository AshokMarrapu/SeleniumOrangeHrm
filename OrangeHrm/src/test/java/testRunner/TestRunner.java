package testRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = { "stepDefinitions" }, plugin = { "pretty",
		"html: target/CucumberReports/CucumberReport.html", "json: target/CucumberReports/CucumberReport.json",
		"junit: target/CucumberReports/CucumberReport.xml" }, tags = "@smoke", publish = true)

public class TestRunner {
}