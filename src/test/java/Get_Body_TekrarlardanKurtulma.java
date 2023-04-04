import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Get_Body_TekrarlardanKurtulma {

    @Test

    public void test01(){

        String url="https://restful-booker.herokuapp.com/booking/10";

        Response response = given().when().get(url);

         response.then().assertThat().statusCode(200).contentType(ContentType.JSON)
                 .body("firstname", Matchers.equalTo("Sally"))
                 .body("lastname",Matchers.equalTo("Smith"))
                 .body("totalprice",Matchers.lessThan(1000));




    }
}
