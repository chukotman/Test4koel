package pageObjects.pageObjectTests;

import com.github.javafaker.Faker;
import helper.DataGenerator;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class PlaylistTests extends BaseTest {
    @Test
    public void playlist_createPlaylist_PlaylistCreated(){
//        String playListName = DataGenerator.randomString(7);
        Faker faker = new Faker();
        String playListName = faker.funnyName().name();

        System.out.println(playListName);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username, password);
        String playListID = mainPage.createPlayist(playListName);
        System.out.println(playListID);

        Assert.assertTrue(mainPage.playListExist(playListID, playListName));
    }

    @Test
    public void playlist_renamePlaylist_playlistRenamed(){
        Faker faker = new Faker();
        String playListName = faker.funnyName().name();
        System.out.println(playListName);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username, password);
        String playListID = mainPage.createPlayist(playListName);
        System.out.println(playListID);

        String newName = faker.artist().name();
        System.out.println(newName);
        mainPage.renamePlaylist(playListID, newName);

        Assert.assertTrue(mainPage.playListExist(playListID, newName));
    }

    @Test
    public void playlist_createPlaylist_PlaylistCreated1(){
//        String playListName = DataGenerator.randomString(7);
        Faker faker = new Faker();
        String playListName = faker.funnyName().name();

        System.out.println(playListName);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username, password);
        String playListID = mainPage.createPlayist(playListName);
        System.out.println(playListID);

        Assert.assertTrue(mainPage.playListExist(playListID, playListName));
    }

    @Test
    public void playlist_renamePlaylist_playlistRenamed1(){
        Faker faker = new Faker();
        String playListName = faker.funnyName().name();
        System.out.println(playListName);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username, password);
        String playListID = mainPage.createPlayist(playListName);
        System.out.println(playListID);

        String newName = faker.artist().name();
        System.out.println(newName);
        mainPage.renamePlaylist(playListID, newName);

        Assert.assertTrue(mainPage.playListExist(playListID, newName));
    }

    @Test
    public void playlist_createPlaylist_PlaylistCreated2(){
//        String playListName = DataGenerator.randomString(7);
        Faker faker = new Faker();
        String playListName = faker.funnyName().name();

        System.out.println(playListName);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username, password);
        String playListID = mainPage.createPlayist(playListName);
        System.out.println(playListID);

        Assert.assertTrue(mainPage.playListExist(playListID, playListName));
    }

    @Test
    public void playlist_renamePlaylist_playlistRenamed2(){
        Faker faker = new Faker();
        String playListName = faker.funnyName().name();
        System.out.println(playListName);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username, password);
        String playListID = mainPage.createPlayist(playListName);
        System.out.println(playListID);

        String newName = faker.artist().name();
        System.out.println(newName);
        mainPage.renamePlaylist(playListID, newName);

        Assert.assertTrue(mainPage.playListExist(playListID, newName));
    }

    @Test
    public void playlist_createPlaylist_PlaylistCreated3(){
//        String playListName = DataGenerator.randomString(7);
        Faker faker = new Faker();
        String playListName = faker.funnyName().name();

        System.out.println(playListName);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username, password);
        String playListID = mainPage.createPlayist(playListName);
        System.out.println(playListID);

        Assert.assertTrue(mainPage.playListExist(playListID, playListName));
    }

    @Test
    public void playlist_renamePlaylist_playlistRenamed3(){
        Faker faker = new Faker();
        String playListName = faker.funnyName().name();
        System.out.println(playListName);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username, password);
        String playListID = mainPage.createPlayist(playListName);
        System.out.println(playListID);

        String newName = faker.artist().name();
        System.out.println(newName);
        mainPage.renamePlaylist(playListID, newName);

        Assert.assertTrue(mainPage.playListExist(playListID, newName));
    }
}
