package pages.bcppage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BCPPageObject {

    private SelenideElement getPDButton() {
        return $(By.xpath("//button[@type='button']"));
    }

    public void selectPDButton() {
        getPDButton().waitUntil(Condition.visible, 15000);
        getPDButton().click();
    }

}
