package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import common.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddTrainingLocator;

public class AddTraining extends BaseClass {

    // public static WebDriver driver;

    @Given("launch the employee training url")
    public void launch_the_employee_training_url() throws InterruptedException {
        BaseClass.winWait(1000);

        driver.get("http://10.192.190.130:3000/");
        BaseClass.winWait(1000);

    }

    @When("click the add training button")
    public void click_the_add_training_button() throws InterruptedException {
        BaseClass.winWait(1000);
        // BaseClass.click(new AddTrainingLocator().getAddTrainingBtn());
        // BaseClass.winWait(2000);
        explicitWaitClick("//button[@type='button'][@aria-label='Add Training']");
        BaseClass.winWait(1000);
        System.out.println("clicked=====");

    }

    @When("verify the user is navigated to the add training page")
    public void verify_the_user_is_navigated_to_the_add_training_page() throws InterruptedException {
        System.out.println("User is navigated to add training page");
        BaseClass.winWait(1000);

    }

    @When("Select the project name {string}")
    public void select_the_project_name(String data1) throws InterruptedException {
        sendKeys(driver.findElement(By.xpath("//div[@id='«r12»'][text()='ABC']")), data1);
        BaseClass.winWait(1000);

    }

    @When("enter the employee name {string}")
    public void enter_the_employee_name(String data2) throws InterruptedException {
        sendKeys(driver.findElement(By.xpath("//input[@id='«r14»'][@name='employeeName']")), data2);
        BaseClass.winWait(1000);

    }

    @When("enter the course {string}")
    public void enter_the_course(String data3) throws InterruptedException {
        sendKeys(driver.findElement(By.xpath("//input[@name='course'][@id='«r15»']")), data3);
        BaseClass.winWait(1000);

    }

    @When("enter the trainer name {string}")
    public void enter_the_trainer_name(String data4) throws InterruptedException {
        sendKeys(driver.findElement(By.xpath("//input[@name='trainerName'][@id='«r16»']")), data4);
        BaseClass.winWait(1000);

    }

    @When("select the training type {string}")
    public void select_the_training_type(String data5) throws InterruptedException {
        sendKeys(driver.findElement(By.xpath("//div[text()='Udemy'][@id='«r17»']")), data5);
        BaseClass.winWait(1000);

    }

    @When("enter the start date {string}")
    public void enter_the_start_date(String data6) throws InterruptedException {
        sendKeys(driver.findElement(By.xpath(" //input[@name='startDate'][@id='«r19»']")), data6);
        BaseClass.winWait(1000);

    }

    @When("enter the end date {string}")
    public void enter_the_end_date(String data7) throws InterruptedException {
        sendKeys(driver.findElement(By.xpath("// input[@name='endDate'][@id='«r1a»']")), data7);
        BaseClass.winWait(1000);

    }

    @When("select the status {string}")
    public void select_the_status(String data8) throws InterruptedException {
        BaseClass.winWait(1000);
        sendKeys(driver.findElement(By.xpath("//div[@id='«r1b»'][text()='Completed']")), data8);
        pressEnter();
        BaseClass.winWait(1000);

    }

    @When("enter the percentage completed {string}")
    public void enter_the_percentage_completed(String data9) throws InterruptedException {
        sendKeys(driver.findElement(By.xpath("//input[@id='«r1d»'][@name='percentCompleted']")), data9);
        BaseClass.winWait(1000);

    }

    @When("click the add button")
    public void click_the_add_button() throws InterruptedException {
        explicitWaitClick("//button[@type='button'][text()='Add']");
        BaseClass.winWait(1000);

    }

    @Then("verify if the page is navigated to details page")
    public void verify_if_the_page_is_navigated_to_details_page() {
        System.out.println("Navigated to details page");

    }

}
