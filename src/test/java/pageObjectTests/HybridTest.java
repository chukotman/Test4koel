package pageObjectTests;

import com.github.javafaker.Faker;
import dbAdapter.Adapter;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.PlaylistRequest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.MainPage;
import pageObjects.pageObjectTests.BaseTest;

import static io.restassured.RestAssured.given;

public class HybridTest extends BaseTest {
    private String playlistName;
    private int playlistId;
    @BeforeMethod
    public void createPlaylist(){
        playlistName = faker.backToTheFuture().character();
        PlaylistRequest playlistRequest = new PlaylistRequest(playlistName);
        Response response =
                given()
                        .baseUri(url)
                        .basePath("api/playlist")
                        .header("Accept","application/json")
                        .header("Content-Type","application/json")
                        .header("Authorization","Bearer "+token)
                        .body(playlistRequest)
                        .when()
                        .post()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();

        JsonPath json = response.jsonPath();
        playlistId = json.getInt("id");
    }
    @AfterMethod
    public void cleanUp(){
        given()
                .baseUri(url)
                .basePath("api/playlist/"+playlistId)
                .header("Authorization","Bearer "+token)
                .when()
                .delete();
    }
    @Test
    public void hybrid_renamePlaylist_playlistRenamed(){
        MainPage mainPage = login();
        String newName = faker.artist().name();
        mainPage.renamePlaylist(playlistId+"",newName);

        Assert.assertEquals(newName, Adapter.getPlaylistName(playlistId));
    }
}
