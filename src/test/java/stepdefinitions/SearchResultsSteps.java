package stepdefinitions;

import cucumber.api.java.en.And;
import general.TestContext;

public class SearchResultsSteps {

    private TestContext test;

    public SearchResultsSteps(TestContext testContext) {
        this.test = testContext;
    }

    @And("^I select departure date$")
    public void iSelectDepartureDate() {
        test.getSearchResultsPageObject().selectCalendarField();
        test.getSearchResultsPageObject().selectCalendarFieldDate(test.getBooking().getDate());
        test.getSearchResultsPageObject().selectSearchButton();
    }

    @And("^I select first train available$")
    public void iSelectFirstTrainAvailable() {
        test.getSearchResultsPageObject().selectTrip();
    }

}
