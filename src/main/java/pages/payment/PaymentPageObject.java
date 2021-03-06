package pages.payment;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PaymentPageObject {

    private SelenideElement getPMLabel() {
        return $(By.xpath("//span[contains(text(),'Select payment method')]"));
    }

    private SelenideElement getEmail(String emailAddress) {
        return $(By.xpath("//div[@class='Tips_body_15aa1' and contains(text(),'"+emailAddress+"')]"));
    }

    private SelenideElement getLabel() {
        return $(By.xpath("//span[contains(text(),'Review and Pay')]"));
    }

    private SelenideElement getCardField() {
        return $(By.xpath("//div[@role='radiogroup']//div[1]//label[1]"));
    }

    public void isPMLabelVisible() {
        getPMLabel().waitUntil(Condition.visible, 30000);
    }
/*
    private SelenideElement getName(String firstName) {
        return $(By.xpath("//div[@data-e2e='passenger-details-review-name'][contains(text(), '"+firstName+"')]"));
    }

    private SelenideElement getLastName(String lastName) {
        return $(By.xpath("//div[@data-e2e='passenger-details-review-name'][contains(text(), '"+lastName+"')]"));
    }
*/

    public boolean isEmailVisible(String emailAddress) {
        return getEmail(emailAddress).isDisplayed();
    }

    public boolean isLabelVisible() {
        return getLabel().isDisplayed();
    }

    public void selectCardField() {
        getCardField().click();
    }
/*
    public boolean isNameVisible(String firstName) {
        return getName(firstName).isDisplayed();
    }

    public boolean isLastNameVisible(String lastName) {
        return getLastName(lastName).isDisplayed();
    }
*/
}
