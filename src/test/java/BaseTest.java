import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pages.*;
import pages.TestNameEmailReviewScreen;
import java.net.MalformedURLException;
import java.net.URL;

import utils.WaitHelper;
public class BaseTest {

    public static WebDriver driver;
    protected insertEmailScreen insertEmailObject;
    protected TestNameEmailEventScreen testNameEmailEventScreenObject;
    protected TestNameEmailReviewScreen testNameEmailReviewScreenObject;
    protected eventActionSheetScreen eventActionSheetScreenObject;
    public static WaitHelper wait;
    protected eventsScreen eventsScreenObject;
    protected  TestNameEmailEventScreen TestNameEmailEventScreenObject;
    protected  TestNameEmailLeadsScreen TestNameEmailLeadsScreenObject;
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
        testNameEmailEventScreenObject = new TestNameEmailEventScreen(driver,wait);
        testNameEmailReviewScreenObject = new TestNameEmailReviewScreen(driver,wait);
        eventActionSheetScreenObject  = new eventActionSheetScreen(driver,wait);
        eventsScreenObject = new eventsScreen(driver, wait);
        TestNameEmailEventScreenObject = new TestNameEmailEventScreen(driver,wait);
        TestNameEmailLeadsScreenObject = new TestNameEmailLeadsScreen(driver,wait);

    }

     @AfterClass
    public void tearDown() throws MalformedURLException {
        //driver.quit();
    }

}