import org.testng.annotations.Test;
import pages.events;
import pages.insertAuth;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class TestLogin  extends BaseTest{

    @Test
    public void testLogin() throws MalformedURLException, InterruptedException {
       // TimeUnit.SECONDS.sleep(20);

        insertEmailObject.insertEmail("ghada.gamal@leadliaison.com");
      insertAuth insertAuthobject = insertEmailObject.clickContinue();
        TimeUnit.SECONDS.sleep(20);
        insertAuthobject.insertAuth("ygmdvc");
        events eventobj =insertAuthobject.clickContinue();



    }

}
