import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ResponseDegerleriniOtomasyonIleTestEtme {
    @Test

    public void test01(){

        String url= "https://restful-booker.herokuapp.com/booking/10";

        Response response = given().when().get(url);

        response
                .then()
                .assertThat().statusCode(200)
                .contentType("application/json; charset=utf-8")
                .header("Server", "Cowboy")
                .statusLine("HTTP/1.1 200 OK");

    }
}
