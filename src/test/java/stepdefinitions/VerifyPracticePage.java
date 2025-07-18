package stepdefinitions;

import java.awt.AWTException;

import org.openqa.selenium.By;

import common.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyPracticePage extends BaseClass {

    @Given("launch the url {string}")
    public void launch_the_url(String url) throws InterruptedException {
        driver.get(url);
        winWait(2000);
    }

    @When("clicking the radio button")
    public void clicking_the_radio_button() throws InterruptedException {
        explicitWaitClick("//input[@value='radio3'][@name='radioButton'][@type='radio']");
        winWait(2000);
        System.out.println("button clicked");

    }

    @When("enter the conuntry name {string}")
    public void enter_the_conuntry_name(String name) throws InterruptedException, AWTException {
        sendKeys(driver.findElement(By.xpath("//input[@id='autocomplete'][@type='text']")), name);
        robotDown(2);
        robotEnter();
        winWait(2000);
    }

    @When("select the option from drop down")
    public void select_the_option_from_drop_down() throws InterruptedException {

        element = driver
                .findElement(By.xpath("//select[@id='dropdown-class-example'][@name='dropdown-class-example']"));
        element.sendKeys("Option1");
        winWait(1000);
        // selectOptions_Index(element, 0);

    }

    @When("click the check box")
    public void click_the_check_box() throws InterruptedException {
        explicitWaitClick("//input[@id='checkBoxOption2']");
        winWait(2000);
        explicitWaitClick("//input[@id='checkBoxOption3']");
        winWait(2000);

    }

    @Then("click the home button")
    public void click_the_home_button() throws InterruptedException {
        explicitWaitClick("//button[contains(@class,'btn btn-primary')][text()='Home']");
        winWait(2000);

    }

    @Then("verify if navigated to home page")
    public void verify_if_navigated_to_home_page() {
        System.out.println("Navigated to home page successfully!");

    }

}
