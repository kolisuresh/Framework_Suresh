package util;

import org.openqa.selenium.WebElement;
import testbase.WebTestBase;

public class WebElementUtil extends WebTestBase {

    public static void clickOnElement(WebElement element) {
        element.click();
    }
    public static void sendKeysOnElement(WebElement element,String text){
        element.sendKeys(text);
    }

    public static String getTextOfElement(WebElement webElement){
        return webElement.getText();
    }


}
