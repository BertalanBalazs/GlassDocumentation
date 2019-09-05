package glass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resource/glass/people",
        glue = "src/test/glass",
        dryRun=false,
        monochrome=true
        )
public class RunCucumberTest {
}
