package pages.searchresults;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.bcppage.BCPPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class SearchResultsPageObject {
/*
    private SelenideElement getCalendarField() {
        return $(By.xpath("//div[@data-e2e='buttonDepartureDate']"));
    }

    private SelenideElement getCalendarFieldDate(String date) {
        return $(By.xpath("//div[@class='MonthCounter___cHqRE']//div[@data-day-value='"+date+"']"));
    }
*/
    private SelenideElement getTransportMode(String transportMode) {
        return $(By.xpath("//div[@class='travelModeName___HuG32']//span[contains(text(),'"+transportMode+"')]"));
    }

/*    private SelenideElement getSearchButton() {
        return $(By.xpath("//button[@data-e2e='buttonSearch']"));
    }
*/
    private SelenideElement getTrip() {
        return $(By.xpath("//div[contains(@data-e2e, 'resultCell')][4]"));
    }

    private SelenideElement getFilterButton() {
        return $(By.xpath("//div[@class='sortPanel___xVjP7']//div//button[@type='button']"));
    }

    private SelenideElement getProviderInFilter(String provider) {
        return $(By.xpath("//div[contains(text(),'"+provider+"')]"));
    }
/*
    public void selectCalendarField(){
        getCalendarField().waitUntil(Condition.visible,30000);
        getCalendarField().click();
    }

    public void selectCalendarFieldDate(String date){
        getCalendarFieldDate(date).click();
    }
*/
    public void selectTransportMode(String transportMode) {
        getTransportMode(transportMode).click();
    }
/*
    public void selectSearchButton() {
        getSearchButton().click();
    }
*/
    public BCPPageObject selectTrip(){
        getTrip().waitUntil(Condition.visible, 30000);
        getTrip().click();
        return page(BCPPageObject.class);
    }

    public void selectFilterButton() {
        getFilterButton().click();
    }

    public void selectProviderInFilter(String provider) {
        getProviderInFilter(provider).waitUntil(Condition.visible,40000);
        getProviderInFilter(provider).scrollTo();
        getProviderInFilter(provider).click();
    }

}
