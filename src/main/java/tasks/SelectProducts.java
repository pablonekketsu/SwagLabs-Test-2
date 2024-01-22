package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.ProductPage.*;

public class SelectProducts implements Task {
    public static Performable viewCar() {
        return Tasks.instrumented(SelectProducts.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            WaitUntil.the(PRODUCT_1, isVisible()).forNoMoreThan(10).seconds(),
            Scroll.to(PRODUCT_1),
            Click.on(PRODUCT_1),
            Click.on(PRODUCT_2),
            Scroll.to(SHOPPING_CAR),
            Click.on(SHOPPING_CAR),
            Click.on(CHECKOUT)

    );
    }
}
