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
		plugin = {"pretty"},
		monochrome=true
		
		)



public class Runner {
	
	

}
