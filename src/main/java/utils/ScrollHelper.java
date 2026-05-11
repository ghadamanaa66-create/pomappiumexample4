package utils;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebDriver;





public class ScrollHelper {
    private WebDriver driver;
    public ScrollHelper(WebDriver driver) {
        this.driver = driver;
    }
    public void  scrolltillfindelement(String text) {
        Boolean found = false;
        int maxRetries = 5;
        while (!found && maxRetries > 0) {
            try {
                driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"" + text + "\")"));
                found = true;
            } catch (Exception e) {
                // Perform one manual scroll forward
                driver.findElement(AppiumBy.androidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
            }

        }
    }
    public void scrolltotop(){
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(10)"
        ));
    }
}
