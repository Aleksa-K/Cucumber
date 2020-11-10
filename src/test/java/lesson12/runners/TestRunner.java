package lesson12.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@SearchTest",
        features = "src/test/resources",
        glue = "lesson12/steps"
)
public class TestRunner {
}
