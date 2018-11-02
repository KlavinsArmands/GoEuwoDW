package general;


import lombok.Data;
import pages.landingpage.LandingPageObject;
import pages.searchresults.SearchResultsPageObject;

@Data
public class TestContext {

    private User user;
    private Booking booking;
    private LandingPageObject landingPage;
    private SearchResultsPageObject searchResultsPageObject;

    public TestContext() {
        this.user = new User();
        this.booking = new Booking();
        this.landingPage = new LandingPageObject();
        this.searchResultsPageObject = new SearchResultsPageObject();

    }

}
