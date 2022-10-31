package starter.ReqresIn;

import org.json.simple.JSONObject;

import java.util.LinkedList;
import java.util.List;

import static net.serenitybdd.rest.SerenityRest.given;

public class Register {

    private String url;
    private JSONObject body = new JSONObject();
    List<JSONObject> data = new LinkedList<>();

    public void setUrlRegister(){
        url = "https://reqres.in/api/register";
    }


    public void setBodyData(String email, String password){
        List<Integer> category = new LinkedList<>();
        body.put("email", email);
        body.put("password", password);
        category.add(2);// aku akan isi value 2 ke array category -> [ 2 ]
        category.add(5);// aku akan isi value 2 ke array category -> [ 2 ]
        category.add(10);// aku akan isi value 2 ke array category -> [ 2 ]
        body.put("categories", category); //bodynya akan berisi array
        // "categories": [2, 5, 10]
        // ----> sampai sini baru ngebentuk si JSONObject
        data.add(body);
        // kita udah masukkin body JSONObjectnya ke array data
    }

    public void setBodyValidEmailValidPassword(){
        body.put("email", "eve.holt@reqres.in");
        body.put("password", "pistol"); // dia akan jadi json

    }

    public void setBodyInvalidEmailValidPassword(){
        body.put("email", "");
        body.put("password", "pistol");
    }
    public void requestRegister(){
        given().header("content-type", "application/json")
                .body(data)
                .when().post(url);
    }


    // [
    //    {
    //        "product_id":2,
    //        "quantity":1
    //    }
    // ]

    // akan berbentuk json dengan key product_id, value: 2
    // key quantity dengan value : 1
    // si json ini akan dimasukkan array dan array ini yang akan jadi body

    public void bodyProduct(){
        JSONObject body = new JSONObject();
        body.put("product_id", 2);
        body.put("quantity", 1); //selesai ngebuat jsonObyek

        List<Integer> quantity = new LinkedList<>();
        quantity.add(2);
        body.put("quantity_2", quantity);

        data.add(body);
    }


}
