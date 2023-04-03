import org.json.JSONObject;
import org.junit.Test;

public class Post_Response_Body_Testi {

    @Test


    public void test01(){

        // 1- endpoint ve request body hazirla
        String url= "https://jsonplaceholder.typicode.com/posts";

        JSONObject requestBody = new JSONObject();
        requestBody.put("title","API");
        requestBody.put("body","API ogrenmek ne güzel");
        requestBody.put("userId","10");



    }
}
