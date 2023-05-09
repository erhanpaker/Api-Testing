import com.google.gson.JsonObject;
import org.json.JSONObject;
import org.junit.Test;

public class JsonObjesiOlusturma {

    @Test

    public void test01(){

          JSONObject obj1 = new JSONObject();
          obj1.put("title", "ahmet");
          obj1.put("body","merhaba");
          obj1.put("userId","1");
          System.out.println(obj1);





    }
}
