package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import common.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddTraining extends BaseClass {

    // public static WebDriver driver;

    @Given("launch the employee training url {string}")
    public void launch_the_employee_training_url(String url) throws InterruptedException {
        winWait(1000);
        driver.get(url);
        winWait(1000);
    }

    // @Given("launch the employee training url")
    // public void launch_the_employee_training_url() throws InterruptedException {
    // BaseClass.winWait(1000);

    // driver.get("http://10.192.190.130:3000/");
    // BaseClass.winWait(1000);

    // }

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
    public void select_the_project_name(String index) throws InterruptedException {
        WebElement projectName = driver.findElement(By.xpath("(//div[@tabindex='0'][@role='combobox'])[1]"));
        click(projectName);
        System.out.println("Project name clicked==========");
        int n = Integer.parseInt(index);
        winWait(1000);
        pressDown(n);
        winWait(1000);
        pressEnter();
        winWait(1000);

    }

    /*
     * @When("Select the project name")
     * public void select_the_project_name() throws InterruptedException {
     * WebElement projectName =
     * driver.findElement(By.xpath("(//div[@tabindex='0'][@role='combobox'])[1]"));
     * click(projectName);
     * System.out.println("Project name clicked");
     * int n = 5;
     * for (int i = 1; i <= n; i++) {
     * winWait(1000);
     * pressDown(i);
     * pressEnter();
     * winWait(1000);
     * 
     * }
     * // winWait(1000);
     * // pressDown(2);
     * // pressEnter();
     * // winWait(1000);
     * }
     */

    // @When("Select the project name {string}")
    // public void select_the_project_name(String data1) throws InterruptedException
    // {
    // sendKeys(driver.findElement(By.xpath("//div[@id='«r12»'][text()='ABC']")),
    // data1);
    // BaseClass.winWait(1000);

    // }

    @When("enter the employee name {string}")
    public void enter_the_employee_name(String data2) throws InterruptedException {
        // JavascriptExecutor js = (JavascriptExecutor) driver;
        // js.executeScript();
        sendKeys(driver.findElement(By.xpath("//input[@type='text'][@name='employeeName']")), data2);
        BaseClass.winWait(1000);

    }

    @When("enter the course {string}")
    public void enter_the_course(String data3) throws InterruptedException {
        sendKeys(driver.findElement(By.xpath("//input[@name='course']")), data3);
        BaseClass.winWait(1000);

    }

    @When("enter the trainer name {string}")
    public void enter_the_trainer_name(String data4) throws InterruptedException {
        sendKeys(driver.findElement(By.xpath("//input[@name='trainerName']")), data4);
        BaseClass.winWait(1000);

    }

    @When("select the training type {string}")
    public void select_the_training_type(String data5) throws InterruptedException {
        sendKeys(driver.findElement(By.xpath("//div[text()='Udemy']")), data5);
        BaseClass.winWait(1000);

    }

    @When("enter the start date {string}")
    public void enter_the_start_date(String data6) throws InterruptedException {
        sendKeys(driver.findElement(By.xpath(" //input[@name='startDate']")), data6);
        BaseClass.winWait(1000);

    }

    @When("enter the end date {string}")
    public void enter_the_end_date(String data7) throws InterruptedException {
        sendKeys(driver.findElement(By.xpath("// input[@name='endDate']")), data7);
        BaseClass.winWait(1000);

    }

    @When("select the status {string}")
    public void select_the_status(String data8) throws InterruptedException {
        BaseClass.winWait(1000);
        sendKeys(driver.findElement(By.xpath("//div[text()='Completed']")), data8);
        pressEnter();
        BaseClass.winWait(1000);

    }

    @When("enter the percentage completed {string}")
    public void enter_the_percentage_completed(String data9) throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//input[@name='percentCompleted']"));
        element.clear();
        BaseClass.winWait(500);
        sendKeys(element, data9);
        BaseClass.winWait(500);

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
