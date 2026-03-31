import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlleventsScreen;
import pages.insertAuthScreen;

import java.net.MalformedURLException;

public class TestAudioElement extends BaseTest{
    @Test(priority = 1)
    public void testLogin() throws MalformedURLException, InterruptedException {
        //TimeUnit.SECONDS.sleep(20);
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
        //TimeUnit.SECONDS.sleep(20);
        WebElement leftmenueiconeElement  =eventobj.getleftmenuxpath();
        Assert.assertTrue(leftmenueiconeElement.isDisplayed(), "The left menue icon is not visible on the page");

    }


    public void testrecordAudio(){

    }

    public void testendAudio(){

    }
    public void testpalyAudio(){

    }


}

