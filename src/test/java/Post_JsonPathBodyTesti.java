import org.json.JSONObject;
import org.junit.Test;

public class Post_JsonPathBodyTesti {

    @Test

    public void test01(){


        String url="https://restful-booker.herokuapp.com/booking/";

        JSONObject requestBody = new JSONObject();
        JSONObject rezarvazyonTarihleri = new JSONObject();

        rezarvazyonTarihleri.put( "checkin",2023-01-10);
        requestBody.put("checkout","2023-01-20");

        requestBody.put("fistname","ahmet");
        requestBody.put("lastname","bulut");






    }
}
