package pages;

import org.openqa.selenium.By;
import utilities.Driver;

public class CLHomePage {

    private By email = By.id("email");
    private By password = By.id("password");
    private By submit = By.id("submit");
    private By error = By.id("error");

    public CLHomePage enterEmail(String email) {
        Driver.getDriver().findElement(this.email).sendKeys(email);
        return this;
    }

    public CLHomePage enterPassword(String password) {
        Driver.getDriver().findElement(this.password).sendKeys(password);
        return this;
    }

    public void clickSubmit(){
        Driver.getDriver().findElement(submit).click();
    }

    public boolean assertErrorMessage(){
        return Driver.getDriver().findElement(error).getText().equals("Incorrect username or password");
    }



}
