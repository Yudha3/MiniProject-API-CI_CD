package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Order;

public class OrderSteps {
    @Steps
    Order order;

    @Given("I set order endpoint")
    public void setOrderEndpoints() {
        order.setApiOrderEndpoint();
    }

    @When("I add the new order")
    public void sendPostHttpRequest() {
        order.sendPostOrderHttpRequest();
    }

    @Then("the response status codes should be 200's")
    public void receiveValidHttp200() {
        order.receiveValidHttp200();
    }

    @When("I add the new order1")
    public void sendPostHttpRequest1() {
        order.sendPostOrderHttpRequest1();
    }

    @When("I send GET HTTP request order")
    public void sendGetHttpRequest() {
        order.sendGetHttpRequest();
    }

    @Given("I set GET order endpoint")
    public void setGetApiEndpoints() {
        order.setGetOrderApiEndpoint();
    }

    @When("I send GET HTTP request order1")
    public void sendGetHttpRequest1() {
        order.sendGetRatingHttpRequest();
    }
    @Given("I set GET order endpoint1")
    public void setGetApiEndpoints1() {
        order.setGetOrderApiEndpoint1();
    }

    @When("I send GET HTTP request order2")
    public void sendGetHttpRequest2() {
        order.sendGetRatingHttpRequest1();
    }
    @Then("the response status codes should be 404's")
    public void receiveValidHttp404() {
        order.receiveValidHttp404();
    }
}
