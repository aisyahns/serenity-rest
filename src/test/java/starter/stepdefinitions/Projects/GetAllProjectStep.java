package starter.stepdefinitions.Projects;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Projects.GetAllProject;

public class GetAllProjectStep {

    @Steps
    GetAllProject getAllProject; //untuk pembuatan obyek yang method2nya akan digunakan di class step ini

    @Given("I set url and invalid token to get all project")
    public void iSetUrlAndInvalidTokenToGetAllProject() {
        getAllProject.setUrlAndInvalidToken();
    }

    @When("I request get all project")
    public void iRequestGetAllProject() {
        getAllProject.requestGetAllProject();
    }

    @Then("I will get 401")
    public void iWillGet401() {
        getAllProject.validateStatusCode();
    }

    @And("get Forbidden message")
    public void getForbiddenMessage() {
        getAllProject.validateForbiddenMessage();
    }

    @Given("I set url and valid token to get all project")
    public void iSetUrlAndValidTokenToGetAllProject() {
        getAllProject.setUrlAndValidToken();
    }

    @Then("I will get 200")
    public void iWillGet200() {
        getAllProject.validateStatus200();
    }

    @And("get list of all my projects")
    public void getListOfAllMyProjects() {
        getAllProject.validateListProject();
    }
}
