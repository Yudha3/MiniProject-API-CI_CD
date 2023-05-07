package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Authentication;

public class AuthenticationSteps {

    @Steps
    Authentication authentication;

    @Given("I set register endpoint")
    public void setGetApiProductEndpoints() {
        authentication.setApiRegisterEndpoint();
    }

    @When("I add the new account")
    public void sendGetHttpRequest() {
        authentication.sendPostRegisterHttpRequest();
    }

    @Then("the response status code should be 200")
    public void receiveValidHttp200() {
        authentication.receiveValidHttp200();
    }

    @When("I add the new account1")
    public void sendGetHttpRequest1() {
        authentication.sendPostRegisterHttpRequest1();
    }

    @Then("the response status code should be 400")
    public void receiveValidHttp400() {
        authentication.receiveValidHttp400();
    }

    @Given("I set login endpoint")
    public void setLoginEndpoints() {
        authentication.setApiLoginEndpoint();
    }

    @When("I login the account")
    public void sendLoginHttpRequest() {
        authentication.sendPostLoginHttpRequest();
    }
    @When("I login the account1")
    public void sendLoginHttpRequest1() {
        authentication.sendPostLoginHttpRequest1();
    }

    @Given("I set GET user data endpoint")
    public void setGetApiEndpointsUser() {
        authentication.setGetApiEndpointUser();
    }

    @When("I send GET HTTP request user")
    public void sentGetHttpRequestUser() {
        authentication.sendGetHttpRequestUser();
    }
}
