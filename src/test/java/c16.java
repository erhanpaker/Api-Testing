import org.json.JSONObject;
import org.junit.Test;

public class c16 {

    @Test

    public void test01(){

        // 1- endpoint ve request body olustur

        String url= "http://dummy.restapiexample.com/api/v1/update/21";

        JSONObject requestBody = new JSONObject();

        JSONObject dataBilgileriJson = new JSONObject();

        dataBilgileriJson.put("name","Ahmet");
        dataBilgileriJson.put("salary","1230");
        dataBilgileriJson.put("age","43");
        dataBilgileriJson.put("id","40");


        requestBody.put("status","success");
        requestBody.put("data",dataBilgileriJson);

        System.out.println(requestBody.toString());



    }
}
