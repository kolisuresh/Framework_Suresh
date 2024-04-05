package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import testbase.WebTestBase;

public class
LoginTest extends WebTestBase {

    HomePage homePage;

    LoginPage loginPage;

    MyAccountPage myAccountPage;

    LoginTest() {
        super();
    }

    @BeforeMethod
    public void preRequisite() {
        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        myAccountPage = new MyAccountPage();

    }
    @Test(description = "Verify login with valid username & valid password")
    public void verifyLoginWithValidUserNameAndPassword(){
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        homePage.clickOnLoginAndRegister();
        loginPage.setlogin (prop.getProperty("username"),prop.getProperty("password"));
        softAssert.assertEquals(myAccountPage.getMyAccountElement(),"MY ACCOUNT","MY ACCOUNT text should be matched");
        softAssert.assertAll();
    }
    @Test(description = "Verify login with valid username & invalid password")
    public void verifyLoginWithValidUserNameAndInvalidPassword(){
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        homePage.clickOnLoginAndRegister();
        loginPage.setlogin(prop.getProperty("username"),prop.getProperty("InvalidPassword"));
        softAssert.assertEquals(loginPage.getTextOfErrorMessage(),"ERROR","Error text should be matched");
        softAssert.assertAll();
    }
    @Test(description = "Verify login with invalid username & valid password")
    public void verifyLoginWithInValidUserNameAndvalidPassword(){
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        homePage.clickOnLoginAndRegister();
        loginPage.setlogin(prop.getProperty("InvalidUserName"),prop.getProperty("password"));
        softAssert.assertEquals(loginPage.getTextOfErrorMessage(),"ERROR","Error text should be matched");
        softAssert.assertAll();
    }
    @Test(description = "Verify login with invalid username & invalid password")
    public void verifyLoginWithInValidUserNameAndInvalidPassword(){
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        homePage.clickOnLoginAndRegister();
        loginPage.setlogin(prop.getProperty("InvalidUserName"),prop.getProperty("InvalidPassword"));
        softAssert.assertEquals(loginPage.getTextOfErrorMessage(),"ERROR","Error text should be matched");
        softAssert.assertAll();
    }
    

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
