package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.CafeFinderPage;
import pages.HomePage;
import pages.ShopPage;
import testbase.WebTestBase;

public class CafeFinderTest extends WebTestBase {
    HomePage homePage;
    CafeFinderPage cafeFinderPage;


    @BeforeMethod
    public void preRequisite() {
        initialization();
        homePage = new HomePage();
        cafeFinderPage = new CafeFinderPage();
    }
    @Test(description = "Verify search button click on home page")
    public void VerifySearchButtonClickableOnHomePage() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        cafeFinderPage.CafeFind();
    }


    @AfterMethod
    public void tearDown() throws InterruptedException {
//Thread.sleep(100000000);
        driver.close();

    }
}

