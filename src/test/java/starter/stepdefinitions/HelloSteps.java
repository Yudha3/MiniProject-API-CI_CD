package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Hello;

public class HelloSteps {
    @Steps
    Hello hello;

    @Given("I set GET hello endpoint")
    public void setGetApiProductEndpoints() {
        hello.setApiHelloEndpoint();
    }

    @When("I send GET HTTP request hello")
    public void sendGetHttpRequest() {
        hello.sendGetHttpRequest();
    }

    @Then("the response status code should be 200's")
    public void receiveValidHttp200() {
        hello.receiveValidHttp200();
    }
}
