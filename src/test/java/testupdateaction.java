import org.testng.Assert;
import org.testng.annotations.Test;

public class testupdateaction  extends BaseTest{
    @Test(priority = 1)
    public void validatecheckbox2valuewillchange(){
        eventsScreenObject.clickeventev();
        eventActionSheetScreenObject.captureEvEvent();
        testNameEmailEventScreenObject.insertvaluecheckbox1();
        String text =TestNameEmailEventScreenObject.getcheckedvalueforcheckbox2();
        Assert.assertEquals(text,"First Option");

    }
}
