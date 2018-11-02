package pages.pdpage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PDPageObject {

    private SelenideElement getRadioButton() {
        return $(By.xpath("//div[contains(text(),'Mrs/Ms')]/.."));
    }

    private SelenideElement getFirstNameField() {
        return $(By.xpath("//input[@name='passengers.0.components.name[0].first']"));
    }

    private SelenideElement getLastNameField() {
        return $(By.xpath("//input[@name='passengers.0.components.name[0].last']"));
    }

    private SelenideElement getEmailField() {
        return $(By.xpath("//input[@name='passengers.0.components.email[0].address']"));
    }

    private SelenideElement getCountryField() {
        return $(By.xpath("//select[@name='passengers.0.components.countryOfResidence[0].countryCode']"));
    }

    private SelenideElement getCountryFieldElement() {
        return $(By.xpath("//option[contains(text(), 'Latvia')]"));
    }

    private SelenideElement getRJDButton() {
        return $(By.xpath("//button[@type='submit']"));
    }

    public void selectRadioButton() {
        getRadioButton().waitUntil(Condition.visible, 15000);
        getRadioButton().click();
    }

    public void enterFirstName(String firstname){
        getFirstNameField().sendKeys(firstname);
    }

    public void enterLastName(String lastname){
        getLastNameField().sendKeys(lastname);
    }

    public void enterEmail(String email){
        getEmailField().sendKeys(email);
    }

    public void selectCountryField() {
        getCountryField().click();
    }

    public void selectCountryFieldElement() {
        getCountryFieldElement().click();
    }

    public void selectRJDButton() {
        getRJDButton().click();
    }

}
