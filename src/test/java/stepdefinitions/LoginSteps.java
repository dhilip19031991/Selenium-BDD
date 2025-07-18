package stepdefinitions;

import io.cucumber.java.en.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.loginOR;

public class LoginSteps {
    WebDriver driver;

    @Given("I open the login page")
    public void open_login_page() {
        driver = new ChromeDriver();
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
        //String title = driver.getTitle();
        //assert title.contains("Dashboard");
        driver.quit();
    }
}
