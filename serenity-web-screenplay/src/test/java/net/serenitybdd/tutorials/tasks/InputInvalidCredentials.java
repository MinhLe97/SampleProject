package net.serenitybdd.tutorials.tasks;

import org.openqa.selenium.Keys;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.tutorials.ui.LoginScreen;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class InputInvalidCredentials implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("minh").into(LoginScreen.USERNAME));
        actor.attemptsTo(Enter.theValue("minh").into(LoginScreen.PASSWORD).thenHit(Keys.RETURN));
    }

    public static InputInvalidCredentials login() {
        return instrumented(InputInvalidCredentials.class);  
    }
}
