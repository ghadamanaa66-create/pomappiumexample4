import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestNameEmailLeadsScreen;
import pages.TestNameEmailReviewScreen;
import pages.eventsScreen;
import pages.insertAuthScreen;

import java.net.MalformedURLException;

public class TestTextElement extends BaseTest{
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
        eventsScreen eventobj =insertAuthobject.clickContinue();
        //TimeUnit.SECONDS.sleep(20);
        eventobj.allownotification();
        //TimeUnit.SECONDS.sleep(20);
        WebElement leftmenueiconeElement  =eventobj.getleftmenuxpath();
        Assert.assertTrue(leftmenueiconeElement.isDisplayed(), "The left menue icon is not visible on the page");

    }

    @Test(priority = 2)
    public void InsertText (){
        eventsScreenObject.clickeventev();
        eventActionSheetScreenObject.captureEvEvent();
        testNameEmailEventScreenObject.insertNameAndEmail();
        testNameEmailEventScreenObject.submit();
    }
    @Test(priority = 3)
    public void testGetText(){

        TestNameEmailEventScreenObject.back();
        eventsScreenObject.clickleadsArrow();
        TestNameEmailLeadsScreenObject.viewLatesSubmission();
        testNameEmailReviewScreenObject.edit();
        String StoredEmail= testNameEmailReviewScreenObject.GetEmailElement().getText();
        String StoredFname= testNameEmailReviewScreenObject.GetFnameElement().getText();
        String StoredLname= testNameEmailReviewScreenObject.GetLnameElement().getText();
        Assert.assertEquals(StoredEmail,"xx@xx.com");
        Assert.assertEquals(StoredFname,"fname");
        Assert.assertEquals(StoredLname,"lastname");
    }
}
