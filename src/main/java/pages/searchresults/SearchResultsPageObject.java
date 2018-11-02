package pages.searchresults;

import com.codeborne.selenide.SelenideElement;
import pages.bcppage.BCPPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class SearchResultsPageObject {

    private SelenideElement getTrip () {
        return $(".price___1bK2Z");
    }

    public BCPPageObject selectTrip(){
        getTrip().click();
        return page(BCPPageObject.class);
    }

}
