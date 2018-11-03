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
        return $(By.xpath("//select[@class='Select_select_d40a7']//option[contains(text(), 'Latvia')]"));
    }

    private SelenideElement getRJDButton() {
        return $(By.xpath("//button[@type='submit']"));
    }

    private SelenideElement getIDField() {
        return $(By.xpath("//select[@name='passengers.0.components.travelDocument[0].type']"));
    }

    private SelenideElement getIDFieldElement() {
        return $(By.xpath("//option[contains(text(), 'Passport')]"));
    }

    private SelenideElement getIDNumber() {
        return $(By.xpath("//input[@name='passengers.0.components.travelDocument[0].number']"));
    }

    private SelenideElement getPrefixField() {
        return $(By.xpath("//div[@class='_27rBF']"));
    }

    private SelenideElement getPrefixFieldElement() {
        return $(By.xpath("//select[@class='_1Lm5H']//option[contains(text(), 'Latvia')]"));
    }

    private SelenideElement getNumberField() {
        return $(By.xpath("//input[@placeholder='Phone Number']"));
    }

    private SelenideElement getBDayField() {
        return $(By.xpath("//input[@placeholder='DD']"));
    }

    private SelenideElement getBMonthField() {
        return $(By.xpath("//input[@placeholder='MM']"));
    }

    private SelenideElement getBYearField() {
        return $(By.xpath("//input[@placeholder='YYYY']"));
    }


    public void selectRadioButton() {
        if (getRadioButton().exists()) {
            getRadioButton().click();
        }

    }

    public void enterFirstName(String firstname){
        getFirstNameField().waitUntil(Condition.visible,15000);
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

    public void selectIDField() {
        if (getIDField().exists()) {
            getIDField().click();
        }
    }

    public void selectIDFieldElement() {
        if (getIDFieldElement().exists()) {
            getIDFieldElement().click();
        }
    }

    public void enterIDNumber(String passport) {
        if (getIDNumber().exists()) {
            getIDNumber().sendKeys(passport);
        }
    }

    public void selectPrefixField() {
        if (getPrefixField().exists()) {
            getPrefixField().click();
        }
    }

    public void selectPrefixFieldElement() {
        if (getPrefixFieldElement().exists()) {
            getPrefixFieldElement().click();
        }
    }

    public void enterNumber(String phonenumber) {
        if (getNumberField().exists()) {
            getNumberField().sendKeys(phonenumber);
        }
    }

    public void enterBDayField(int bday) {
        if (getBDayField().exists()) {
            getBDayField().sendKeys(String.valueOf(bday));
        }
    }

    public void enterBMonthField(int bmonth) {
        if (getBMonthField().exists()) {
            getBMonthField().sendKeys(String.valueOf(bmonth));
        }
    }

    public void enterBYearField(int byear) {
        if (getBYearField().exists()) {
            getBYearField().sendKeys(String.valueOf(byear));
        }
    }



}
