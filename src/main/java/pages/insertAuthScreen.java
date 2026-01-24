package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WaitHelper;

public class insertAuthScreen {
    WebDriver driver;
    WaitHelper wait;
    By AuthXpath = By.className("android.widget.EditText");
    By loginXpath = By.xpath("//android.widget.Button[@text=\"Continue\"]");
    By insertAuthtextXpath =By.xpath("//android.widget.TextView[@text=\"Sign in with email\"]");
    public insertAuthScreen(WebDriver driver,WaitHelper wait){

        this.driver = driver;
        this.wait =wait;
    }

    public void insertAuth(String authcode){

        wait.waitForVisibility(insertAuthtextXpath,10);
        driver.findElement(AuthXpath).sendKeys(authcode);
    }


    public eventsScreen clickContinue(){
        wait.waitForVisibility(loginXpath,10).click();
        return new eventsScreen(driver,wait);
    }
}
