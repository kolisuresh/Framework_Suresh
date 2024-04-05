package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.SubscriptionsPage;
import testbase.WebTestBase;

public class SubscriptionsTest extends WebTestBase {
    HomePage homePage;
    SubscriptionsPage subscriptionsPage;

    @BeforeMethod
    public void preRequisite() {
        initialization();
        homePage = new HomePage();
        subscriptionsPage = new SubscriptionsPage();
    }

    @Test(description = "Verify search button click on home page")
    public void VerifySearchButtonClickableOnHomePage() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        subscriptionsPage.Subcription();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
//Thread.sleep(100000000);
        driver.close();

    }
}