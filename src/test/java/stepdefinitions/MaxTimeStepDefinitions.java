package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Credentials;
import model.WorkingDay;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Caption;
import tasks.Login;
import tasks.OpenUp;
import tasks.Report;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class MaxTimeStepDefinitions {
    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }
    @Given("that Camilo is in the Maxtime page")
    public void thatCamiloIsInTheMaxtimePage() {
        theActorCalled("Camilo").wasAbleTo(OpenUp.theMaxtimePage());
    }
    @When("he login in the page")
    public void heLoginInThePage(List<Credentials> credentials) {
        theActorInTheSpotlight().attemptsTo(Login.inThePageWith(credentials.get(0).getUser(), credentials.get(0).getPass()));
    }
    @And("select the day, fill the form with the information of his working day")
    public void selectTheDayFillTheFormWithTheInformationOfHisWorkingDay(List<WorkingDay> workingDays) {
        theActorInTheSpotlight().attemptsTo(Report.dayWith(workingDays));
    }
    @Then("the day close with message (.*)")
    public void theDayCloseWithMessageAtencion(String caption) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Caption.isAvailable(caption)));
    }
}
