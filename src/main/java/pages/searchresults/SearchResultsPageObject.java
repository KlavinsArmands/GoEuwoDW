package pages.searchresults;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.bcppage.BCPPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class SearchResultsPageObject {

    private SelenideElement getTrip () {
        return $(By.xpath("//div[contains(@class, 'cell___3-mbD')][1]"));
    }

    public BCPPageObject selectTrip(){
        getTrip().click();
        return page(BCPPageObject.class);
    }

}
