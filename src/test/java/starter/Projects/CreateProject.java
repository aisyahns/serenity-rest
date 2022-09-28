package starter.Projects;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class CreateProject {

    private String url, token;

    public void setUrlAndValidToken(){
        url = "https://api.todoist.com/rest/v1/projects";
        token = "5168e7782ab230cdc186f02a96772b8b16dceb58";
    }

    public JSONObject bodyCreateProject(){
        JSONObject body = new JSONObject();
        body.put("name", "coba");
        return body;
    }

    public JSONObject allCreateProject(){
        JSONObject body = new JSONObject();
        body.put("name", "coba");
        body.put("color", 30);
        body.put("favorite", true);
        return body;
    }

    public void requestWithValidNameColorFavorite(){
        given().header("Authorization", "Bearer " + token)
                .header("Content-Type", "application/json")
                .body(allCreateProject().toJSONString());
        when().post(url);
    }

    public void requestWithValidName(){
        given().header("Authorization", "Bearer " + token)
                .header("Content-Type", "application/json")
                .body(bodyCreateProject().toJSONString());
        when().post(url);
    }

    public void verifyColorAndFavorite(){
        then().body("color", equalTo(30));
        then().body("favorite", equalTo(true));
    }


    public void verifyDetailResponse(){
        then().body("name", equalTo("coba"));
    }
}
