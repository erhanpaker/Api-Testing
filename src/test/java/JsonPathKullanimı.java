import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;

public class JsonPathKullanimı {

    @Test

    public void method01(){

        JSONObject kisibilgileriJsonobj = new JSONObject();

        JSONObject adresJsonObj = new JSONObject();

        JSONArray telofonBilgileriArr = new JSONArray();

        JSONObject cepTelefonuJsonObj = new JSONObject();

        JSONObject evTelefonuJsonObj = new JSONObject();

        adresJsonObj.put("streetAddres","naist street");
        adresJsonObj.put("city","nara");
        adresJsonObj.put("postalCode","630-0192");

        cepTelefonuJsonObj.put("type","iphone");
        cepTelefonuJsonObj.put("number","0123-4567-8888");
        evTelefonuJsonObj.put("type","home");
        evTelefonuJsonObj.put("number","0123-45678910");

        telofonBilgileriArr.put(cepTelefonuJsonObj);
        telofonBilgileriArr.put(evTelefonuJsonObj);

        kisibilgileriJsonobj.put("firstname","Jhon");
        kisibilgileriJsonobj.put("lastname","Doe");
        kisibilgileriJsonobj.put("age","26");
        kisibilgileriJsonobj.put("adress",adresJsonObj);
        kisibilgileriJsonobj.put("phoneNumbers",telofonBilgileriArr);

        System.out.println(kisibilgileriJsonobj);




    }
}
