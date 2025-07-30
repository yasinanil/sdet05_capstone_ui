package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@FailedScenario2",
        plugin = {"html:target/reports/cucumberReport.html",
                "rerun:target/failed_tests/failed_scenarios.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "pretty"}
)
public class Runner extends AbstractTestNGCucumberTests {
}
