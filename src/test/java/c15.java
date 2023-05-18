import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Test;
import org.testng.asserts.SoftAssert;

import static io.restassured.RestAssured.given;

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

        expectedData.put("status","success");
        expectedData.put("data",dataBilgileriJson);
        expectedData.put("message","SuccessFully! Record has been fetched");

        System.out.println(expectedData.toString());


        Response response = given().when().get(url);

        response.prettyPrint();

        JsonPath responseJsonpath = response.jsonPath();

        SoftAssert softAssert = new SoftAssert();




    }
}
