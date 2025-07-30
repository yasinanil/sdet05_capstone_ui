package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    @After//Her scenario sonrası çalışır.
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            // Capture a screenshot of the failed scenario
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            // Attach the screenshot to the report
            scenario.attach(screenshot, "image/png", "Screenshot of failed scenario: "+scenario.getName());
        }
        Driver.closeDriver();
    }

}
