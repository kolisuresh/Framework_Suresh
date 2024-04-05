package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.WebDriverUtil;
import util.WebElementUtil;

public class LoginPage extends WebTestBase {

    @FindBy(id="username")
    WebElement userNameTextBox;

    @FindBy(id="password")
    WebElement passwordTextBox;

    @FindBy(name = "login")
    WebElement loginBtn;

    @FindBy(xpath = "//strong[text()='ERROR']")
    WebElement errorMessage;

    @FindBy(xpath = "//p[@class='woocommerce-LostPassword lost_password']")
    WebElement LostPasswordBtn;

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    public void setlogin(String username,String password){
        WebElementUtil.sendKeysOnElement(userNameTextBox,username);
        WebElementUtil.sendKeysOnElement(passwordTextBox,password);
        WebDriverUtil.waitElementUtilClickable(loginBtn);
    }
    public String getTextOfErrorMessage(){
       return WebElementUtil.getTextOfElement(errorMessage);
    }
    public void lostPasswordbtn(){
        WebElementUtil.clickOnElement(LostPasswordBtn);
    }

}

