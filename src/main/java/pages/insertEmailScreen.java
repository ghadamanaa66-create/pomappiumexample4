package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WaitHelper;
import java.time.Duration;

public class insertEmailScreen {
    WebDriver driver;
    WaitHelper wait;

    By emailClassName = By.className("android.widget.EditText");
    By continueClassName = By.xpath("//android.widget.Button[@text=\"Continue\"]");
    By logoXpath =By.xpath("//android.widget.Image[@content-desc=\"logo\"]");
    By arrowIconXpath=By.xpath("//android.view.View[@resource-id=\"main-content\"]/android.view.View/android.view.View[1]/android.view.View/android.view.View[7]/android.view.View/android.widget.Button");
    By sandboxXpath=By.xpath("//android.widget.RadioGroup/android.view.View[2]/android.view.View/android.view.View");

    public insertEmailScreen(WebDriver driver,WaitHelper wait){
        this.driver = driver;
        this.wait =wait;
    }

    public void insertEmail(String email){
        driver.findElement(emailClassName).sendKeys(email);
    }


   public insertAuthScreen clickContinue(){
        //driver.findElement(continueClassName).click();
       wait.waitForClickable(continueClassName,10).click();
       return new insertAuthScreen(driver,wait);
   }

   public void clickLogo(){

       wait.waitForClickable(logoXpath,10).click();
   }

   public void clickArrow(){
       wait.waitForClickable(arrowIconXpath,10).click();
   }

   public void clickSandbox(){
       wait.waitForClickable(sandboxXpath,10).click();
   }
}

