package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static userinterface.LoginPage.*;

public class Login implements Task {

    private String user;
    private String pass;

    public Login(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public static Login inThePageWith(String user, String pass) {
        return Tasks.instrumented(Login.class, user, pass);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(user).into(USER_INPUT),
                Enter.theValue(pass).into(PASS_INPUT),
                Click.on(ENTER_BUTTON));
    }
}
