import org.json.JSONObject;
import org.junit.Test;

public class c15 {

    @Test

    public void test01(){

        String url= "http://dummy.restapiexample.com/api/v1/employee/3";

        JSONObject expectedData = new JSONObject();
        JSONObject dataBilgileriJson = new JSONObject();

        dataBilgileriJson.put("id",3);

    }
}
