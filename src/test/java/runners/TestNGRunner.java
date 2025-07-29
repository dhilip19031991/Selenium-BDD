package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features",
    glue = "stepdefinitions",
    plugin = {
        "pretty",
        "html:target/Testng-Reports/cucumber-html-report",
        "json:target/Testng-Reports/cucumber.json",
        "testng:target/Testng-Reports/testng-results.xml"
    }
)
public class TestNGRunner extends AbstractTestNGCucumberTests{

}
