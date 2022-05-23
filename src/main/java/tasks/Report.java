package tasks;

import model.WorkingDay;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static userinterface.ReportPage.*;

public class Report implements Task {

    public List<WorkingDay> workingDays;

    public Report(List<WorkingDay> workingDays) {
        this.workingDays = workingDays;
    }

    public static Report dayWith(List<WorkingDay> workingDays) {
        return Tasks.instrumented(Report.class, workingDays);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DATE_TABLE),
                Click.on(DATE_TABLE),
                Click.on(DATE_TABLE),
                Click.on(NEW_REPORT),
                Click.on(PROJECT_BUTTON),
                Enter.theValue(workingDays.get(0).getProyecto()).into(PROJECT_INPUT),
                Click.on(PROJECT_SEARCH),
                Click.on(PROJECT_CLICK),
                WaitUntil.the(HOUR_SELECT, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(HOUR_SELECT),
                Click.on(HOUR_CLICK),
                Click.on(SERVICE_BUTTON),
                Enter.theValue(workingDays.get(0).getServicio()).into(SERVICE_INPUT),
                Click.on(SERVICE_SEARCH),
                Click.on(SERVICE_CLICK),
                Enter.theValue(workingDays.get(0).getActividad()).into(ACTIVITY_INPUT),
                Click.on(ACTIVITY_CLICK),
                Enter.theValue(workingDays.get(0).getHoras()).into(TIME_EXECUTED_INPUT),
                Enter.theValue(workingDays.get(0).getComentario()).into(COMMENTARY_INPUT),
                Click.on(SAVE_CLOSE_BUTTON),
                Click.on(CLOSE_DAY_BUTTON));
    }
}
