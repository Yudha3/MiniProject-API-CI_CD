package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Products {
    protected String url = "https://altashop-api.fly.dev/api/";

    @Step("I set products endpoint")
    public String setApiProductEndpoint() {
        return url + "products";
    }

    @Step("I send GET HTTP request1")
    public void sendGetHttpRequest() {
        SerenityRest.given().get(setApiProductEndpoint());
    }

    @Step("the responses status code should be 200")
    public void receiveValidHttp200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST api endpoints")
    public void sendPostHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Sony PS1");
        requestBody.put("description", "play has no limits");
        requestBody.put("price", 499);
        JSONArray categoriesArray = new JSONArray();
        categoriesArray.add(12541);
        requestBody.put("categories", categoriesArray);

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setApiProductEndpoint());
    }

    @Step("I set POST api endpoints1")
    public void sendPostHttpRequest1() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Sony PS1");
        JSONArray categoriesArray = new JSONArray();
        categoriesArray.add(12541);
        requestBody.put("categories", categoriesArray);

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setApiProductEndpoint());
    }

    @Step("I set POST api endpoints2")
    public void sendPostHttpRequest2() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Sony PS1");
        requestBody.put("description", "play has no limits");
        requestBody.put("price", "499ooo");
        JSONArray categoriesArray = new JSONArray();
        categoriesArray.add(12541);
        requestBody.put("categories", categoriesArray);

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setApiProductEndpoint());
    }

    @Step("I set POST api endpoints3")
    public void sendPostHttpRequest3() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Sony PS1");
        requestBody.put("description", "play has no limits");
        requestBody.put("price", 499.000);
        JSONArray categoriesArray = new JSONArray();
        categoriesArray.add(12541);
        requestBody.put("categories", categoriesArray);

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setApiProductEndpoint());
    }

    @Step("the responses status code should be 400")
    public void receiveValidHttp400() {
        restAssuredThat(response -> response.statusCode(400));
    }
//
    @Step("I set GET product endpoint with id 12887")
    public String setGetApiEndpoint1() {
        return url + "products/13364";
    }

    @Step("I send GET HTTP request product")
    public void sendGetHttpRequest1() {
        SerenityRest.given().get(setGetApiEndpoint1());
    }
//
    @Step("I set GET product endpoint with id 1")
    public String setGetApiEndpoint2() {
        return url + "products/1";
    }

    @Step("I send GET HTTP request product")
    public void sendGetHttpRequest2() {
        SerenityRest.given().get(setGetApiEndpoint2());
    }

    @Step("the responses status code should be 404")
    public void receiveValidHttp404() {
        restAssuredThat(response -> response.statusCode(404));
    }
//
    @Step("User requests to delete a product with id 11994")
    public String setGetApiEndpoint3() {
        return url + "products/11994";
    }

    @Step("I send DELETE HTTP request product")
    public void sendGetHttpRequest3() {
        SerenityRest.given().delete(setGetApiEndpoint3());
    }

    @Step("User requests to delete a product with id 1")
    public String setGetApiEndpoint4() {
        return url + "products/1";
    }

    @Step("I send DELETE HTTP request product")
    public void sendGetHttpRequest4() {
        SerenityRest.given().delete(setGetApiEndpoint4());
    }

    @Step("I set rating products endpoint")
    public String setApiProductRatingEndpoint() {
        return url + "products/13378/ratings";
    }

    @Step("I add the new rating")
    public void sendPostRatingHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("count", 4);

        SerenityRest.given().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkFsaWZmcmlhbnRvIFl1ZGhhIFByYWtvc28iLCJFbWFpbCI6ImFsaWZmcmlhbnRvMkBnbWFpbC5jb20ifQ.QmVSMTWxHY-69JYVwmIrGOgv6HiDbzbiuO_OtgLDzzQ")
                .header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setApiProductRatingEndpoint());
    }

    @Step("I set rating products endpoint")
    public String setApiProductRatingEndpoint1() {
        return url + "products/13379/ratings";
    }

    @Step("I add the new rating")
    public void sendPostRatingHttpRequest1() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("count", -4);

        SerenityRest.given().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkFsaWZmcmlhbnRvIFl1ZGhhIFByYWtvc28iLCJFbWFpbCI6ImFsaWZmcmlhbnRvMkBnbWFpbC5jb20ifQ.QmVSMTWxHY-69JYVwmIrGOgv6HiDbzbiuO_OtgLDzzQ")
                .header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setApiProductRatingEndpoint1());
    }

    @Step("I set GET rating product endpoint with id 11289")
    public String setGetRatingApiEndpoint() {
        return url + "products/12899/ratings";
    }

    @Step("I send GET HTTP request product2")
    public void sendGetRatingHttpRequest() {
        SerenityRest.given().get(setGetRatingApiEndpoint());
    }

    @Step("I set GET rating product endpoint with id 2")
    public String setGetRatingApiEndpoint1() {
        return url + "products/2/ratings";
    }

    @Step("I send GET HTTP request product3")
    public void sendGetRatingHttpRequest1() {
        SerenityRest.given().get(setGetRatingApiEndpoint1());
    }

    @Step("I set comment products endpoint")
    public String setApiCommentEndpoint() {
        return url + "products/12899/comments";
    }

    @Step("I add the new comment")
    public void sendPostCommentHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("content", "koment baru untuk testing API Mini Project");

        SerenityRest.given().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkFsaWZmcmlhbnRvIFl1ZGhhIFByYWtvc28iLCJFbWFpbCI6ImFsaWZmcmlhbnRvMkBnbWFpbC5jb20ifQ.QmVSMTWxHY-69JYVwmIrGOgv6HiDbzbiuO_OtgLDzzQ")
                .header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setApiCommentEndpoint());
    }

    @Step("I set comment products endpoint1")
    public String setApiCommentEndpoint1() {
        return url + "products/2/comments";
    }

    @Step("I add the new comment1")
    public void sendPostCommentHttpRequest1() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("content", "koment baru untuk testing API Mini Project");

        SerenityRest.given().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkFsaWZmcmlhbnRvIFl1ZGhhIFByYWtvc28iLCJFbWFpbCI6ImFsaWZmcmlhbnRvMkBnbWFpbC5jb20ifQ.QmVSMTWxHY-69JYVwmIrGOgv6HiDbzbiuO_OtgLDzzQ")
                .header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setApiCommentEndpoint());
    }

    @Step("I set GET comment product endpoint")
    public String setGetCommentApiEndpoint() {
        return url + "products/12899/comments";
    }

    @Step("I send GET HTTP request")
    public void sendGetCommentHttpRequest() {
        SerenityRest.given().get(setGetCommentApiEndpoint());
    }

    @Step("I set GET comment product endpoint2")
    public String setGetCommentApiEndpoint2() {
        return url + "products/2/comments";
    }

    @Step("I send GET HTTP request2")
    public void sendGetCommentHttpRequest2() {
        SerenityRest.given().get(setGetCommentApiEndpoint2());
    }


}
