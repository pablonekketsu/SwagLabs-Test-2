package tasks;

import models.DataModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static userinterfaces.CheckoutPage.*;

public class MakeCheckout implements Task {
    private static String name, lastName, zip;

    public static Performable dataUser(List<DataModel> data) {
        name = data.get(0).getName();
        lastName = data.get(0).getLast_name();
        zip = data.get(0).getZip();
        return Tasks.instrumented(MakeCheckout.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(name).into(NAME),
                Enter.theValue(lastName).into(LAST_NAME),
                Enter.theValue(zip).into(ZIP),
                Click.on(CONTINUE_BUTTON),
                Click.on(FINISH_BUTTON)
        );
    }
}
