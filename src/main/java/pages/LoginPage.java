package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {
WebDriver driver;

public LoginPage(WebDriver driver) {
        this.driver = driver;
}
public void openLoginPage(String url) {
    driver.get(url);
}

public void enterUsername(String username){
    driver.findElement(By.name("email")).sendKeys(username);
}

public void enterPassword(String password){
    driver.findElement(By.name("password")).sendKeys(password);
}

public void loginClick(){
    driver.findElement(By.xpath("//button[text()='Login']")).click();
}

public void verifyLoggedInUser(String expectedUsername){
    WebElement userNameElement = driver.findElement(By.xpath("//b[text()='testuser1']"));
    String actualUserName = userNameElement.getText();
    Assert.assertEquals(expectedUsername, actualUserName);
}
public void logOut(){
    driver.findElement(By.xpath("//a[@href='/logout']")).click();
}
}


