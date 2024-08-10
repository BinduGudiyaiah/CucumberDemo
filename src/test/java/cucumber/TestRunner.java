package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/feature",
glue="stepDefinitions",monochrome=true,tags = "@SmokeTest or @RegressionTest", dryRun=true,
plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json"})

public class TestRunner extends AbstractTestNGCucumberTests {

}
