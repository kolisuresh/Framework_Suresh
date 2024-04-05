package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.ShopPage;
import pages.WholesalePage;
import testbase.WebTestBase;

public class WholesaleTest extends WebTestBase {

    HomePage homePage;

    WholesalePage wholesalePage;

    @BeforeMethod
    public void preRequisite() {
        initialization();
        homePage = new HomePage();
        wholesalePage = new WholesalePage();
    }
    @Test(description = "Verify search button click on home page")
    public void VerifySearchButtonClickableOnHomePage() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        wholesalePage.Wholesale();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        driver.close();
    }
}


