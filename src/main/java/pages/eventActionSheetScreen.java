package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ScrollHelper;
import utils.WaitHelper;

public class eventActionSheetScreen {
    WebDriver driver;
    WaitHelper wait;
    ScrollHelper scroll;
    By evEventActionsheetCaptureXpath= By.xpath("//android.widget.TextView[@text=\"Capture\"]");

    public eventActionSheetScreen(WebDriver driver,WaitHelper wait) {
        this.driver=driver;
        this.wait=wait;
    }

    public EventCapture captureEvEvent(){
        wait.waitForVisibility(evEventActionsheetCaptureXpath,50).click();
        return new EventCapture(driver,wait,scroll);
    }




}
