
package pages;

import org.openqa.selenium.By;

public class loginOR {
    public static final By EMAIL_INPUT = By.name("email");
    public static final By PASSWORD_INPUT = By.name("password");
    public static final By LOGIN_BUTTON = By.xpath("(//*[contains(text(),'Log in')])[4]");
}
