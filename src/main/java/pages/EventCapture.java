package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WaitHelper;
import utils.ScrollHelper;

import java.util.List;

public class EventCapture {

    WebDriver driver;
    WaitHelper wait;
    ScrollHelper scroll;
    By emailXpath = By.xpath("//android.widget.EditText[@resource-id=\"ion-input-13\"]");
    By fnameXpath = By.xpath("//android.widget.EditText[@resource-id=\"ion-input-14\"]");
    By lnameXpath = By.xpath("//android.widget.EditText[@resource-id=\"ion-input-15\"]");
    By submitXpath =By.xpath("(//android.widget.Button[@text=\"Submit\"])[1]");
    By backXpath =By.xpath("//android.widget.Button[@content-desc=\"Back\"]");
    By checkbox1Xpath=By.xpath("(//android.widget.CheckBox[@text=\"First Option\"])[1]");
    By checkbox2alloptionsxpath=By.xpath("//android.widget.TextView[@text='box2']/following-sibling::android.view.View//android.widget.CheckBox");

    public EventCapture(WebDriver driver, WaitHelper wait , ScrollHelper scroll) {
        this.driver = driver;
        this.wait =wait;
        this.scroll=scroll;
    }
    public void  insertNameAndEmail(){
        wait.waitForVisibility(emailXpath,50).sendKeys("xx@xx.com");
        wait.waitForVisibility(fnameXpath,50).sendKeys("fname");
        wait.waitForVisibility(lnameXpath,50).sendKeys("lastname");

    }

    public void insertvaluecheckbox1(){
        scroll.scrolltillfindelement("Checkboxes1");
        wait.waitForVisibility(checkbox1Xpath,50).click();
    }

    public String  getcheckedvalueforcheckbox2() {
        scroll.scrolltotop();
        scroll.scrolltillfindelement("box2");
        List<WebElement> options = wait.waitForVisibilityalloptionsforcheckbox(checkbox2alloptionsxpath, 10);
        for (WebElement option : options) {
            if (option.isSelected()) {
                return option.getText();
            }
        }
        return null;
    }
    public void submit(){
        wait.waitForClickable(submitXpath,50).click();
    }

    public void back(){
        wait.waitForClickable(backXpath,50).click();
    }
}
