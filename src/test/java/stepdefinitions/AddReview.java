package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddReview extends BaseClass {

    @Given("launching the url {string}")
    public void launching_the_url(String url) throws InterruptedException {
        driver.get(url);
        winWait(2000);

    }

    @When("click the product button")
    public void click_the_product_button() {
        explicitWaitClick("//i[contains(@class,'material-icons card_travel')][@style='font-size: 16px;']");

    }

    @When("Verify user entered the all products page")
    public void verify_user_entered_the_all_products_page() {
        boolean displayed = driver
                .findElement(By.xpath("//h2[text()='All Products'][contains(@class,'title text-center')]"))
                .isDisplayed();
        if (displayed) {
            System.out.println("User entered the all products page successfully");
        }

    }

    @When("click on view product")
    public void click_on_view_product() throws InterruptedException {
        explicitWaitClick("(//a[@style='color: brown;'])[2]");
        winWait(2000);

    }

    @When("verify Write your Review element is visible")
    public void verify_write_your_review_element_is_visible() {
        boolean displayed = driver
                .findElement(By.xpath("//a[text()='Write Your Review'][@data-toggle='tab']"))
                .isDisplayed();
        if (displayed) {
            System.out.println("Write your Review element is visible");
        }

    }

    @When("enter your name {string}")
    public void enter_your_name(String data1) throws InterruptedException {
        sendKeys(driver.findElement(By.xpath("//input[@id='name']")), data1);
        winWait(500);

    }

    @When("enter the email address {string}")
    public void enter_the_email_address(String data2) throws InterruptedException {
        sendKeys(driver.findElement(By.xpath("//input[@id='email']")), data2);
        winWait(500);

    }

    @When("write your review {string}")
    public void write_your_review(String data3) throws InterruptedException {
        sendKeys(driver.findElement(By.xpath("//textarea[@id='review'][@name='review']")), data3);
        winWait(500);

    }

    @When("click the submit button")
    public void click_the_submit_button() throws InterruptedException {
        explicitWaitClick("//button[@id='button-review'][@type='submit']");
        winWait(500);

    }

    @Then("validate the response message")
    public void validate_the_response_message() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String actual = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//span[text()='Thank you for your review.'][@style='font-size: 20px;']"))).getText();
        if (actual.equals("Thank you for your review.")) {
            System.out.println("Response validated!");
        }

    }

    /*
     * 
     * @Given("launch the url")
     * public void launch_the_url() {
     * 
     * }
     * 
     * @When("click the product button")
     * public void click_the_product_button() {
     * 
     * }
     * 
     * @When("Verify user entered the all products page")
     * public void verify_user_entered_the_all_products_page() {
     * 
     * }
     * 
     * @When("click on view product")
     * public void click_on_view_product() {
     * 
     * }
     * 
     * @When("verify Write your Review element is visible")
     * public void verify_write_your_review_element_is_visible() {
     * 
     * }
     * 
     * @When("enter your name {string}")
     * public void enter_your_name(String string) {
     * 
     * }
     * 
     * @When("enter the email address {string}")
     * public void enter_the_email_address(String string) {
     * 
     * }
     * 
     * @When("write your review {string}")
     * public void write_your_review(String string) {
     * 
     * }
     * 
     * @When("click the submit button")
     * public void click_the_submit_button() {
     * 
     * }
     * 
     * @Then("validate the response message")
     * public void validate_the_response_message() {
     * 
     * }
     * 
     */

}
