package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "stepdefinitions",
    plugin = {
        "pretty",
        "json:target/cucumber.json",
        "html:target/cucumber-html-report.html"
    },
    monochrome = true
)
public class TestRunner {}
