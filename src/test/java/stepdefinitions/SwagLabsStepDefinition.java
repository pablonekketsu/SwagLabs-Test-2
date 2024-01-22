package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.DataModel;
import questions.VerifyMessage;
import tasks.InitiallyOpen;
import tasks.MakeCheckout;
import tasks.SelectProducts;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SwagLabsStepDefinition {
    @Given("^that (.*) wants login in the page, he introduce the user and the password$")
    public void thatTheUserWantsLoginInThePageHeIntroduceTheUserAndThePassword(String actor, List<DataModel> data) {
        theActorCalled(actor).wasAbleTo(InitiallyOpen.thePage(data));
    }

    @When("^the user is in the home page he add to car two products$")
    public void theUserIsInTheHomePageHeAddToCarTwoProducts() {
        theActorInTheSpotlight().attemptsTo(SelectProducts.viewCar());
    }

    @And("^make the checkout with the name, last_name and zip$")
    public void makeTheCheckoutWithTheNameLast_nameAndZip(List<DataModel> data) {
        theActorInTheSpotlight().attemptsTo(MakeCheckout.dataUser(data));
    }

    @Then("^Verify the text successful_process$")
    public void verifyTheTextSuccessful_process(List<DataModel> data) {
        theActorInTheSpotlight().should(seeThat(VerifyMessage.message(data.get(0).getSuccessful_process())));
    }


}
