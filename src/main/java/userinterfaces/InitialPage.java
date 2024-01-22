package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.saucedemo.com/")
public class InitialPage  extends PageObject {
    public static final Target USERNAME = Target.the("Insert the username").located(By.id("user-name"));
    public static final Target PASSWORD = Target.the("Insert the password").located(By.id("password"));
    public static final Target LOGIN_BUTTON = Target.the("login button").located(By.id("login-button"));
}