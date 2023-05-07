package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Products;

public class ProductsSteps {

    @Steps
    Products products;

    @Given("I set products endpoint")
    public void setGetApiProductEndpoints() {
        products.setApiProductEndpoint();
    }

    @When("I send GET HTTP request1")
    public void sendGetHttpRequest() {
        products.sendGetHttpRequest();
    }

    @Then("the responses status code should be 200")
    public void receiveValidHttp200() {
        products.receiveValidHttp200();
    }

    @When("I send POST HTTP request")
    public void sendPostHttpRequest() {
        products.sendPostHttpRequest();
    }

    @When("I send POST HTTP request1")
    public void sendPostHttpRequest1() {
        products.sendPostHttpRequest1();
    }

    @When("I send POST HTTP request2")
    public void sendPostHttpRequest2() {
        products.sendPostHttpRequest2();
    }

    @When("I send POST HTTP request3")
    public void sendPostHttpRequest3() {
        products.sendPostHttpRequest3();
    }

    @Then("the responses status code should be 400")
    public void receiveValidHttp400() {
        products.receiveValidHttp400();
    }
//
    @Given("I set GET product endpoint with id 12887")
    public void setGetApiEndpoints() {
        products.setGetApiEndpoint1();
    }

    @When("I send GET HTTP request product")
    public void sendGetHttpRequest1() {
        products.sendGetHttpRequest1();
    }
//
    @Given("I set GET product endpoint with id 1")
    public void setGetApiEndpoints2() {
        products.setGetApiEndpoint2();
    }

    @When("I send GET HTTP request product1")
    public void sendGetHttpRequest2() {
        products.sendGetHttpRequest2();
    }

    @Then("the responses status code should be 404")
    public void receiveValidHttp404() {
        products.receiveValidHttp404();
    }
//
    @Given("User requests to delete a product with id 11994")
    public void setGetApiEndpoints3() {
        products.setGetApiEndpoint3();
    }

    @When("I send DELETE HTTP request product")
    public void sendGetHttpRequest3() {
        products.sendGetHttpRequest3();
    }

    @Given("User requests to delete a product with id 1")
    public void setGetApiEndpoints4() {
        products.setGetApiEndpoint4();
    }

    @When("I send DELETE HTTP request product1")
    public void sendGetHttpRequest4() {
        products.sendGetHttpRequest4();
    }

    @Given("I set rating products endpoint")
    public void setRatingApiEndpoints() {
        products.setApiProductRatingEndpoint();
    }

    @When("I add the new rating")
    public void addNewRating() {
        products.sendPostRatingHttpRequest();
    }

    @Given("I set rating products endpoint1")
    public void setRatingApiEndpoints1() {
        products.setApiProductRatingEndpoint1();
    }

    @When("I add the new rating1")
    public void addNewRating1() {
        products.sendPostRatingHttpRequest1();
    }

    @Given("I set GET rating product endpoint with id 11289")
    public void setGetRatingApiEndpoints() {
        products.setGetRatingApiEndpoint();
    }

    @When("I send GET HTTP request product2")
    public void sendGetRatingHttpRequest() {
        products.sendGetRatingHttpRequest();
    }

    @Given("I set GET rating product endpoint with id 2")
    public void setGetRatingApiEndpoints1() {
        products.setGetRatingApiEndpoint1();
    }

    @When("I send GET HTTP request product3")
    public void sendGetRatingHttpRequest1() {
        products.sendGetRatingHttpRequest1();
    }

    @Given("I set comment products endpoint")
    public void setGetApiCommentEndpoints() {
        products.setApiCommentEndpoint();
    }

    @When("I add the new comment")
    public void sendPostCommentHttpRequest() {
        products.sendPostCommentHttpRequest();
    }

    @Given("I set comment products endpoint1")
    public void setGetApiCommentEndpoints1() {
        products.setApiCommentEndpoint1();
    }

    @When("I add the new comment1")
    public void sendPostCommentHttpRequest1() {
        products.sendPostCommentHttpRequest1();
    }

    @Given("I set GET comment product endpoint")
    public void setGetCommentApiEndpoints() {
        products.setGetCommentApiEndpoint();
    }

    @When("I send GET HTTP request")
    public void sendGetCommentHttpRequest() {
        products.sendGetCommentHttpRequest();
    }

    @Given("I set GET comment product endpoint2")
    public void setGetCommentApiEndpoints2() {
        products.setGetCommentApiEndpoint2();
    }

    @When("I send GET HTTP request2")
    public void sendGetCommentHttpRequest2() {
        products.sendGetCommentHttpRequest2();
    }

}
