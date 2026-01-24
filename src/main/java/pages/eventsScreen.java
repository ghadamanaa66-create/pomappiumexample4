package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WaitHelper;

public class eventsScreen {
    WebDriver driver;
    WaitHelper wait;
    By allowNotificationXpath = By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]");
    By leftmenuiconXpath=By.xpath("//android.widget.Button[@content-desc=\"menu\"]");
    By evEventXpath=By.xpath("//android.widget.Image[@text=\"bg3\"]");
    By leadslinkXpath =By.xpath("(//android.widget.Button[@text=\"Leads\"])[1]");

    public eventsScreen(WebDriver driver,WaitHelper wait) {
        this.driver = driver;
        this.wait =wait;
    }

    public void allownotification(){
        wait.waitForVisibility(allowNotificationXpath,5).click();
    }

    public WebElement getleftmenuxpath(){
        WebElement leftmenueiconeElement= wait.waitForVisibility(leftmenuiconXpath,5);
        return leftmenueiconeElement;
    }
    public void clickeventev(){
        wait.waitForVisibility(evEventXpath,10).click();
    }

    public TestNameEmailLeadsScreen clickleadsArrow(){
        wait.waitForVisibility(leadslinkXpath,10).click();
        return new TestNameEmailLeadsScreen(driver,wait);
    }

}
