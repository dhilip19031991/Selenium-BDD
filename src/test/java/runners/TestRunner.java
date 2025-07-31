package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = { "stepdefinitions", "hooks", "common",
                "pages" }, plugin = {
                                "pretty", "html:target/cucumber-reports.html",
                                "junit:target/junit-results.xml",
<<<<<<< HEAD
                                "json:target/cucumber.json" }, monochrome = true,
                // tags = "@smk",
                dryRun = false)
=======
                                "json:target/cucumber.json" }, monochrome = true, 
                 tags = "@smoke_api", 
                 dryRun = false)
>>>>>>> fc51564e618f77cbb311700e5b5ebcac556bdb36
public class TestRunner {
}
