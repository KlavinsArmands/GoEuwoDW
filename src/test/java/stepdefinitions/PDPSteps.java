package stepdefinitions;

import cucumber.api.java.en.And;
import general.TestContext;

public class PDPSteps {

    private TestContext test;

    public PDPSteps(TestContext testContext){
        this.test = testContext;
    }

    @And("^I fill in Passenger Details page$")
    public void iFillInPassengerDetailsPage() {
        test.getPdPageObject().selectRadioButton();
        test.getPdPageObject().enterFirstName(test.getUser().getFirstName());
        test.getPdPageObject().enterLastName(test.getUser().getLastName());
        test.getPdPageObject().enterEmail(test.getUser().getEmailAddress());
        test.getPdPageObject().selectCountryField();
        test.getPdPageObject().selectCountryFieldElement();
    }

    @And("^I click Review journey details$")
    public void iClickReviewJourneyDetails() {
        test.getPdPageObject().selectRJDButton();
    }
}
