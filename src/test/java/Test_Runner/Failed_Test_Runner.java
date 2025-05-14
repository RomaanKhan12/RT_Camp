package Test_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features = "target/Failed_Scenarios.txt",
		glue = "org.Step_Definition , org.Hooks",
		dryRun = false,
		monochrome = true,
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}		
		
		
		
		
		
)
public class Failed_Test_Runner {

}
