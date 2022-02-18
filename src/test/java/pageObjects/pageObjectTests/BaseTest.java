package pageObjects.pageObjectTests;

import com.github.javafaker.Faker;
import enums.BrowserType;
import helper.BrowserFabric;
import helper.Screenshot;
import helper.Token;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import pageObjects.MainPage;

public class BaseTest {
    protected WebDriver driver;
    protected String username;
    protected String password;
    protected String url;
    protected Faker faker;
    protected String token;
    private BrowserType browserType;

    @Parameters({"url", "browser", "username", "password"})
    @BeforeClass
    public void init(String url, String browser, String email, String password){
        browserType = browser.equals("CHROME") ? BrowserType.CHROME : BrowserType.FIREFOX;
        faker = new Faker();
        username = email;
        this.password = password;
        this.url = url;
        token = Token.get(username, password, url);
    }

    @BeforeMethod
    public void beforeEveryTestMethod() {
        driver = BrowserFabric.getDriver(browserType);
//        WebDriverManager.firefoxdriver().setup();
//        driver = new FirefoxDriver();
//        WebDriverManager.operadriver().setup();
//        driver = new OperaDriver();
//        username = email;
//        this.password = password;
//        this.url = url;
    }

    @AfterMethod
    public void afterEveryTestMethod(ITestResult iTestResult) throws InterruptedException {
        if (iTestResult.getStatus() == iTestResult.FAILURE){
            Screenshot.get(driver, iTestResult.getName());
        }
        Thread.sleep(3000);
        driver.quit();
    }
    public MainPage login(){
        String key = "jwt-token";
        String value = "\""+token+"\"";
        driver.get(url);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("localStorage.setItem(arguments[0],arguments[1])",key,value);
        driver.navigate().refresh();
        return new MainPage(driver);
    }
}
