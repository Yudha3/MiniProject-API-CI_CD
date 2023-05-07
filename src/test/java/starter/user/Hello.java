package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Hello {
    protected String url = "https://altashop-api.fly.dev/api/";

    @Step("I set GET hello endpoint")
    public String setApiHelloEndpoint() {
        return url + "hello";
    }

    @Step("I send GET HTTP request hello")
    public void sendGetHttpRequest() {
        SerenityRest.given().get(setApiHelloEndpoint());
    }

    @Step("the response status code should be 200's")
    public void receiveValidHttp200() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
