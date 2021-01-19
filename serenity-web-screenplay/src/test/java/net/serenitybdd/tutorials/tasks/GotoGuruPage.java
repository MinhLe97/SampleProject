package net.serenitybdd.tutorials.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.tutorials.ui.GuruHomePage;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GotoGuruPage implements Task {

    GuruHomePage guruHomePage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(guruHomePage));
    }

    public static GotoGuruPage guruPage() {
        return instrumented(GotoGuruPage.class);
    }
}
