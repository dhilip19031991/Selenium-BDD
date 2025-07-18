package stepdefinitions;

import common.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {

    @Before
    public void setup() {
        browserLaunch();
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
