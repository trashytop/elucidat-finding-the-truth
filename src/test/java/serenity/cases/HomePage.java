package serenity.cases;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static Performable clickStartButton() {
        return Click.on(START_BUTTON);
    }

    // TODO: not a great selector, ideally would like the button to have a @data-qa attribute
    public static final Target START_BUTTON = Target.the("start button")
      .locatedBy("//i[@class='ti ti-chevron-right']");
}
