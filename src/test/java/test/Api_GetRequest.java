package test;

import org.json.JSONObject;
import org.junit.Test;

public class Api_GetRequest {

    @Test

    public void get01(){

        String url ="https://jsonplaceholder.typicode.com/posts/44";

        JSONObject expBody = new JSONObject();

        expBody.put("userId",5);
        expBody.put("title","optio dolor molestias sit");


    }
}
