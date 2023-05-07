package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Categories;

public class CategoriesSteps {
    @Steps
    Categories categories;

    @Given("I set categories endpoint")
    public void setPostCategoriesEndpoints() {
        categories.setApiCategoriesEndpoint();
    }

    @When("I add the new categories")
    public void sendPostCategoriesHttpRequest() {
        categories.sendPostCategoriesHttpRequest();
    }

    @Then("the responses status codes should be 200")
    public void receiveValidHttp200() {
        categories.receiveValidHttp200();
    }

    @When("I add the new categories1")
    public void sendPostCategoriesHttpRequest1() {
        categories.sendPostCategoriesHttpRequest1();
    }

    @When("I add the new categories2")
    public void sendPostCategoriesHttpRequest2() {
        categories.sendPostCategoriesHttpRequest2();
    }
    @Then("the responses status codes should be 400")
    public void receiveValidHttp400() {
        categories.receiveValidHttp400();
    }

    @When("I add the new categories3")
    public void sendPostCategoriesHttpRequest3() {
        categories.sendPostCategoriesHttpRequest3();
    }
    @Then("the responses status codes should be 500")
    public void receiveValidHttp500() {
        categories.receiveValidHttp500();
    }

    @Given("I set GET categories product endpoint")
    public void setGetCategoriesApiEndpoints() {
        categories.setGetCategoriesApiEndpoint();
    }

    @When("I send GET HTTP request categories")
    public void sendGetCategoriesHttpRequest() {
        categories.sendGetCategoriesHttpRequest();
    }

    @Given("I set GET categories product endpoint1")
    public void setGetCategoriesApiEndpoints1() {
        categories.setGetCategoriesApiEndpoint1();
    }

    @When("I send GET HTTP request categories1")
    public void sendGetCategoriesHttpRequest1() {
        categories.sendGetCategoriesHttpRequest1();
    }
    @Then("the responses status codes should be 404")
    public void receiveValidHttp404() {
        categories.receiveValidHttp404();
    }

    @When("I send GET HTTP request categories2")
    public void sendGetCategoriesHttpRequest2() {
        categories.sendGetCategoriesHttpRequest2();
    }

    @Given("User requests to delete a categories")
    public void setDeleteApiEndpoints() {
        categories.setDeleteApiEndpoint();
    }

    @When("I send DELETE HTTP request categories")
    public void sendDeleteHttpRequest() {
        categories.sendDeleteHttpRequest();
    }

    @Given("User requests to delete a categories1")
    public void setDeleteApiEndpoints1() {
        categories.setDeleteApiEndpoint1();
    }

    @When("I send DELETE HTTP request categories1")
    public void sendDeleteHttpRequest1() {
        categories.sendDeleteHttpRequest1();
    }
}
