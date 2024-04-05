package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;

import util.ActionsUtil;
import util.DropDownUtil;
import util.WebDriverUtil;
import util.WebElementUtil;

public class ShopDropPage extends WebTestBase {
    @FindBy(xpath = "//a[text()='Shop']")
    WebElement shopLink;

    @FindBy(id = "sort")
    WebElement sortDroDown;

    @FindBy(xpath = "//option[text()='Latest']")
    WebElement selectElement;

    @FindBy(xpath = "//div[text()='Campos Superior Blend']")
    WebElement sampleProduct;

    @FindBy(xpath = "//select[@class='pa_weight']")
    WebElement selectBtn;

    @FindBy(xpath = "//div[text()='Whole Beans']")
    WebElement selectGrind;
    @FindBy(xpath = "//div[text()='Once off']")
    WebElement selectFrequency;

    @FindBy(xpath = "//div[text()=' - Add to cart']")
    WebElement addToCart;
    @FindBy(xpath = "//a[text()='Checkout']")
    WebElement checkOut;
    @FindBy(xpath = "//h3[text()='Your order']")
    WebElement yourOrderPageText;
    @FindBy(xpath = "//a[contains(@class,'filter-bar__inner__section__trigger filter__')]")
    WebElement flitersBtn;
    @FindBy(xpath = "//label[text()='Cup Of Excellence®']")
    WebElement selectFilter;
    @FindBy(xpath = "//a[text()='See 3 results']")
    WebElement seeResult;
    @FindBy(xpath = "//a[text()='Coffee']")
    WebElement shopDropDown;

    public ShopDropPage(){
        PageFactory.initElements(driver, this);
    }


    public void clickOnFiltersBtn(){
        WebDriverUtil.waitElementUtilClickable(flitersBtn);
        WebDriverUtil.waitElementUtilClickable(selectFilter);
        WebDriverUtil.waitElementUtilClickable(seeResult);
    }

    public void clickOnShopLink(){
        WebDriverUtil.waitElementUtilClickable(shopLink);
    }
    public void sampleProductSelect(){
        WebDriverUtil.waitElementUtilClickable(sampleProduct);
    }
    public void selectWeightFromDropDown(){
        WebDriverUtil.waitElementUtilClickable(selectBtn);
        DropDownUtil.dropDownElement("500g", selectBtn);
    }

    public void ShopProducts(){
        WebDriverUtil.waitElementUtilClickable(selectGrind);
        WebDriverUtil.waitElementUtilClickable(addToCart);
        WebDriverUtil.waitElementUtilClickable(checkOut);
    }
    public String grtTextOfYourOrderPage(){
        return WebElementUtil.getTextOfElement(yourOrderPageText);
    }

    public void clickOnDropDown(){
        WebDriverUtil.waitElementUtilClickable(sortDroDown);

    }
    public void selectDropDown(){
        WebDriverUtil.waitElementUtilClickable(sortDroDown);

        DropDownUtil.dropDownElement("Latest" , sortDroDown);


    }
    public void MoveToShopElement(){
        ActionsUtil.moveToElement(shopLink);
    }
    public void clickOnShopDropDown(){
        WebDriverUtil.waitElementUtilClickable(shopDropDown);
    }
    public String getTextOfSelectedElement(){
        return WebElementUtil.getTextOfElement(shopLink);

    }

}