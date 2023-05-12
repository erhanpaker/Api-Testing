package test;

import org.json.JSONObject;
import org.junit.Test;

public class PostRequest {

    @Test

    public void get02(){

        String url = "https://jsonplaceholder.typicode.com/posts";

        JSONObject reqBody = new JSONObject();

        reqBody.put("title","API");
        reqBody.put("BODY","API öğreniyorum");
        reqBody.put("userId","10");
    }
}
