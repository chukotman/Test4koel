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

public class KoelApiTest {
    private String baseUri;
    private Faker faker;
    private String playListName;
    private String token;
    private int playlistId;
    @BeforeClass
    public void init(){
        faker = new Faker();
        baseUri = "https://bbb.testpro.io/";
        token = "Bearer" + Token.get("chukotman@gmail.com", "T11jk7816+", baseUri);
    }
    @BeforeMethod
    public void createPLaylist(){
        playListName = faker.backToTheFuture().character();
        System.out.println("playListName: " + playListName);
        PlaylistRequest playlistRequest = new PlaylistRequest(playListName);
        Response response =
                given()
                        .baseUri(baseUri)
                        .basePath("api/playlist")
                        .header("Accept","application/json")
                        .header("Content-Type","application/json")
                        .header("Authorization", token)
                        .body(playlistRequest)
                .when()
                        .post()
                .then()
                        .statusCode(200)
                        .extract()
                        .response();

        JsonPath json = response.jsonPath();
        playlistId = json.getInt("id");
        System.out.println("playlistId: " + playlistId);
    }

    @AfterMethod
    public void cleanUp(){
                given()
                        .baseUri(baseUri)
                        .basePath("api/playlist/" + playlistId)
                        .header("Authorization", token)
                .when()
                        .delete();
    }

    @Test
    public void renamePlayList(){
        String newName = faker.funnyName().name();
        System.out.println("Created name to update: " + newName);
        PlaylistRequest playlistToBeRename = new PlaylistRequest(newName);
        Response response =
                given()
                        .baseUri(baseUri)
                        .basePath("api/playlist/" + playlistId)
                        .header("Accept","application/json")
                        .header("Content-Type","application/json")
                        .header("Authorization", token)
                        .body(playlistToBeRename)
                        .when()
                        .put()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();

        JsonPath json = response.jsonPath();
        System.out.println("Playlist new: " + json.getString("name"));
        PlaylistResponse playlistResponse = json.getObject("$", PlaylistResponse.class);
        Assert.assertEquals(newName, playlistResponse.getName());
    }

    @Test
    public void getCurrentPlayLists(){
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
        System.out.println(currentPlaylists.length);

        boolean flag = false;
        for (PlaylistResponse pl : currentPlaylists){
            if(playlistId == pl.getId()){
                flag = true;
                Assert.assertEquals(playListName, pl.getName());
            }
        }
        Assert.assertTrue(flag);
    }
}
