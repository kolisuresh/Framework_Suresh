package util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testbase.WebTestBase;

import java.time.Duration;

public class WebDriverUtil extends WebTestBase {

    public static final long IMPLICIT_WAIT = 50;
    public static final long PAGE_LOAD_TIMEOUT = 50;
    public static final long EXPLICIT_WAIT = 50;

    public static WebDriverUtil webDriverUtil;

    public static void waitElementUtilClickable(WebElement element){

        WebDriverWait WebDriverWait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        WebDriverWait.until(ExpectedConditions.elementToBeClickable(element)).click();

    }
}
