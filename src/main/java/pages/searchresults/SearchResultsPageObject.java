package pages.searchresults;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.bcppage.BCPPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class SearchResultsPageObject {

    private SelenideElement getCalendarField() {
        return $(By.xpath("//input[@data-e2e='buttonDeparturePosition']"));
    }

    private SelenideElement getCalendarFieldDate(String date) {
        return $(By.xpath("//div[@class='MonthCounter___cHqRE']//div[@data-day-value='"+date+"']"));
    }

    private SelenideElement getSearchButton() {
        return $(By.xpath("//button[@data-e2e='buttonSearch']"));
    }

    private SelenideElement getTrip () {
        return $(By.xpath("//div[contains(@data-e2e, 'resultCell')]"));
    }

    public void selectCalendarField(){
        getCalendarField().waitUntil(Condition.visible,30000);
        getCalendarField().click();
    }

    public void selectCalendarFieldDate(String date){
        getCalendarFieldDate(date).click();
    }

    public void selectSearchButton() {
        getSearchButton().click();
    }

    public BCPPageObject selectTrip(){
        getTrip().waitUntil(Condition.visible, 30000);
        getTrip().click();
        return page(BCPPageObject.class);
    }

}
