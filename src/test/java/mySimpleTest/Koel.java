package mySimpleTest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Koel {
    private WebDriver driver;
    private WebDriverWait wait;
    private FluentWait<WebDriver> fluentWait;

    @BeforeMethod
    public void beforeEveryTestMethod() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10, 200);
        fluentWait = new FluentWait<>(driver)
                .pollingEvery(Duration.ofMillis(200))
                .withTimeout(Duration.ofSeconds(10))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(ElementClickInterceptedException.class)
        ;
        driver.get("https://bbb.testpro.io");
    }

    @AfterMethod
    public void afterEveryTestMethod() {
//        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void login_correctCredentials_loggedToApp() {


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


        By homelocator = By.className("home");
        wait.until(ExpectedConditions.visibilityOfElementLocated(homelocator));
        WebElement home = driver.findElement(homelocator);
        Assert.assertTrue(home.isDisplayed());
//        Assert.assertTrue(driver.findElement(homelocator).isDisplayed());

    }

    @Test
    public void login_incorrectCredentials_redFrame() {


        By emailLocator = By.cssSelector("[type='email']");
        By passwordLocator = By.xpath("//*[@type='password']");
        By loginButtonLocator = By.tagName("button");

        WebElement emailField = driver.findElement(emailLocator);
        WebElement passwordField = driver.findElement(passwordLocator);
        WebElement loginButton = driver.findElement(loginButtonLocator);

        emailField.sendKeys("chukotman@gmail.com");
        passwordField.sendKeys("wrongPassword");
        loginButton.click();

        By errorLocator = By.className("error");
        fluentWait.until(x->x.findElement(errorLocator));
        WebElement redFrame = driver.findElement(errorLocator);
        Assert.assertTrue(redFrame.isDisplayed());
//        Assert.assertTrue(driver.findElement(homelocator).isDisplayed());

    }

    @Test
    public void driverMethods() {
        String title = driver.getTitle();
        System.out.println("Title = " + title);
        String url = driver.getCurrentUrl();
        System.out.println("url = " + url);
        //brouser navigation - Back, Forward, Refresh
        driver.navigate().refresh();

        List<WebElement> inputs = driver.findElements(By.tagName("input"));
        for (WebElement element : inputs) {
            System.out.println("isDisplayed = " + element.isDisplayed());
            System.out.println("isEnabled = " + element.isEnabled());
            System.out.println("isSelected = " + element.isSelected());

        }
        System.out.println("Input count = " + inputs.size());

        By errorFrame = By.cssSelector(".error");
        List<WebElement> errors = driver.findElements(errorFrame);
        System.out.println("Errors Elements = " + errors.size());

        WebElement loginButton = driver.findElement(By.tagName("button"));
        System.out.println("Login button inner text = " + loginButton.getText());

        System.out.println("Type atribute's value = " + loginButton.getAttribute("type"));

        System.out.println(".background: " + loginButton.getCssValue("background"));

        System.out.println(loginButton.getLocation().x + " " + loginButton.getLocation().y);

        WebElement username = driver.findElement(By.xpath("//*[@type='email']"));
        username.sendKeys("XXXXXXX");
        username.sendKeys(Keys.COMMAND + "A");
    }

    @Test
    public void login_customWait() throws InterruptedException {


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




        By homelocator = By.className("home");
        WebElement home = null;
        boolean x = false;
        for (int i = 0; i<50; i++){
            try {
                home = driver.findElement(homelocator);
                x = true;
                break;
            }catch (NoSuchElementException err){
                System.out.println("In catch block");
                Thread.sleep(50);
            }
        }
        if (!x){
            throw new TimeoutException("Element not found");
        }
        Assert.assertTrue(home.isDisplayed());
//        Assert.assertTrue(driver.findElement(homelocator).isDisplayed());

    }

}
