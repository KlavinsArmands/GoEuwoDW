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
        test.getPdPageObject().enterFirstName(test.getUser().getFirstName());
        test.getPdPageObject().enterLastName(test.getUser().getLastName());
        test.getPdPageObject().selectRadioButton();
        test.getPdPageObject().enterEmail(test.getUser().getEmailAddress());
        test.getPdPageObject().selectCountryField();
        test.getPdPageObject().selectCountryFieldElement();
        test.getPdPageObject().selectPrefixFieldElement();
        test.getPdPageObject().selectIDField();
        test.getPdPageObject().selectIDFieldElement();
        test.getPdPageObject().enterIDNumber(test.getUser().getPassport());
        test.getPdPageObject().enterBDayField(test.getUser().getBday());
        test.getPdPageObject().enterBMonthField(test.getUser().getBmonth());
        test.getPdPageObject().enterBYearField(test.getUser().getByear());
        test.getPdPageObject().selectPrefixField();
        test.getPdPageObject().selectPrefixFieldElement();
        test.getPdPageObject().enterNumber(test.getUser().getPhonenumber());
        test.getPdPageObject().selectNextButton();
        test.getPdPageObject().enterAddressOneField(test.getUser().getAddress());
        test.getPdPageObject().enterCityField(test.getUser().getCity());
        test.getPdPageObject().enterPostalCodeField(test.getUser().getPostalCode());
        test.getPdPageObject().selectCountryOfBirthField();
        test.getPdPageObject().selectCountryOfFieldElement();
        test.getPdPageObject().selectPriceChangeContinue();
    }

    @And("^I click Review journey details$")
    public void iClickReviewJourneyDetails() {
        test.getPdPageObject().selectRJDButton();
    }
}
