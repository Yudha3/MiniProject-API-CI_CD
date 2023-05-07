package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Order {
    protected String url = "https://altashop-api.fly.dev/api/";

    @Step("I set order endpoint")
    public String setApiOrderEndpoint() {
        return url + "orders";
    }

    @Step("I add the new order")
    public void sendPostOrderHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("product_id", 12888);
        requestBody.put("quantity", 1);

        SerenityRest.given().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkFsaWZmcmlhbnRvIFl1ZGhhIFByYWtvc28iLCJFbWFpbCI6ImFsaWZmcmlhbnRvMkBnbWFpbC5jb20ifQ.QmVSMTWxHY-69JYVwmIrGOgv6HiDbzbiuO_OtgLDzzQ")
                .get(setApiOrderEndpoint())
                .then()
                .statusCode(200);
    }

    @Step("the response status codes should be 200's")
    public void receiveValidHttp200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I add the new order1")
    public void sendPostOrderHttpRequest1() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("product_id", 1);
        requestBody.put("quantity", 1);

        SerenityRest.given().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkFsaWZmcmlhbnRvIFl1ZGhhIFByYWtvc28iLCJFbWFpbCI6ImFsaWZmcmlhbnRvMkBnbWFpbC5jb20ifQ.QmVSMTWxHY-69JYVwmIrGOgv6HiDbzbiuO_OtgLDzzQ")
                .get(setApiOrderEndpoint())
                .then()
                .statusCode(200);
    }

    @Step("I send GET HTTP request order")
    public void sendGetHttpRequest() {
        SerenityRest.given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkFsaWZmcmlhbnRvIFl1ZGhhIFByYWtvc28iLCJFbWFpbCI6ImFsaWZmcmlhbnRvMkBnbWFpbC5jb20ifQ.QmVSMTWxHY-69JYVwmIrGOgv6HiDbzbiuO_OtgLDzzQ")
                .get(setApiOrderEndpoint())
                .then()
                .statusCode(200);

    }

    @Step("I set GET order endpoint")
    public String setGetOrderApiEndpoint() {
        return url + "orders/10842";
    }

    @Step("I send GET HTTP request order1")
    public void sendGetRatingHttpRequest() {
        SerenityRest.given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkFsaWZmcmlhbnRvIFl1ZGhhIFByYWtvc28iLCJFbWFpbCI6ImFsaWZmcmlhbnRvMkBnbWFpbC5jb20ifQ.QmVSMTWxHY-69JYVwmIrGOgv6HiDbzbiuO_OtgLDzzQ")
                .get(setGetOrderApiEndpoint())
                .then()
                .statusCode(200);

    }

    @Step("I set GET order endpoint1")
    public String setGetOrderApiEndpoint1() {
        return url + "orders/7";
    }

    @Step("I send GET HTTP request order2")
    public void sendGetRatingHttpRequest1() {
        SerenityRest.given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkFsaWZmcmlhbnRvIFl1ZGhhIFByYWtvc28iLCJFbWFpbCI6ImFsaWZmcmlhbnRvMkBnbWFpbC5jb20ifQ.QmVSMTWxHY-69JYVwmIrGOgv6HiDbzbiuO_OtgLDzzQ")
                .get(setGetOrderApiEndpoint1())
                .then()
                .statusCode(404);
    }
    @Step("the response status codes should be 404's")
    public void receiveValidHttp404() {
        restAssuredThat(response -> response.statusCode(404));
    }
}
