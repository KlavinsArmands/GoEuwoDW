package pages.landingpage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.searchresults.SearchResultsPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LandingPageObject {

    private SelenideElement getLabel() {
        return $(".MainHero__rebrandedHeadline___3ubph> span");
    }


    private SelenideElement getFromField() {
        return $("input[placeholder='from: City, Station or Airport']");
    }

    private SelenideElement getToField() {
        return $("input[placeholder='to: City, Station or Airport']");
    }

    private SelenideElement getSearchResult() {
        return $(By.xpath("//div[contains(@class, 'Suggestions__container___1gyuC')]/li[1]"));
    }

    private SelenideElement getToggleButton() {
        return $(By.xpath("//div[contains(concat(' ', @class, ' '), ' react-toggle--checked ')]"));
    }

    private SelenideElement getSearchButton() {
        return $(By.xpath("//div[@class='Button_contents_8aaee']//span[contains(text(),'Search')]"));
    }

    public boolean isLabelVisible() {
        return getLabel().isDisplayed();
    }

    public void enterFromInputField(String fromField){
        getFromField().sendKeys(fromField);
    }

    public void enterToInputField(String toField){
        getToField().sendKeys(toField);
    }

    public void selectSearchResult() {
        getSearchResult().waitUntil(Condition.visible, 15000);
        getSearchResult().click();
    }

    public void selectToggleButton() {
        if (getToggleButton().exists())
        {
            getToggleButton().click();
        }
    }

    public SearchResultsPageObject selectSearchButton(){
        getSearchButton().click();
        return page(SearchResultsPageObject.class);
    }

}