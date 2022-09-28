package starter.stepdefinitions.Projects;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Projects.GetAProject;

public class GetAProjectStep {

    @Steps
    GetAProject getAProject;
    @Given("I set url and valid token to get a project")
    public void iSetUrlAndValidTokenToGetAProject() {
        getAProject.setUrlAndValidToken();
    }

    @And("I get ID project")
    public void iGetIDProject() {
        getAProject.getIdProject();
    }

    @When("I request get detail project")
    public void iRequestGetDetailProject() {
        getAProject.requestGetDetail();
    }

    @Then("I get status code {int}")
    public void iGetStatusCode(int arg0) {
        getAProject.validateResponseId();
    }
}
