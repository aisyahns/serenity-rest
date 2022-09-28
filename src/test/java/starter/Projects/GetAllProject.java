package starter.Projects;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class GetAllProject {

    private String url, token;

    public void setUrlAndInvalidToken(){
        url = "https://api.todoist.com/rest/v1/projects";
        token = "Bearer token"; //penamaan variabel token
    }

    public void setUrlAndValidToken(){
        url = "https://api.todoist.com/rest/v1/projects";
        token = "Bearer 5168e7782ab230cdc186f02a96772b8b16dceb58";
    }

    public void requestGetAllProject(){
        given().header("Authorization", token)
                .header("Content-Type", "application/json"); //kondisi yg harus disiapkan sebelum request, dan bisa pakai method chaining
        when().get(url); //method dan url apa yg akan kita request dan melakukan requestnya
    }

    public void validateStatusCode(){
        then().statusCode(401);
    }

    public void validateStatus200(){
        then().statusCode(200);
    }

    public void validateAllMyProject(){
        then().statusCode(200);
    }

    public void validateForbiddenMessage(){
        then().body(equalTo("Forbidden"));
    }

    public void validateListProject(){
        then().body("[0].name", equalTo("Inbox"));
    }

}
