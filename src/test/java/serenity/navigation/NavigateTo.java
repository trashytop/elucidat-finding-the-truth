package serenity.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theFindingTheTruthHomePage() {
        return Task.where("{0} opens the Finding The Truth home page",
          Open.browserOn().the(FindingTheTruthHomePage.class));
    }
}
