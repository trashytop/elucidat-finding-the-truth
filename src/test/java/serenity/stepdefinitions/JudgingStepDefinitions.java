package serenity.stepdefinitions;

import io.cucumber.java.en.And;
import net.serenitybdd.screenplay.Actor;
import serenity.cases.Judge;


public class JudgingStepDefinitions {

    @And("{actor} judges")
    public void heJudges(Actor actor) {
        actor.attemptsTo(Judge.judgeThis());
    }
}
