package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.ReportPage;

public class Caption implements Question<Boolean> {
    private String caption;

    public Caption(String caption) {
        this.caption = caption;
    }

    public static Caption isAvailable(String message) {
        return new Caption(message);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Text.of(ReportPage.CLOSE_LABEL).viewedBy(actor).asString().equals(caption);
    }
}
