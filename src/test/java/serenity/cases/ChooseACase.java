package serenity.cases;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class ChooseACase {
    public static Performable whoIsToBlame() {
        return Task.where("{0} chooses a case",
          Click.on(WHO_IS_TO_BLAME_CASE)
        );
    }

    public static Performable makingACaseAgainstKevin() {
        return Task.where("{0} chooses a case",
          Click.on(MAKING_A_CASE_AGAINST_KEVIN)
        );
    }

    // TODO: not great selectors, ideally would like the cases to have @data-qa attributes

    public static final Target WHO_IS_TO_BLAME_CASE = Target.the("who is to blame case")
      .locatedBy("//span[.='Who is to blame?']");

    public static final Target MAKING_A_CASE_AGAINST_KEVIN = Target.the("making a case against Kevin case")
      .locatedBy("//span[.='Making a case against Kevin']");

    public static final Target WHO_IS_TO_BLAME_CASE_DESCRIPTION =  Target.the("case description").locatedBy("//strong[normalize-space()='oung man has been in an accident']");

}
