package starter.stepdefinitions.ReqresIn;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.ReqresIn.ListUser;

public class ListUserStep {

    @Steps
    ListUser listUser;

    @Given("I set a url api for list users")
    public void iSetAUrlApiForListUsers() {
        listUser.setUrlApiListUser();
    }

    @When("I request list user with page 2")
    public void iRequestListUserWithPage2() {
        listUser.requestListUser();
    }

    @Then("I will get status code is 200")
    public void iWillGetStatusCodeIs200() {
        listUser.verifyStatusCode200();
    }

    @And("I will get the detail of user")
    public void iWillGetTheDetailOfUser() {
        listUser.verifyDetailPage();
    }
}
