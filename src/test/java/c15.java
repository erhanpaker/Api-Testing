import org.json.JSONObject;
import org.junit.Test;

public class c15 {

    @Test

    public void test01(){

        String url= "http://dummy.restapiexample.com/api/v1/employee/3";

        JSONObject expectedData = new JSONObject();
        JSONObject dataBilgileriJson = new JSONObject();

        dataBilgileriJson.put("id",3);
        dataBilgileriJson.put("employee_name","Ahston Cox");
        dataBilgileriJson.put("enployess_salary",86000);
        dataBilgileriJson.put("employee_age",66);
        dataBilgileriJson.put("profile_image","");

    }
}
