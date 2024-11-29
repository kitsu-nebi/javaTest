package tests.REST.API;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class PostPage {
    String Json1 = "{\n" +
            "   \"name\": \"Apple fff Pro 16\",\n" +
            "   \"data\": {\n" +
            "      \"year\": 2019,\n" +
            "      \"price\": 1849.99,\n" +
            "      \"CPU model\": \"Intel Core i9\",\n" +
            "      \"Hard disk size\": \"1 TB\"\n" +
            "   }\n" +
            "}";
    @Test
    @Tag("post-test-id")
    @Tag("post-test")
    @DisplayName("Test POST id equal")
    public void testGetId(){
        given().baseUri("https://api.restful-api.dev").contentType(ContentType.JSON).body(Json1).when().post("/objects").then().statusCode(200).body("name",equalTo("Apple fff Pro 16"));
    }

    @Test
    @Tag("post-test-resp")
    @Tag("post-test")
    @DisplayName("Test POST new resp")
    public void testGet200Response(){
        Response resp = (Response)  given().baseUri("https://api.restful-api.dev").contentType(ContentType.JSON).body(Json1).when().post("/objects").then().statusCode(200).extract().response();
        resp.then().body("name",equalTo("Apple fff Pro 16"));
    }

}
