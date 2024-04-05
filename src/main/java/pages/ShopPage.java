package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.DropDownUtil;
import util.WebDriverUtil;

public class ShopPage extends WebTestBase {

    @FindBy(className = "menu__ul__li__a")
    WebElement Wholesale;


    @FindBy(xpath = "//a[text()='Shop']")
    WebElement ShopSubMenu;
    @FindBy(xpath = "//img[@alt='Campos Superior Blend']")
    WebElement Product;



    @FindBy(xpath = "//a[@class='newsletter__close newsletter__trigger']")
    WebElement ShopAdClose;

    @FindBy(xpath = "//select[@class='pa_weight']")
    WebElement SelectBtn;

    @FindBy(xpath = "//option[@value='500g']")
    WebElement BagSizeBtn;

    @FindBy(xpath = "//label[@for='wholebeans-true']")
    WebElement SelectGrid;

    @FindBy(xpath = "//label[@for='subscription-false']")
    WebElement SelectFREQUENCY;

    @FindBy(xpath = "//a[@class='button add-to-cart__button button--primary']")
    WebElement AddCartBtn;

    @FindBy(xpath = "//a[@class='button button--primary']")
    WebElement Checkout;

    public ShopPage() {
        PageFactory.initElements(driver, this);
    }

    public void ShopOpenCoffee() {
        WebDriverUtil.waitElementUtilClickable(ShopSubMenu);
        WebDriverUtil.waitElementUtilClickable(ShopAdClose);
        WebDriverUtil.waitElementUtilClickable(Product);
        WebDriverUtil.waitElementUtilClickable(SelectBtn);
        WebDriverUtil.waitElementUtilClickable(BagSizeBtn);
        WebDriverUtil.waitElementUtilClickable(SelectGrid);
        WebDriverUtil.waitElementUtilClickable(SelectFREQUENCY);
        WebDriverUtil.waitElementUtilClickable(AddCartBtn);
        WebDriverUtil.waitElementUtilClickable(Checkout);
    }public void clickOnShopLink(){

    WebDriverUtil.waitElementUtilClickable(ShopSubMenu);}
}
