package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.WebDriverUtil;
import util.WebElementUtil;

public class RegisterPage extends WebTestBase {
    @FindBy(xpath = "//a[@href='https://camposcoffee.com/my-account/?register']")
    WebElement clickRrgisterBtn;

    @FindBy(id="reg_email")
    WebElement ClickRegisterEmailText;

    @FindBy(xpath = "//input[@id='reg_password']")
    WebElement ClickRegisterPasswordText;

    @FindBy(xpath = "//input[@value='Register']")
    WebElement ClickRegisterBtnOnRegisterPage;


    public RegisterPage() {
        PageFactory.initElements(driver,this);
    }

    public void clickRrgisterBtn(){
        WebDriverUtil.waitElementUtilClickable(clickRrgisterBtn);
    }

    public void SetRegister (String Email,String RegPassword){
        WebElementUtil.sendKeysOnElement(ClickRegisterEmailText ,Email);
        WebElementUtil.sendKeysOnElement(ClickRegisterPasswordText,RegPassword);
        WebDriverUtil.waitElementUtilClickable(ClickRegisterBtnOnRegisterPage);
    }
}
