package activitiesRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.plugin.Plugin;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "features",
		glue = {"StepDefinations"},
		tags = "@activity2_5",
		plugin = {"json: test-reports/json-report.json"},
		monochrome=true
		
		)


public class reportsrunner {

}
