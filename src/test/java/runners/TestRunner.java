package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = { "stepdefinitions", "hooks", "common",
<<<<<<< HEAD
        "pages" }, plugin = {
                "pretty", "html:target/cucumber-reports.html",
                "junit:target/junit-results.xml",

                "json:target/cucumber.json" }, monochrome = true, tags = "@smoke_API", dryRun = false)
=======
                "pages" }, plugin = {
                                "pretty", "html:target/cucumber-reports.html",
                                "junit:target/junit-results.xml",

                                "json:target/cucumber.json" }, monochrome = true,
                tags = "@smoke_API",
                dryRun = false)
>>>>>>> 9b91f334c5c20aeffc3684b5270593d74a26522b

public class TestRunner {
}
