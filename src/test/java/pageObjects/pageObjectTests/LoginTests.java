package pageObjects.pageObjectTests;

import listeners.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class LoginTests extends BaseTest {
    private int count = 0;

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void flakyTest(){
        if(count ++< 3){
            Assert.assertTrue(false);
        }
        Assert.assertTrue(true);
    }

    @Test
    public void login_correctCredentials_LoggedToMainPage(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username, password);
        Assert.assertTrue(mainPage.isOpen());

    }

    @Test
    public void login_incorrectCredentials_ErrorFrame(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username, password);
        Assert.assertTrue(loginPage.isErrorFrame());
    }

    @Test
    public void login_correctCredentials_LoggedToMainPage1(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username, "tttsdfsdf");
        Assert.assertTrue(mainPage.isOpen());

    }

    @Test
    public void login_incorrectCredentials_ErrorFrame1(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username, "tttsdfsdf");
        Assert.assertTrue(loginPage.isErrorFrame());
    }

    @Test
    public void login_correctCredentials_LoggedToMainPage2(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username, password);
        Assert.assertTrue(mainPage.isOpen());

    }

    @Test (enabled = false)
    public void login_incorrectCredentials_ErrorFrame2(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username, "tttsdfsdf");
        Assert.assertTrue(loginPage.isErrorFrame());
    }

    @Test
    public void login_correctCredentials_LoggedToMainPage3(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username, password);
        Assert.assertTrue(mainPage.isOpen());

    }

    @Test
    public void login_incorrectCredentials_ErrorFrame3(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username, "tttsdfsdf");
        Assert.assertTrue(loginPage.isErrorFrame());
    }
}
