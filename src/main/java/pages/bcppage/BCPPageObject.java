package pages.bcppage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BCPPageObject {

    private SelenideElement getPDButton() {
        return $(By.xpath("//button[@data-e2e='bookButton']"));
    }

    public void selectPDButton() {
        getPDButton().waitUntil(Condition.visible, 30000);
        getPDButton().scrollTo();
        getPDButton().click();
    }

}
