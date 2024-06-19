package in.redBus5.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\PRAVEEN\\eclipse-workspace-latest\\RedBus5\\src\\test\\resources\\FeatureFiles",
                    glue = "in.redBus5.StepDefinition",
                    dryRun = false,
                    monochrome = true,
                    plugin = {"html:target","json:target/report.json"})
public class TestRunner {

}
