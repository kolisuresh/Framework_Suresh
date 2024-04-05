package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import testbase.WebTestBase;
import util.WebDriverUtil;
import util.WebElementUtil;

public class HomePage extends WebTestBase {

    @FindBy(xpath = "//a[@class = 'newsletter__close newsletter__trigger']")
    static WebElement closedAd;

    @FindBy(xpath = "//a[@class='user-controls__ul__li__a']")
    WebElement loginAndRegister;

    @FindBy(id="search")
    WebElement SearchButton;

    @FindBy(className = "search__input")
    WebElement SearchText;

    @FindBy(xpath = "//div[@class='menu__ul__li__icon accordion__toggle']")
    WebElement Shop;



    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public static void closeFirstAd() {
        WebDriverUtil.waitElementUtilClickable(closedAd);
    }

    public void clickOnLoginAndRegister() {
        WebDriverUtil.waitElementUtilClickable(loginAndRegister);
    }

    public void clickOnSearchButton(String text) {
        WebElementUtil.sendKeysOnElement(SearchText,text);

        WebDriverUtil.waitElementUtilClickable(SearchButton);

        WebDriverUtil.waitElementUtilClickable(SearchText);

    }
    public  void  ShopSubmenu() {
        WebDriverUtil.waitElementUtilClickable(Shop);
    }
}
