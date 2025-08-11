package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import common.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SampleWebsite extends BaseClass {

    @Given("Launch the url {string}")
    public void launch_the_url(String url) throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(500);
        driver.get(url);
        Thread.sleep(500);

    }

    @When("Enter the name {string}")
    public void enter_the_name(String name1) throws InterruptedException {
        WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
        name.sendKeys(name1);
        Thread.sleep(500);

    }

    @When("Enter the email {string}")
    public void enter_the_email(String email1) throws InterruptedException {
        WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
        email.sendKeys(email1);
        Thread.sleep(500);

    }

    @When("Enter the password {string}")
    public void enter_the_password(String password1) throws InterruptedException {
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys(password1);
        Thread.sleep(500);

    }

    @Then("click the Register button")
    public void click_the_register_button() throws InterruptedException {
        WebElement register = driver.findElement(By.xpath("//button[@type='submit'][text()='Register']"));
        register.click();
        Thread.sleep(500);
        System.out.println("Register button cliked");

    }

    @Then("click the forgot passord link")
    public void click_the_forgot_passord_link() throws InterruptedException {
        WebElement forgotPass = driver.findElement(By.xpath("//a[text()='Forgot Password?']"));
        forgotPass.click();
        Thread.sleep(500);
        System.out.println("Forgot password link clicked.");

    }

}
