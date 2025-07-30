package pages;

import org.openqa.selenium.By;
import utilities.Driver;

public class CLContactsPage {

    private By header = By.xpath("//h1[.='Contact List']");

    public String getHeader() {
        return Driver.getDriver().findElement(header).getText();
    }

    public boolean assertHeader(){
       return getHeader().equals("Contact List");
    }




}
