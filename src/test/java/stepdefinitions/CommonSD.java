package stepdefinitions;

import io.cucumber.java.en.And;
import utilities.Driver;

public class CommonSD {

    @And("close driver")
    public void closeDriver() {
        Driver.closeDriver();
    }

}
