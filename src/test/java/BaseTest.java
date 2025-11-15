import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import pages.insertEmail;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    public static AndroidDriver driver;
    protected  insertEmail insertEmailObject;
    @BeforeClass
    public  void setUp() throws MalformedURLException {

        UiAutomator2Options options = new UiAutomator2Options()
                .setPlatformName("Android")
                .setAutomationName("UiAutomator2")
                .setDeviceName("Redmi")
                .setAppPackage("com.leadliaison.captello")
                .setAppActivity("com.leadliaison.captello.MainActivity");
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        insertEmailObject = new insertEmail(driver);

    }

    public void tearDown() throws MalformedURLException {
        driver.quit();
    }

}