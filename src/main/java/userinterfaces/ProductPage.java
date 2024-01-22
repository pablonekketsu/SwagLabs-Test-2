package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductPage {
    public static final Target PRODUCT_1 = Target.the("Select the first product").located(By.id("add-to-cart-sauce-labs-fleece-jacket"));
    public static final Target PRODUCT_2 = Target.the("Select the second product").located(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
    public static final Target SHOPPING_CAR = Target.the("Click on shopping car link").located(By.id("shopping_cart_container"));
    public static final Target CHECKOUT = Target.the("Click on checkout button").located(By.id("checkout"));
}
