import org.json.JSONObject;
import org.junit.Test;

public class JsonObjesiOlusturma22 {

    @Test

    public void test01(){

        JSONObject dataJsonObject= new JSONObject();
        dataJsonObject.put("checkin","2018-01-01");
        dataJsonObject.put("checkout","2019-01-01");

        JSONObject requestBody = new JSONObject();
        requestBody.put("firstname","jim");
        requestBody.put("additionalneeds","Breakfast");
        requestBody.put("bookingdates",dataJsonObject);

        requestBody.put("totalprice",111);
        requestBody.put("depositpaid",true);
        requestBody.put("lastname","Brown");

        System.out.println(requestBody);





    }
}
