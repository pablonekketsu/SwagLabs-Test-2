package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutPage {
    public static final Target NAME = Target.the("Enter the name").located(By.id("first-name"));
    public static final Target LAST_NAME = Target.the("Enter the lastname").located(By.id("last-name"));
    public static final Target ZIP = Target.the("Enter the zip").located(By.id("postal-code"));
    public static final Target CONTINUE_BUTTON = Target.the("Click on continue button").located(By.id("continue"));
    public static final Target FINISH_BUTTON = Target.the("Click on finish button").located(By.id("finish"));
    public static final Target TEXT_CONFIRMATION = Target.the("Confirmation text").located(By.className("complete-header"));
}
