package co.com.test2.stepdefinitions;

import co.com.test2.task.EnterData;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static co.com.test2.utils.ConstantString.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class Test2StepDefinitions {

    @Before
    public void initialConfig() {
        setTheStage(new OnlineCast());
    }

    @Given("{string} want enter the data in the form")
    public void wantEnterTheDataInTheForm(String customer) {
       theActor(customer).wasAbleTo(new OpenUrl(URL));
    }

    @When("enter the requested information")
    public void enterTheRequestedInformation(List<Map<String,String>> data) {
        theActorInTheSpotlight().attemptsTo(EnterData.with(data.get(0)));
    }

    @Then("should see the message {string}")
    public void shouldSeeTheMessage(String message) {

    }

}
