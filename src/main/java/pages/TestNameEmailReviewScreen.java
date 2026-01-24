package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WaitHelper;

public class TestNameEmailReviewScreen {
    WebDriver driver;
    WaitHelper wait;
    By emailxpath=By.xpath("//android.widget.EditText[@text='xx@xx.com']");
    By fnamexpath=By.xpath("//android.widget.EditText[@text='fname']");
    By lname=By.xpath("//android.widget.EditText[@text='fname']");
    By EditXpath=By.xpath("//android.widget.Button[@text=\"Edit\"]");

    public TestNameEmailReviewScreen(WebDriver driver, WaitHelper wait){
        this.driver = driver;
        this.wait =wait;
    }

    public WebElement GetEmailElement(){
        WebElement ReviewEmail =wait.waitForVisibility(emailxpath,10);
        return ReviewEmail ;
    }

    public WebElement GetFnameElement(){
        WebElement ReviewFnameElement =wait.waitForVisibility(fnamexpath,20);
        return ReviewFnameElement ;
    }
    public WebElement GetLnameElement(){
        WebElement ReviewlnameElement =wait.waitForVisibility(lname,20);
        return ReviewlnameElement ;
    }
    public void edit(){
        wait.waitForVisibility(EditXpath,20).click();
    }

}
