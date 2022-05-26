package serenity.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import serenity.navigation.NavigateTo;
import serenity.cases.ChooseACase;
import serenity.cases.HomePage;

public class CaseSelectionStepDefinitions {

    @Given("{actor} is finding the truth")
    public void findingTheTruth(Actor actor) {
        actor.wasAbleTo(NavigateTo.theFindingTheTruthHomePage());
        actor.attemptsTo(HomePage.clickStartButton());
    }

    // TODO: parameterise these next two methods by case name
    @When("{actor} chooses the who is to blame? case")
    public void heChoosesTheWhoIsToBlameCase(Actor actor) throws InterruptedException {
        actor.attemptsTo(
          ChooseACase.whoIsToBlame()
        );
    }

    @When("{actor} chooses the making a case against Kevin case")
    public void heChoosesTheMakingACaseAgainstKevinCase(Actor actor) throws InterruptedException {
        actor.attemptsTo(
          ChooseACase.makingACaseAgainstKevin()
        );
    }

    @Then("{actor} should see a description containing {string}")
    public void heShouldSeeADescriptionContaining(Actor actor, String description) {
        actor.attemptsTo(
          Ensure.that(ChooseACase.WHO_IS_TO_BLAME_CASE_DESCRIPTION).hasText(description)
        );
    }

}
