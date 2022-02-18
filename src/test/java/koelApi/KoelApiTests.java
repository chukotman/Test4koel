package koelApi;

import com.github.javafaker.Faker;
import helper.Token;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.PlaylistRequest;
import models.PlaylistResponse;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class KoelApiTests {
    private String baseUri;
    private Faker faker;
    private String playlistName;
    private String token;
    private int playlistId;
    @BeforeClass
    public void init(){
        faker = new Faker();
        baseUri = "https://bbb.testpro.io/";
        token = "Bearer "+ Token.get("koeluser06@testpro.io","te$t$tudent",baseUri);
    }
    @BeforeMethod
    public void createPlaylist(){
        playlistName = faker.backToTheFuture().character();
        System.out.println(playlistName);
        PlaylistRequest playlistRequest = new PlaylistRequest(playlistName);
        Response response =
                given()
                        .baseUri(baseUri)
                        .basePath("api/playlist")
                        .header("Accept","application/json")
                        .header("Content-Type","application/json")
                        .header("Authorization",token)
                        .body(playlistRequest)
                        .when()
                        .post()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();

        JsonPath json = response.jsonPath();
        playlistId = json.getInt("id");
        System.out.println(playlistId);
    }
    @AfterMethod
    public void cleanUp(){
        given()
                .baseUri(baseUri)
                .basePath("api/playlist/"+playlistId)
                .header("Authorization",token)
                .when()
                .delete();
    }
    @Test
    public void renamePlaylist(){
        String newName = faker.medical().diseaseName();
        System.out.println(newName);
        PlaylistRequest playlistRequest = new PlaylistRequest(newName);
        Response response =
                given()
                        .baseUri(baseUri)
                        .basePath("api/playlist/"+playlistId)
                        .header("Accept","application/json")
                        .header("Content-Type","application/json")
                        .header("Authorization",token)
                        .body(playlistRequest)
                        .when()
                        .patch()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();

        JsonPath json = response.jsonPath();
        PlaylistResponse playlistResponse = json.getObject("$",PlaylistResponse.class);
        Assert.assertEquals(newName,playlistResponse.getName());
    }
    @Test
    public void getAllPlaylists(){
        Response response =
                given()
                        .baseUri(baseUri)
                        .basePath("api/playlist/")
                        .header("Accept","application/json")
                        .header("Authorization",token)
                        .when()
                        .get()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();

        JsonPath json = response.jsonPath();
        PlaylistResponse[] playlists = json.getObject("$",PlaylistResponse[].class);
        System.out.println(playlists.length);

        boolean flag = false;
        for (PlaylistResponse pl : playlists){
            if(playlistId==pl.getId()){
                flag = true;
                Assert.assertEquals(playlistName,pl.getName());
            }
        }
        Assert.assertTrue(flag);
    }
}
