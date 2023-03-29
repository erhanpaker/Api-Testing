import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ResponseBilgilerininManuelTestEdilmesi {

    @Test

    public void test01(){

        String url="https://restful-booker.herokuapp.com/booking/10";

        Response response = given().when().get(url);
        System.out.println("status code : "+response.getStatusCode() +
                "\nContent type : " + response.getContentType() +
                "\nServer Header degeri : " + response.getHeader("Server")+
                "\nStatus Line : " + response.getStatusLine()+
                "\nResponse suresi : " + response.getTime()+"ms");
    }

}
