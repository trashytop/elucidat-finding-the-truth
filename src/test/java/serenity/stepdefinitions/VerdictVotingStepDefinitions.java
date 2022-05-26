package serenity.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import serenity.cases.Vote;

public class VerdictVotingStepDefinitions {

    private String verdict;

    @When("{actor} votes {string}")
    public void heVotes(Actor actor, String verdict) {
        this.verdict = verdict;
        if (verdict.equalsIgnoreCase("guilty")) {
            actor.attemptsTo(Vote.voteGuilty());
        } else {
            actor.attemptsTo(Vote.voteNotGuilty());
        }
    }

    @Then("{actor} verdict should be confirmed")
    public void hisVerdictShouldBeConfirmed(Actor actor) {
        if (verdict.equalsIgnoreCase("guilty")) {
            actor.attemptsTo(
              Ensure.that(Vote.GUILTY_VERDICT).text().containsIgnoringCase(verdict)
            );
        } else {
            actor.attemptsTo(
              Ensure.that(Vote.NOT_GUILTY_VERDICT).text().containsIgnoringCase(verdict)
            );
        }
    }
}
