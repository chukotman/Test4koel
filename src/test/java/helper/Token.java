package helper;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.CredentialsRequest;

import static io.restassured.RestAssured.given;

public class Token {
    public static String get(String userName, String password, String url){
        String baseUri = url;
        CredentialsRequest credentials = new CredentialsRequest(userName, password);
        Response response =
                given()
                        .baseUri(baseUri)
                        .basePath("api/me")
                        .header("Accept","application/json")
                        .header("Content-Type","application/json")
                        .body(credentials)
                        .when()
                        .post()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();

        JsonPath json = response.jsonPath();
        return json.getString("token");
    }

}
