package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = { "stepdefinitions", "hooks", "common",
                "pages" }, plugin = {
                                "pretty", "html:target/cucumber-reports.html",
                                "junit:target/junit-results.xml",

                                "json:target/cucumber.json" }, monochrome = true,
                tags = "@smoke_API",
                dryRun = false)

public class TestRunner {
}
