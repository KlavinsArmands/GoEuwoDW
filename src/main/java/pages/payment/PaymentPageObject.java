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
        return $(By.xpath("//b[contains(text(),'"+emailAddress+"')]"));
    }

    private SelenideElement getLabel() {
        return $(By.xpath("//span[contains(text(),'Review and Pay')]"));
    }

    public void isPMLabelVisible() {
        getPMLabel().waitUntil(Condition.visible, 15000);
    }


    public boolean isEmailVisible(String emailAddress) {
        return getEmail(emailAddress).isDisplayed();
    }

    public boolean isLabelVisible() {
        return getLabel().isDisplayed();
    }
}
