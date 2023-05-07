package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Categories {
    protected String url = "https://altashop-api.fly.dev/api/";

    @Step("I set categories endpoint")
    public String setApiCategoriesEndpoint() {
        return url + "categories";
    }

    @Step("I add the new categories")
    public void sendPostCategoriesHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "gaming");
        requestBody.put("description", "for gaming purposes");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setApiCategoriesEndpoint());
    }

    @Step("the responses status codes should be 200")
    public void receiveValidHttp200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I add the new categories1")
    public void sendPostCategoriesHttpRequest1() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "!@#$%");
        requestBody.put("description", "for gaming purposes");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setApiCategoriesEndpoint());
    }

    @Step("I add the new categories2")
    public void sendPostCategoriesHttpRequest2() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", 12345);
        requestBody.put("description", "for gaming purposes");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setApiCategoriesEndpoint());
    }
    @Step("the responses status codes should be 400")
    public void receiveValidHttp400() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("I add the new categories3")
    public void sendPostCategoriesHttpRequest3() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "");
        requestBody.put("description", "for gaming purposes");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setApiCategoriesEndpoint());
    }
    @Step("the responses status codes should be 500")
    public void receiveValidHttp500() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step("I set GET categories product endpoint")
    public String setGetCategoriesApiEndpoint() {
        return url + "categories/12505";
    }

    @Step("I send GET HTTP request categories")
    public void sendGetCategoriesHttpRequest() {
        SerenityRest.given().get(setGetCategoriesApiEndpoint());
    }

    @Step("I set GET categories product endpoint1")
    public String setGetCategoriesApiEndpoint1() {
        return url + "categories/1";
    }

    @Step("I send GET HTTP request categories1")
    public void sendGetCategoriesHttpRequest1() {
        SerenityRest.given().get(setGetCategoriesApiEndpoint1());
    }

    @Step("the responses status codes should be 404")
    public void receiveValidHttp404() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I send GET HTTP request categories2")
    public void sendGetCategoriesHttpRequest2() {
        SerenityRest.given().get(setApiCategoriesEndpoint());
    }

    @Step("User requests to delete a categories")
    public String setDeleteApiEndpoint() {
        return url + "categories/12502";
    }

    @Step("I send DELETE HTTP request categories")
    public void sendDeleteHttpRequest() {
        SerenityRest.given().delete(setDeleteApiEndpoint());
    }

    @Step("User requests to delete a categories1")
    public String setDeleteApiEndpoint1() {
        return url + "categories/1";
    }

    @Step("I send DELETE HTTP request categories1")
    public void sendDeleteHttpRequest1() {
        SerenityRest.given().delete(setDeleteApiEndpoint1());
    }
}
