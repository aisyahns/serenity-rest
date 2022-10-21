package starter.ReqresIn;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class ListUser {

    private String url;

    public void setUrlApiListUser(){
        url = "https://reqres.in/api/users?page=2";
    }

    public void requestListUser(){
        // given(), when() --> aku tau bahwa aku perlu ngedefine ini,
        // method given() dan juga method when() untuk melakukan request
        // given() -> akan menyimpan value2 yang berkaitan dengan apa2
        // yang perlu didefine sebelum melakukan request
        // contoh: header, body, queryParam, dll (bisa liat ketika . di methodnya)

        // when() -> ketika kita melakukan requestnya
        // url atau siapa yg mau kita request
        // methodnya

        // given() when() --> kita perlu pake ini ketika melakukan request
        // given() -> pre condition / apa2 yang perlu kita definisikan
        // sebelum request dilakukan
        // contoh: Params, query params, authorization, headers, body
        // given().queryParam()
        // given().header()
        // given().body() -> pakai chaining
        // given().queryParam("page", 2)
        //        .body("");

        // when() ketika request dilakukan, method dan url yg dituju
        given().when().get(url);

        // apa yang dikembalikan setelah melakukan request?
        // --> response --> statusCode, body
    }

    public void verifyStatusCode200(){
        // then() -> method untuk melakukan verifikasi atau pengecekan terhadap
        // response yang dihasilkan
        // method then digunakan untuk memverifikasi response yg dikembalikan
        then().statusCode(200);
    }

    public void verifyDetailPage(){
        then().body("page", equalTo(2));
    }
}
