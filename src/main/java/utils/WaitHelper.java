package utils;
import  org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;
public class WaitHelper {
    private WebDriver driver;

    public WaitHelper(WebDriver driver) {
        this.driver = driver;
    }

    // Wait for element to be visible
    public WebElement waitForVisibility(By locator, int timeoutInSeconds) {
        return new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds))
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // Wait for element to be clickable
    public WebElement waitForClickable(By locator, int timeoutInSeconds) {
        return new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds))
                .until(ExpectedConditions.elementToBeClickable(locator));
    }

    // Wait for text to be present in element
    public void waitForTextToBePresent(By locator, String text, int timeoutInSeconds) {
        new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds))
                .until(ExpectedConditions.textToBePresentInElementLocated(locator, text));
    }

    // Fluent Wait for highly dynamic or unstable elements
    public WebElement fluentWaitForElement(By locator, int timeoutInSeconds, int pollingEveryMillis) {
        return new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(timeoutInSeconds))
                .pollingEvery(Duration.ofMillis(pollingEveryMillis))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .until(ExpectedConditions.presenceOfElementLocated(locator));
    }
}
