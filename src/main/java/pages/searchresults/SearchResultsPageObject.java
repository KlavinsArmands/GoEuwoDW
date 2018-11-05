package pages.searchresults;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.bcppage.BCPPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class SearchResultsPageObject {

    private SelenideElement getTrip () {
        return $(By.xpath("//div[contains(@data-e2e, 'resultCell')]"));
    }

    public BCPPageObject selectTrip(){
        getTrip().waitUntil(Condition.visible, 30000);
        getTrip().click();
        return page(BCPPageObject.class);
    }

}
