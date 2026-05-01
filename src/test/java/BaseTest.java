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

    @BeforeClass(alwaysRun = true)
    public  void setUp() throws MalformedURLException {
      /*UiAutomator2Options options = new UiAutomator2Options()
                .setPlatformName("Android")
                .setAutomationName("UiAutomator2")
                .setDeviceName("Redmi")
                .setAppPackage("com.leadliaison.captello")
                .setAppActivity("com.leadliaison.captello.MainActivity");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);*/

        UiAutomator2Options options = new UiAutomator2Options()
                .setPlatformName("Android")
                .setDeviceName("emulator-5554")
                .setAutomationName("UiAutomator2")
                .setAppPackage("com.leadliaison.captello")
                .setAppActivity("com.leadliaison.captello.MainActivity");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        wait=new WaitHelper(driver);
        insertEmailObject = new insertEmailScreen(driver,wait);
        testNameEmailEventScreenObject = new EventCapture(driver,wait);
        testNameEmailReviewScreenObject = new ReviewSubmssion(driver,wait);
        eventActionSheetScreenObject  = new eventActionSheetScreen(driver,wait);
        eventsScreenObject = new AlleventsScreen(driver, wait);
        TestNameEmailEventScreenObject = new EventCapture(driver,wait);
        TestNameEmailLeadsScreenObject = new AllLeads(driver,wait);
        login ();



    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws MalformedURLException {
        //driver.quit();
    }

     public void login (){
         for (int i=0;i<20;i++){ insertEmailObject.clickLogo();}
         insertEmailObject.clickArrow();
         insertEmailObject.clickSandbox();
         insertEmailObject.insertEmail("ghada.gamal+888888847375438@leadliaison.com");
         insertAuthScreen insertAuthobject = insertEmailObject.clickContinue();
         // TimeUnit.SECONDS.sleep(20);
         insertAuthobject.insertAuth("W89W2");
         AlleventsScreen eventobj =insertAuthobject.clickContinue();
         //TimeUnit.SECONDS.sleep(20);
         eventobj.allownotification();
     }
}