package net.serenitybdd.tutorials.features;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.serenitybdd.tutorials.tasks.GotoGuruPage;
import net.serenitybdd.tutorials.tasks.InputInvalidCredentials;
import net.thucydides.core.annotations.Managed;
import static org.hamcrest.Matchers.containsString;
import static net.serenitybdd.screenplay.EventualConsequence.eventually;

@RunWith(SerenityRunner.class)
public class LoginGuruTest {
    Actor minh = new Actor("Minh");

    @Managed
    public WebDriver myBrowser;                        

    @Before
    public void minhCanBrowseTheWeb() {
        minh.can(BrowseTheWeb.with(myBrowser));      
    }

    @Test
    public void login_with_guru_page() {
        givenThat(minh).wasAbleTo(GotoGuruPage.guruPage());
        then(minh).attemptsTo(InputInvalidCredentials.login());
        then(minh).should(eventually(seeThat(TheWebPage.title(), containsString("Guru"))));
    }
}
