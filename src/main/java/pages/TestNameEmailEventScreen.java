package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WaitHelper;

public class TestNameEmailEventScreen {

    WebDriver driver;
    WaitHelper wait;
    By emailXpath = By.xpath("//android.widget.EditText[@resource-id=\"ion-input-13\"]");
    By fnameXpath = By.xpath("//android.widget.EditText[@resource-id=\"ion-input-14\"]");
    By lnameXpath = By.xpath("//android.widget.EditText[@resource-id=\"ion-input-15\"]");
    By submitXpath =By.xpath("(//android.widget.Button[@text=\"Submit\"])[1]");
    By backXpath =By.xpath("//android.widget.Button[@content-desc=\"Back\"]");
    public TestNameEmailEventScreen(WebDriver driver, WaitHelper wait) {
        this.driver = driver;
        this.wait =wait;
    }
    public void  insertNameAndEmail(){
        wait.waitForVisibility(emailXpath,10).sendKeys("xx@xx.com");
        wait.waitForVisibility(fnameXpath,10).sendKeys("fname");
        wait.waitForVisibility(lnameXpath,10).sendKeys("lastname");

    }

    public void submit(){
        wait.waitForClickable(submitXpath,10).click();
    }

    public void back(){
        wait.waitForClickable(backXpath,10).click();
    }
}
