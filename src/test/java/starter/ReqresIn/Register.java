package starter.ReqresIn;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.given;

public class Register {

    private String url;
    private JSONObject body = new JSONObject();

    public void setUrlRegister(){
        url = "https://reqres.in/api/register";
    }

    public void setBodyValidEmailValidPassword(){
        body.put("email", "eve.holt@reqres.in");
        body.put("password", "pistol");
    }

    public void requestRegister(){
        given().header("content-type", "application/json")
                .body(body.toJSONString())
                .when().post(url);
    }

}
