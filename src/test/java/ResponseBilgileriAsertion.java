import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ResponseBilgileriAsertion {

    @Test

    public void test01(){


        String url= "https://restful-booker.herokuapp.com/post/70";

        JSONObject requestBody = new JSONObject();
        requestBody.put("title","ahmet");
        requestBody.put("body","merhaba");
        requestBody.put("userId",10);
        requestBody.put("title","ahmet");
        requestBody.put("id",70);


        Response response = given().when().put(url);



    }
}
