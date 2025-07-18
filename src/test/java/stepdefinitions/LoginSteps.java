package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import pages.loginOR;
import common.BaseClass;

public class LoginSteps extends BaseClass {

    @Given("I open the login page")
    public void open_login_page() {
        driver.get("https://demo-saas.bugbug.io/sign-in");
    }

    @When("I enter valid credentials")
    public void enter_credentials() {
        driver.findElement(loginOR.EMAIL_INPUT).sendKeys("admin");
        driver.findElement(loginOR.PASSWORD_INPUT).sendKeys("admin123");
        driver.findElement(loginOR.LOGIN_BUTTON).click();
    }

    @Then("I should see the homepage")
    public void verify_homepage() {
        String title = driver.getTitle();
        System.out.println("Page title: " + title);
        // Update this check to match the actual homepage title after login
        if (!title.toLowerCase().contains("demo saas")) {
            throw new AssertionError("Homepage not displayed! Title was: " + title);
        }
    }
}
