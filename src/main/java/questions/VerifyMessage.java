package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.CheckoutPage.TEXT_CONFIRMATION;

public class VerifyMessage implements Question<Boolean> {
    static String message;

    public static Question<Boolean> message(String successfulProcess) {
        message = successfulProcess;
        return new VerifyMessage();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        System.out.println(message);
        System.out.println(TEXT_CONFIRMATION.resolveFor(actor).getText());
        return message.equals(TEXT_CONFIRMATION.resolveFor(actor).getText());
    }

    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }
}
