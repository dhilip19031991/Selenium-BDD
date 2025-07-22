package hooks;

import common.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {

    common.BaseClass base = new common.BaseClass();

    @Before
    public void beforeScenario() {
        System.out.println("=== Launching Browser ===");
        base.browserLaunch();
    }

    @After
    public void afterScenario() {
        System.out.println("=== Closing Browser ===");
        base.closeBrowser();
    }
}
