import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.eventsScreen;
import pages.insertAuthScreen;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class TestLogin  extends BaseTest{

    @Test
    public void testLogin() throws MalformedURLException, InterruptedException {
        //TimeUnit.SECONDS.sleep(20);
        for (int i=0;i<20;i++){ insertEmailObject.clickLogo();}
       insertEmailObject.clickArrow();
        insertEmailObject.clickSandbox();
        insertEmailObject.insertEmail("ghada.gamal+888888847375438@leadliaison.com");
      insertAuthScreen insertAuthobject = insertEmailObject.clickContinue();
       // TimeUnit.SECONDS.sleep(20);
        insertAuthobject.insertAuth("W89W2");
        eventsScreen eventobj =insertAuthobject.clickContinue();
        //TimeUnit.SECONDS.sleep(20);
        eventobj.allownotification();
        //TimeUnit.SECONDS.sleep(20);
         WebElement leftmenueiconeElement  =eventobj.getleftmenuxpath();
        Assert.assertTrue(leftmenueiconeElement.isDisplayed(), "The left menue icon is not visible on the page");



    }

}
