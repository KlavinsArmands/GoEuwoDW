package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import general.TestContext;

import static org.assertj.core.api.Assertions.assertThat;


public class HomepageSteps {

    private TestContext test;

    public HomepageSteps(TestContext testContext) {
        this.test = testContext;
    }

    @Given("^I am in homepage$")
    public void iAmInHomepage() {
        assertThat(test.getLandingPage().isLabelVisible()).isTrue();
    }

    @And("^I set ([^\\\"]*) as departure place$")
    public void iSetRigaArptAsDeparturePlace(String fromField) {
        test.getLandingPage().enterFromInputField(fromField);
        test.getLandingPage().selectSearchResult();
    }

    @And("^I set ([^\\\"]*) as arrival place$")
    public void iSetBarcelonaArptAsArrivalPlace(String toField) {
        test.getLandingPage().enterToInputField(toField);
        test.getLandingPage().selectSearchResult();
    }


    @When("^I click Search button$")
    public void iClickSearchButton(){
        test.getLandingPage().selectSearchButton();
    }

    @And("^I unselect accommodation search$")
    public void iUnselectAccommodationSearch(){
        test.getLandingPage().selectToggleButton();
    }
}
