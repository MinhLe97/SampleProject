package net.serenitybdd.tutorials.features.search;

import org.junit.runner.RunWith;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.tutorials.tasks.AddATodoItem;
import net.serenitybdd.tutorials.tasks.StartWith;
import net.serenitybdd.tutorials.tasks.TheTodoItems;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.hasItem;

@RunWith(SerenityRunner.class)
public class AddItemStory {
    Actor justin = Actor.named("Justin");

    @Managed
    public WebDriver hisBrowser;                        

    @Before
    public void justinCanBrowseTheWeb() {
        justin.can(BrowseTheWeb.with(hisBrowser));      
    }

    @Test
    public void should_be_able_to_add_an_item_to_the_todo_list() {
        givenThat(justin).wasAbleTo(StartWith.anEmptyTodoList());
        when(justin).attemptsTo(AddATodoItem.called("Feed the cat"));
        then(justin).should(seeThat(TheTodoItems.displayed(), hasItem("Feed the cat")));
    }
}
