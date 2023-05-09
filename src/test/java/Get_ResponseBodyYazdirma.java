import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Get_ResponseBodyYazdirma {

    @Test

    public void get01(){
        // request body ve end-point hazırlama

        String url="https://restful-booker.herokuapp.com/booking/10";

        Response response = given().when().get(url);
        response.prettyPrint();
    }


}
