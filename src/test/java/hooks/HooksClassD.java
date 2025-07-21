package hooks;

import common.BaseClassD;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClassD extends BaseClassD {

    @Before
    public void setup() {
        browserLaunch();
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
