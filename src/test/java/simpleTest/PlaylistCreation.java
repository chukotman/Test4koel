package simpleTest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class PlaylistCreation {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeMethod
    public void preLoading() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10, 200);
        driver.get("https://bbb.testpro.io");
    }

    @AfterMethod
    public void conlusion() {
        driver.quit();
    }

    @Test
    public void playlist_positivTest_playlist() {


        By emailLocator = By.cssSelector("[type='email']");
        By passwordLocator = By.xpath("//*[@type='password']");
        By loginButtonLocator = By.tagName("button");

        wait.until(ExpectedConditions.visibilityOfElementLocated(emailLocator));
        WebElement emailField = driver.findElement(emailLocator);
        WebElement passwordField = driver.findElement(passwordLocator);
        WebElement loginButton = driver.findElement(loginButtonLocator);

        emailField.sendKeys("chukotman@gmail.com");
        passwordField.sendKeys("T11jk7816+");
        loginButton.click();

//        driver.findElement(By.xpath("//*[@type='password']")).sendKeys();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@type='password']")).click();
        By addPlaylistButton = By.xpath("//*[@title='Create a new playlist']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(addPlaylistButton));
        driver.findElement(addPlaylistButton).click();

//        By homelocator = By.className("home");
//        wait.until(ExpectedConditions.visibilityOfElementLocated(homelocator));
//        WebElement home = driver.findElement(homelocator);
//        Assert.assertTrue(home.isDisplayed());
////        Assert.assertTrue(driver.findElement(homelocator).isDisplayed());

    }
}
