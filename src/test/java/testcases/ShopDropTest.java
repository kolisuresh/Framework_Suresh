package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import pages.ShopDropPage;
import pages.ShopPage;


public class ShopDropTest extends WholesaleTest {
    HomePage homePage;
    LoginPage loginPage;

    ShopDropPage shopDropPage;
ShopPage shopPage;
    ShopDropTest(){
        super();
    }
    @BeforeMethod()
    public void preRequisite(){
        initialization();
        homePage=new HomePage();
        loginPage=new LoginPage();
        shopPage = new ShopPage();
        shopDropPage = new ShopDropPage();

    }
    @Test(description = " verify User Is Able Select Element From DropDown")
    public void verifyUserIsAbleSelectElementFromDropDown(){
        SoftAssert softAssert= new SoftAssert();
        homePage.closeFirstAd();
        shopDropPage.clickOnDropDown();
       // softAssert.assertEquals(shopDropPage.getTextOfSelectedElement(),"SHOP");
        shopDropPage.selectDropDown();
        softAssert.assertAll();
    }

    @Test(description = "verify functionality of shop Page ")
    public  void verifyShopPage(){
        SoftAssert softAssert=new SoftAssert();
        homePage.closeFirstAd();
        homePage.clickOnLoginAndRegister();
        loginPage.setlogin(prop.getProperty("userName"), prop.getProperty("password"));
        shopDropPage.clickOnShopLink();
        homePage.closeFirstAd();
        shopDropPage.sampleProductSelect();

        shopDropPage.selectWeightFromDropDown();
        shopDropPage.ShopProducts();
        softAssert.assertEquals(shopDropPage.grtTextOfYourOrderPage(),"YOUR ORDER" , "Your Order text should be display");
        softAssert.assertAll();
    }
    @Test(description = "verify shop link is clickable")
    public void verifyShopLinkIsClickable(){
        SoftAssert softAssert= new SoftAssert();
        homePage.closeFirstAd();
        shopPage.clickOnShopLink();
        shopDropPage.clickOnDropDown();
        softAssert.assertAll();
    }
    @Test(description = "verify shop dropdown")
    public void VerifyShopDropdown(){
        SoftAssert softAssert=new SoftAssert();
        homePage.closeFirstAd();
        shopDropPage.MoveToShopElement();
        softAssert.assertEquals(shopDropPage.getTextOfSelectedElement(),"SHOP");
        softAssert.assertAll();
    }
    @Test(description = "verify user is able select element on shop dropdown")
    public void selectElementOnShopDropdown(){
        SoftAssert softAssert=new SoftAssert();
        homePage.closeFirstAd();
        shopDropPage.MoveToShopElement();
        shopDropPage.clickOnShopDropDown();
        softAssert.assertEquals(shopDropPage.getTextOfSelectedElement(),"SHOP");
        softAssert.assertAll();
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}