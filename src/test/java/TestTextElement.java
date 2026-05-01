import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlleventsScreen;
import pages.insertAuthScreen;

import java.net.MalformedURLException;

public class TestTextElement extends BaseTest{


    @Test(priority = 1)
    public void InsertText (){
        eventsScreenObject.clickeventev();
        eventActionSheetScreenObject.captureEvEvent();
        testNameEmailEventScreenObject.insertNameAndEmail();
        testNameEmailEventScreenObject.submit();
    }
    @Test(priority = 2)
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
