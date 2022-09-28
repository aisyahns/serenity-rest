package starter.Projects;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class GetAProject {

    private String url, token;
    private Long id;

    public void setUrlAndValidToken(){
        url = "https://api.todoist.com/rest/v1/projects";
        token = "5168e7782ab230cdc186f02a96772b8b16dceb58";
    }

    public Long getIdProject(){
        given().header("Authorization", "Bearer " + token);
        when().get(url);
        id = lastResponse().body().path("[0].id");
        return id;
    }

    public void requestGetDetail(){
        given().header("Authorization", "Bearer " + token);
        when().get(url + "/" + id);
    }

    public void validateResponseId(){
        then().body("id", equalTo(id));
    }
}
