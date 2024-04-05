package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.ActionsUtil;
import util.WebDriverUtil;

public class SubscriptionsPage extends WebTestBase {
    @FindBy(xpath = "//a[text()='Subscriptions']")
    WebElement SubscriptionBtn;

    public SubscriptionsPage() {
        PageFactory.initElements(driver,this);
    }

    public void Subcription(){

       ActionsUtil.moveToElement(SubscriptionBtn);
        WebDriverUtil.waitElementUtilClickable(SubscriptionBtn);
    }
}
