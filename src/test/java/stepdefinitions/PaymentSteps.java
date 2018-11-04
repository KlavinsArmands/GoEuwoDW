package stepdefinitions;

import cucumber.api.java.en.Then;
import general.TestContext;

import static org.assertj.core.api.Assertions.assertThat;

public class PaymentSteps {

    private TestContext test;

    public PaymentSteps(TestContext testContext) {
        this.test = testContext;
    }

    @Then("^Review and Pay page is visible$")
    public void reviewAndPayPageIsVisible() {
        test.getPaymentPageObject().isPMLabelVisible();
        assertThat(test.getPaymentPageObject().isEmailVisible(test.getUser().getEmailAddress())).isTrue();
        assertThat(test.getPaymentPageObject().isLabelVisible()).isTrue();
    }
}
