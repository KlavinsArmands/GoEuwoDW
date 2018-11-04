package general;


import lombok.Data;
import pages.bcppage.BCPPageObject;
import pages.landingpage.LandingPageObject;
import pages.payment.PaymentPageObject;
import pages.pdpage.PDPageObject;
import pages.searchresults.SearchResultsPageObject;

@Data
public class TestContext {

    private User user;
    private Booking booking;
    private LandingPageObject landingPage;
    private SearchResultsPageObject searchResultsPageObject;
    private BCPPageObject bcpPageObject;
    private PDPageObject pdPageObject;
    private PaymentPageObject paymentPageObject;

    public TestContext() {
        this.user = new User();
        this.booking = new Booking();
        this.landingPage = new LandingPageObject();
        this.searchResultsPageObject = new SearchResultsPageObject();
        this.bcpPageObject = new BCPPageObject();
        this.pdPageObject = new PDPageObject();
        this.paymentPageObject = new PaymentPageObject();

    }

}
