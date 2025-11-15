package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class insertAuth {
    WebDriver driver;
    By AuthXpath = By.className("android.widget.EditText");
    By loginXpath = By.xpath("//android.widget.Button[@text=\"Continue\"]");
    public insertAuth(WebDriver driver){
        this.driver = driver;
    }

    public void insertAuth(String authcode){
        driver.findElement(AuthXpath).sendKeys(authcode);
    }
    public events clickContinue(){
        driver.findElement(loginXpath).click();
        return new events (driver);
    }
}
