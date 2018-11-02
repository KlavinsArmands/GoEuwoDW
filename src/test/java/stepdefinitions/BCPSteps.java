package stepdefinitions;

import cucumber.api.java.en.And;
import general.TestContext;

public class BCPSteps {

    private TestContext test;

    public BCPSteps(TestContext testContext) {
        this.test = testContext;
    }

    @And("^I click Go To Passenger Details button$")
    public void iClickGoToPassengerDetailsButton(){
        test.getBcpPageObject().selectPDButton();
    }
}
