package Test_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions
(
		features = "src/test/resources/Feature_file",
		glue = {"Step_Definition", "Hooks"},
		//tags = "@Smoke or @Sanity",
		dryRun = false,
		monochrome = true,
		plugin = {"rerun:target/Failed_Scenarios.txt",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				}
)
public class TestRunner 
{
	
}
