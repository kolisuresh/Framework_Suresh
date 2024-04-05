package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.ShopPage;
import testbase.WebTestBase;

import javax.xml.crypto.Data;

public class ShopTest extends WebTestBase {
    HomePage homePage;
    ShopPage shopPage;

    @BeforeMethod
    public void preRequisite() {
        initialization();
        homePage = new HomePage();
        shopPage = new ShopPage();
    }

    @Test(description = "Verify search button click on home page")
    public void VerifySearchButtonClickableOnHomePage() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        shopPage.ShopOpenCoffee();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        driver.close();
    }
}