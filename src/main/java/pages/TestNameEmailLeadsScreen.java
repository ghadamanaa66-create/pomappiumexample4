package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WaitHelper;

public class TestNameEmailLeadsScreen {
    WebDriver driver;
    WaitHelper wait;
    By LatestSubXpath=By.xpath("//android.view.View[@resource-id=\"main-content\"]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.widget.Image");

    public TestNameEmailLeadsScreen(WebDriver driver, WaitHelper wait) {
        this.driver = driver;
        this.wait =wait;
    }

    public TestNameEmailReviewScreen viewLatesSubmission(){
        wait.waitForVisibility(LatestSubXpath,10).click();
      return new TestNameEmailReviewScreen(driver,wait);
    }
}
