package stepsRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        tags = "",
        features = "src/test/resources/features/Search.feature",
        glue = "steps",
        monochrome = true
)
public class CucumberRunnerTests {
}
