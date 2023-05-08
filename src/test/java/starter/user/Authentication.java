package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Authentication {

    protected String url = "https://altashop-api.fly.dev/api/";

    @Step("I set register endpoint")
    public String setApiRegisterEndpoint() {
        return url + "auth/register";
    }

    @Step("I add the new account")
    public void sendPostRegisterHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "hasan00@gmail.com");
        requestBody.put("password", "123123");
        requestBody.put("fullname", "Hasan Sentosa");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setApiRegisterEndpoint());
    }

    @Step("the response status code should be 200")
    public void receiveValidHttp200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I add the new account1")
    public void sendPostRegisterHttpRequest1() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "");
        requestBody.put("password", "123123");
        requestBody.put("fullname", "Hasan Sentosa");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setApiRegisterEndpoint());
    }

    @Step("the response status code should be 400")
    public void receiveValidHttp400() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("I set login endpoint")
    public String setApiLoginEndpoint() {
        return url + "auth/login";
    }

    @Step("I login the account")
    public void sendPostLoginHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "hasan2@gmail.com");
        requestBody.put("password", "123123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setApiLoginEndpoint());
    }

    @Step("I login the account1")
    public void sendPostLoginHttpRequest1() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "hasan5@gmail.com");
        requestBody.put("password", "123123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setApiLoginEndpoint());
    }

    @Step("I set GET user data endpoint")
    public String setGetApiEndpointUser() {
        return url + "auth/info";
    }

    @Step("I send GET HTTP request user")
    public void sendGetHttpRequestUser() {
        SerenityRest.given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkFsaWZmcmlhbnRvIFl1ZGhhIFByYWtvc28iLCJFbWFpbCI6ImFsaWZmcmlhbnRvMkBnbWFpbC5jb20ifQ.QmVSMTWxHY-69JYVwmIrGOgv6HiDbzbiuO_OtgLDzzQ")
                .get(setGetApiEndpointUser())
                .then()
                .statusCode(200);

    }
}
