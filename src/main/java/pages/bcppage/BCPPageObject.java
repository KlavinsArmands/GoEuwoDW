package pages.bcppage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BCPPageObject {

    private SelenideElement getPDButton() {
        return $(By.xpath("//button[@type='button']"));
    }

    public void selectPDButton() {
        getPDButton().click();
    }

}
