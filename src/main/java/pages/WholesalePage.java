package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.ActionsUtil;
import util.WebDriverUtil;
import util.WebElementUtil;

public class WholesalePage extends WebTestBase {

    @FindBy(xpath = "//a[text()='Wholesale']")
    WebElement WholesaleBtn;

    @FindBy(xpath = "//a[@class='newsletter__close newsletter__trigger']")
    WebElement CloseAdOnWholesalePage;

    @FindBy(id = "input_5_25")
    WebElement NametextBox;

    @FindBy(id = "input_5_1")
    WebElement LastNameTextBox;

    @FindBy(id = "input_5_2")
    WebElement PhoneTextBox;

    @FindBy(id = "input_5_3")
    WebElement EmailTextBox;

    public WholesalePage() {
        PageFactory.initElements(driver, this);
    }

    public void Wholesale() {
        WebDriverUtil.waitElementUtilClickable(WholesaleBtn);
        WebDriverUtil.waitElementUtilClickable(CloseAdOnWholesalePage);
        WebElementUtil.sendKeysOnElement(NametextBox, "Name");
        WebDriverUtil.waitElementUtilClickable(LastNameTextBox);
        WebElementUtil.sendKeysOnElement(LastNameTextBox, "LastName");
        WebElementUtil.sendKeysOnElement(PhoneTextBox, "password");
        WebElementUtil.sendKeysOnElement(EmailTextBox, "Email");
    }

}
