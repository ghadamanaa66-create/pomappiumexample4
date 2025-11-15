package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class insertEmail {
    WebDriver driver;
    By emailClassName = By.className("android.widget.EditText");
    By continueClassName = By.xpath("//android.widget.Button[@text=\"Continue\"]");
    public insertEmail(WebDriver driver){
        this.driver = driver;
    }

    public void insertEmail(String email){
        driver.findElement(emailClassName).sendKeys(email);
    }
   public insertAuth clickContinue(){
        driver.findElement(continueClassName).click();
        return new insertAuth (driver);
   }

}
