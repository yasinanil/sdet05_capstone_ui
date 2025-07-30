package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AllPages;
import utilities.ConfigReader;
import utilities.Driver;

public class LoginSD {

    AllPages pages = new AllPages();

    @Given("user goes to homepage")
    public void user_goes_to_homepage() {
        //assert false;//Failed intentionally
        Driver.getDriver().get(ConfigReader.getProperty("homepage"));

    }

    @When("user enters username {string}")
    public void user_enters_username(String username) {
        pages.getClHomePage().enterEmail(username);
    }

    @When("user enters password {string}")
    public void user_enters_password(String password) {
        pages.getClHomePage().enterPassword(password);
    }

    @When("user clicks login button")
    public void user_clicks_login_button() {
        pages.getClHomePage().clickSubmit();
    }

    @Then("user verifies the login")
    public void user_verifies_the_login() {
        assert pages.getClContactsPage().assertHeader();
    }

    @Then("user verifies error message")
    public void userVerifiesErrorMessage() throws InterruptedException {
        Thread.sleep(500);
        assert pages.getClHomePage().assertErrorMessage();
    }
}
