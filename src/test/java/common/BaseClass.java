package common;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
    public static WebDriver driver;

    public static WebElement element;

    public void browserLaunch() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    public void closeBrowser() {
        driver.quit();
    }

    public static void sendKeys(WebElement element, String data) {
        element.sendKeys(data);
    }

    public static void click(WebElement element) {
        element.click();
    }

    public static void winWait(int a) throws InterruptedException {
        Thread.sleep(a);
    }

    public static void explicitWaitClick(String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath))).click();
    }

    public static void robotEnter() throws AWTException {
        Robot rb = new Robot();
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

    }

    public static void robotDown(int n) throws AWTException, InterruptedException {
        Robot rb = new Robot();
        for (int i = 0; i <= n; i++) {
            rb.keyPress(KeyEvent.VK_DOWN);
            rb.keyRelease(KeyEvent.VK_DOWN);
            Thread.sleep(2000);
        }

    }

    public static void selectOptions_Index(WebElement dropdown, int index) throws InterruptedException {

        Select sc = new Select(dropdown);
        List<WebElement> li = sc.getOptions();
        for (WebElement x : li) {
            x.getText();

        }
        Thread.sleep(2000);
        sc.selectByIndex(index);
        Thread.sleep(2000);

    }

    // public static void selectByIndex(WebElement dropdown, int index) {

    // Select sc = new Select(dropdown);
    // sc.selectByIndex(index);

    // }

}
