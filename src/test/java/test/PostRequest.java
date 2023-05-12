package test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PostRequest {

    @Test

    public void get02(){

        String url = "https://jsonplaceholder.typicode.com/posts";

        JSONObject reqBody = new JSONObject();

        reqBody.put("title","API");
        reqBody.put("BODY","API öğreniyorum");
        reqBody.put("userId","10");


        JSONObject expBody = new JSONObject();

        reqBody.put("title","API");
        reqBody.put("BODY","API öğreniyorum");
        reqBody.put("userId","10");


        Response response = given().
                contentType(ContentType.JSON).
                when().
                body(reqBody.toString()).
                post(url);


    }



}
