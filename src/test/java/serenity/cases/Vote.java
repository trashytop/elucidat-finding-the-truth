package serenity.cases;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class Vote {

    public static Performable voteGuilty() {
        return Task.where("{0} votes guilty",
          Click.on(SELECT_GUILTY),
          Click.on(VOTE_BUTTON)
        );
    }

    public static Performable voteNotGuilty() {
        return Task.where("{0} votes not guilty",
          Click.on(SELECT_NOT_GUILTY),
          Click.on(VOTE_BUTTON)
        );
    }

    // TODO: not great selectors, ideally would like these elements to have @data-qa attributes

    public static final Target SELECT_GUILTY = Target.the("select guilty")
      .locatedBy("//span[@id='pa_5c9126fe47260_p15515116385-itemInner-1']");

    public static final Target SELECT_NOT_GUILTY = Target.the("select not guilty")
      .locatedBy("//span[@id='pa_5c9126fe47260_p15515116385-itemInner-2']");

    public static final Target VOTE_BUTTON = Target.the("vote")
      .locatedBy("//span[.='VOTE']");

    public static final Target GUILTY_VERDICT =  Target.the("guilty verdict").locatedBy("//strong[normalize-space()='GUILTY!']");

    public static final Target NOT_GUILTY_VERDICT =  Target.the("not guilty verdict").locatedBy("//strong[normalize-space()='NOT GUILTY!']");
}
