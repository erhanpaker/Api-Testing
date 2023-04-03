import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Get_ResponseBodyTesti {

    @Test

    public void test01(){

        String url= "https://jsonplaceholder.typicode.com/posts/44";

        Response response = given().when().get(url);

       response
               .then()
               .assertThat()
               .statusCode(200)
               .contentType(ContentType.JSON );

    }
}
