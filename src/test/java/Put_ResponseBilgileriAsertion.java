import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Put_ResponseBilgileriAsertion {

    @Test

    public void test01(){


        String url= "https://restful-booker.herokuapp.com/post/70";

        JSONObject requestBody = new JSONObject();
        requestBody.put("title","ahmet");
        requestBody.put("body","merhaba");
        requestBody.put("userId",10);
        requestBody.put("title","ahmet");
        requestBody.put("id",70);


        Response response = given().contentType(ContentType.JSON)
                .when().body(requestBody.toString())
                 .put(url);

       response
               .then().assertThat().
                 statusCode(200)
               .contentType("application/json; charset=utf-8").
                header("Server","cloudflare")
               .statusLine("HTTP/1.1 200 OK");


    }
}
