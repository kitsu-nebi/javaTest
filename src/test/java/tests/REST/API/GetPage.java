package tests.REST.API;

import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.response.Response.*;
import static org.hamcrest.CoreMatchers.equalTo;

public class GetPage {
    @Test
    @Tag("get-test-200")
    @Tag("get-test")
    @DisplayName("Test Get 200")
    public void testGet200(){
        given().
                baseUri("https://api.restful-api.dev/objects").
                when().
                baseUri("https://api.restful-api.dev/objects/7").
                then().
                statusCode(200);
    }

    @Test
    @Tag("get-test-id")
    @Tag("get-test")
    @DisplayName("Test Get id equal")
    public void testGetId(){
        given().baseUri("https://api.restful-api.dev").when().get("/objects/7").then().body("id", equalTo("7"));
    }

    @Test
    @Tag("get-test-resp")
    @Tag("get-test")
    @DisplayName("Test Get id resp")
    public void testGet200Response(){
        Response resp = (Response)  given().baseUri("https://api.restful-api.dev").when().get("/objects/7").then().extract().response();
        resp.then().body("id",equalTo("7"));
    }

}
