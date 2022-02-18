package koelApi;

import helper.Token;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.PlaylistResponse;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CleanUp {
    private String baseUri;
    private String token;
    @BeforeClass
    public void init(){
        baseUri = "https://bbb.testpro.io/";
        token = "Bearer" + Token.get("chukotman@gmail.com", "T11jk7816+", baseUri);
    }
    @Test
    public void cleanUp() throws InterruptedException {
        Response response =
                given()
                        .baseUri(baseUri)
                        .basePath("api/playlist")
                        .header("Accept","application/json")
                        .header("Content-Type","application/json")
                        .header("Authorization", token)
                        .when()
                        .get()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();

        JsonPath json = response.jsonPath();
        PlaylistResponse[] currentPlaylists = json.getObject("$", PlaylistResponse[].class);
        for (PlaylistResponse pl : currentPlaylists){
            given()
                    .baseUri(baseUri)
                    .basePath("api/playlist/" + pl.getId())
                    .header("Authorization", token)
                    .when()
                    .delete();
            Thread.sleep(800);
        }
    }
}
