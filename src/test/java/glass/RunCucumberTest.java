package glass;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.TestCase;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resource/glass",
        glue = "src/test/glass",
        monochrome=true
        )
public class RunCucumberTest {
}
