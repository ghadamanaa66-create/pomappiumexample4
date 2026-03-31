import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pages.*;
import pages.ReviewSubmssion;
import java.net.MalformedURLException;
import java.net.URL;

import utils.WaitHelper;
public class BaseTest {

    public static WebDriver driver;
    protected insertEmailScreen insertEmailObject;
    protected EventCapture testNameEmailEventScreenObject;
    protected ReviewSubmssion testNameEmailReviewScreenObject;
    protected eventActionSheetScreen eventActionSheetScreenObject;
    public static WaitHelper wait;
    protected AlleventsScreen eventsScreenObject;
    protected EventCapture TestNameEmailEventScreenObject;
    protected AllLeads TestNameEmailLeadsScreenObject;
    @BeforeClass
    public  void setUp() throws MalformedURLException {

        UiAutomator2Options options = new UiAutomator2Options()
                .setPlatformName("Android")
                .setAutomationName("UiAutomator2")
                .setDeviceName("Redmi")
                .setAppPackage("com.leadliaison.captello")
                .setAppActivity("com.leadliaison.captello.MainActivity");
         driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
         wait = new WaitHelper(driver);
        insertEmailObject = new insertEmailScreen(driver,wait);
        testNameEmailEventScreenObject = new EventCapture(driver,wait);
        testNameEmailReviewScreenObject = new ReviewSubmssion(driver,wait);
        eventActionSheetScreenObject  = new eventActionSheetScreen(driver,wait);
        eventsScreenObject = new AlleventsScreen(driver, wait);
        TestNameEmailEventScreenObject = new EventCapture(driver,wait);
        TestNameEmailLeadsScreenObject = new AllLeads(driver,wait);

    }

     @AfterClass
    public void tearDown() throws MalformedURLException {
        //driver.quit();
    }

}