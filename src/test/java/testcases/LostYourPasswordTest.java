package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import pages.LostPasswordPage;
import pages.MyAccountPage;
import testbase.WebTestBase;

public class LostYourPasswordTest extends WebTestBase {

    HomePage homePage;

    LoginPage loginPage;

    MyAccountPage myAccountPage;
    LostPasswordPage lostPasswordPage;

    LostYourPasswordTest() {
        super();
    }

    @BeforeMethod
    public void preRequisite() {
        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        myAccountPage = new MyAccountPage();
        lostPasswordPage = new LostPasswordPage();

    }
    @Test(description = "Verify login with valid username & valid password")
    public void verifyLoginWithValidUserNameAndPassword(){
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        homePage.clickOnLoginAndRegister();
        loginPage.lostPasswordbtn();
        lostPasswordPage.newEmailText(prop.getProperty("text"));
        softAssert.assertAll();
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
