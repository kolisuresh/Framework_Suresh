package testcases;

import jdk.jfr.Description;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.ShopPage;
import testbase.WebTestBase;

public class HomeTest extends WebTestBase {

    HomePage homePage;
    HomeTest homeTest;

    ShopPage shopPage;


    @BeforeMethod
    public void preRequisite() {
        initialization();
        homePage = new HomePage();

        homeTest = new HomeTest();

        shopPage = new ShopPage();


    }

    @Test(description = "Verify search button click on home page")
    public void VerifySearchButtonClickableOnHomePage() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        homePage.clickOnSearchButton(prop.getProperty("text"));
    }


    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.close();

    }
}
