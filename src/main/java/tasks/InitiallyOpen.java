package tasks;

import models.DataModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import userinterfaces.InitialPage;

import java.util.List;

import static userinterfaces.InitialPage.*;


public class InitiallyOpen implements Task {
    private static String user, password;
    InitialPage initialPage;

    public static Performable thePage(List<DataModel> data) {
        user = data.get(0).getUser();
        password = data.get(0).getPassword();
        return Tasks.instrumented(InitiallyOpen.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(this.initialPage),
                Enter.theValue(user).into(USERNAME),
                Enter.theValue(password).into(PASSWORD),
                Click.on(LOGIN_BUTTON)
        );
    }
}