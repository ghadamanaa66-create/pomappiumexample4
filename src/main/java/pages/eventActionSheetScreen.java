package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WaitHelper;

public class eventActionSheetScreen {
    WebDriver driver;
    WaitHelper wait;
    By evEventActionsheetCaptureXpath= By.xpath("//android.widget.TextView[@text=\"Capture\"]");

    public eventActionSheetScreen(WebDriver driver,WaitHelper wait) {
        this.driver=driver;
        this.wait=wait;
    }

    public TestNameEmailEventScreen captureEvEvent(){
        wait.waitForVisibility(evEventActionsheetCaptureXpath,5).click();
        return new TestNameEmailEventScreen(driver,wait);
    }




}
