import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class c13 {

    @Test

    public void test01(){

        // end point ve request body hazırla

        String url= "https://jsonplaceholder.typicode.com/posts/22";

        JSONObject expectedData = new JSONObject();
        expectedData.put("userId", 3);
        expectedData.put("id", 22);
        expectedData.put("title", "dolor sint quo a velit explicabo quia nam");
        expectedData.put("body", "eos qui et ipsum ipsam suscipit aut\\nsed omnis non odio\\nexpedita earum mollitia molestiae aut atque rem suscipit\\nnam impedit esse");

        Response response = given().when().get(url);
        response.prettyPrint();

        /*

        response
                .then()
                .assertThat()
                .body("userId", equalTo(3),
                "id", equalTo(22),
                        "title",equalTo("dolor sint quo a velit explicabo quia nam"));

         */

        JsonPath responseJsonPath = response.jsonPath();

        Assert.assertEquals(expectedData.get("id"),responseJsonPath.get("id"));
        Assert.assertEquals(expectedData.get("title"),responseJsonPath.get("title"));
        Assert.assertEquals(expectedData.get("body"),responseJsonPath.get("body"));
        Assert.assertEquals(expectedData.get("userId"),responseJsonPath.get("userId"));



    }
}
