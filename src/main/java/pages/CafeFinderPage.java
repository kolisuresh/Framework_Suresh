package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.WebDriverUtil;

public class CafeFinderPage extends WebTestBase {
    @FindBy(xpath = "//a[text()='Café Finder']")
    WebElement CafeFindBtn;

    @FindBy(id="locationSearchButton")
    WebElement FindBtn;

    @FindBy(xpath = "//div[@class='mc-closeModal']")
    WebElement CloseDiscountAD;

    public CafeFinderPage() {
        PageFactory.initElements(driver, this);
    }

    public void CafeFind(){
        WebDriverUtil.waitElementUtilClickable(CafeFindBtn);
        WebDriverUtil.waitElementUtilClickable(CloseDiscountAD);
        WebDriverUtil.waitElementUtilClickable(FindBtn);
    }

}
