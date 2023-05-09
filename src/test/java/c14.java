import org.json.JSONObject;
import org.junit.Test;

public class c14 {

    @Test

    public void test01(){

        String url= "https://restful-booker.herokuapp.com/booking";

        JSONObject requestBody = new JSONObject();
        JSONObject rezervasyontarihleri = new JSONObject();

        rezervasyontarihleri.put("checkin","2021-06-01");
        rezervasyontarihleri.put("checkout","2021-06-10");

        requestBody.put("firstname","Ahmet");
        requestBody.put("lastname","Bulut");
        requestBody.put("totalprice","500");
        requestBody.put("depositpaid","false");
        requestBody.put("bookingdates","rezervasyontarihleri");
        requestBody.put("additional","wi-fi");

     // expected data oluştur



    }
}
