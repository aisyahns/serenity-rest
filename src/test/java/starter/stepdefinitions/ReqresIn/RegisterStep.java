package starter.stepdefinitions.ReqresIn;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.ReqresIn.Register;

public class RegisterStep {
    @Steps
    Register register;

    @Given("I set a url api for register")
    public void iSetAUrlApiForRegister() {
        register.setUrlRegister();
    }

    @And("I set body valid email and valid password")
    public void iSetBodyValidEmailAndValidPassword() {
//        register.setBodyValidEmailValidPassword();
        register.setBodyInvalidEmailValidPassword();
//        register.bodyProduct();
    }

    @When("I request register")
    public void iRequestRegister() {
        register.requestRegister();
    }

    @And("I set body {string} email and {string}")
    public void iSetBodyEmailAnd(String arg0, String arg1) {
        // aku butuh method yang akan menerima value email dan value password
        // dari .feature
        // email + password akan ngebentuk body data yang mau dikirim
        register.setBodyData(arg0, arg1);
    }
}
