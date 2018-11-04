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
        return $(By.xpath("//div[@class='Select_container_dc849']"));
    }

    private SelenideElement getOldCountryField() {
        return $(By.xpath("//div[@class='Select_container_d40a7']"));
    }

    private SelenideElement getCountryFieldElement() {
        return $(By.xpath("//select[@name='passengers.0.components.countryOfResidence[0].countryCode']//option[contains(text(), 'Latvia')]"));
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
        return $(By.xpath("//div[@data-e2e='phone-number-field-v2-dialling-code']"));
    }

    private SelenideElement getPrefixFieldElement() {
        return $(By.xpath("//div[@data-e2e='phone-number-field-v2-dialling-code']//option[contains(text(), 'Latvia')]"));
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

    private SelenideElement getNextButton() {
        return $(By.xpath("//div[@class='Button_contents_556f2']//span[contains(text(), 'Next')]/../.."));
    }

    private SelenideElement getAddressOneField() {
        return $(By.xpath("//input[@id='address1']"));
    }

    private SelenideElement getCityField() {
        return $(By.xpath("//input[@id='city']"));
    }

    private SelenideElement getPostalCodeField() {
        return $(By.xpath("//input[@id='zipCode']"));
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
        if (getCountryField().exists()) {
            getCountryField().click();
        } else {
            getOldCountryField().click();
        }
    }

    public void selectCountryFieldElement() {
        getCountryFieldElement().click();
    }


    public void selectRJDButton() {
        getRJDButton().scrollTo();
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

    public void selectNextButton() {
        if (getNextButton().exists()) {
            getNextButton().click();
        }
    }

    public void enterAddressOneField(String address) {
        if (getAddressOneField().exists()) {
            getAddressOneField().sendKeys(address);
        }
    }

    public void enterCityField(String city) {
        if (getCityField().exists()) {
            getCityField().sendKeys(city);
        }
    }

    public void enterPostalCodeField(String postalCode) {
        if (getPostalCodeField().exists()) {
            getPostalCodeField().sendKeys(postalCode);
        }
    }

}
