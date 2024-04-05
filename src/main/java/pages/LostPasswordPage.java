package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.WebDriverUtil;
import util.WebElementUtil;

public class LostPasswordPage extends WebTestBase {
    @FindBy(xpath = "//input[@class='woocommerce-Input woocommerce-Input--text input-text']")
    WebElement emailtext;

    @FindBy(xpath = "//p[@class='woocommerce-form-row form-row']")
    WebElement ClickResetPassword;


    public LostPasswordPage() {
        PageFactory.initElements(driver,this);
    }

    public void newEmailText (String text) {
        WebElementUtil.sendKeysOnElement(emailtext,text);
        WebDriverUtil.waitElementUtilClickable(ClickResetPassword);
    }
}
