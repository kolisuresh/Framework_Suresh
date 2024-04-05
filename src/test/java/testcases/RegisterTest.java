package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.RegisterPage;
import testbase.WebTestBase;

public class RegisterTest extends WebTestBase {
    HomePage homePage;

    LoginPage loginPage;

    MyAccountPage myAccountPage;

    RegisterPage registerPage;

    RegisterTest() {
        super();
    }

    @BeforeMethod
    public void preRequisite() {
        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        myAccountPage = new MyAccountPage();
        registerPage = new RegisterPage();

    }
    @Test
    public void RegisterAccount(){
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        homePage.clickOnLoginAndRegister();
        registerPage.clickRrgisterBtn();
        registerPage.SetRegister(prop.getProperty("Email"), prop.getProperty("RegPassword") );
        softAssert.assertEquals(myAccountPage.getMyAccountElement(),"MY ACCOUNT","MY ACCOUNT text should be matched");
        softAssert.assertAll();

    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}

