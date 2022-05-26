package serenity.cases;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class Judge {
    public static Performable judgeThis() {
        return Task.where("{0} judges",
          Click.on(JUDGE_THIS_BUTTON)
        );
    }

    // TODO: not great selectors, ideally would like these elements to have @data-qa attributes

    public static final Target JUDGE_THIS_BUTTON = Target.the("judge this")
      .locatedBy("//span[.='JUDGE THIS']");
}
