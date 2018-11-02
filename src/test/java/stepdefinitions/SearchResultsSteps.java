package stepdefinitions;

import cucumber.api.java.en.And;
import general.TestContext;

public class SearchResultsSteps {

    private TestContext test;

    public SearchResultsSteps(TestContext testContext) {
        this.test = testContext;
    }

    @And("^I select first train available$")
    public void iSelectFirstTrainAvailable() {
        test.getSearchResultsPageObject().selectTrip();
    }
}
