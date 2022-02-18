package pageObjects.pageObjectTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class LoginFactoryTests extends BaseTest {
    @Test
    public void factory_correctCredentials_loggedToApp(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username, password);
        Assert.assertTrue(mainPage.isOpen());

    }

    @Test
    public void factory_inCorrectCredentials_loggedToApp(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username, "tttsdfsdf");
        Assert.assertTrue(loginPage.isErrorFrame());
    }

    @Test
    public void factory_correctCredentials_loggedToApp1(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username, password);
        Assert.assertTrue(mainPage.isOpen());

    }

    @Test
    public void factory_inCorrectCredentials_loggedToApp1(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username, "tttsdfsdf");
        Assert.assertTrue(loginPage.isErrorFrame());
    }

    @Test
    public void factory_correctCredentials_loggedToApp2(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username, password);
        Assert.assertTrue(mainPage.isOpen());

    }

    @Test
    public void factory_inCorrectCredentials_loggedToApp2(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username, "tttsdfsdf");
        Assert.assertTrue(loginPage.isErrorFrame());
    }

    @Test
    public void factory_correctCredentials_loggedToApp3(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username, password);
        Assert.assertTrue(mainPage.isOpen());

    }

    @Test
    public void factory_inCorrectCredentials_loggedToApp3(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username, "tttsdfsdf");
        Assert.assertTrue(loginPage.isErrorFrame());
    }
}
