package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver){
        super(driver);
    }

    private WebElement getEmailField(){
        By emailFieldLocator = By.xpath("//*[@type='email']");
        return this.driver.findElement(emailFieldLocator);
    }

    private WebElement getPasswordField() {
        By passwordFeildLocator = By.xpath("//*[@type='password']");
        return this.driver.findElement(passwordFeildLocator);
    }

    private WebElement getLoginButton(){
        return driver.findElement(By.tagName("button"));
    }

    public MainPage loginToApp(String userName, String password){
        getEmailField().sendKeys(userName);
        getPasswordField().sendKeys(password);
        getLoginButton().click();
        return new MainPage(this.driver);
    }

    public void open(String url){
        this.driver.get(url);
    }

    public boolean isErrorFrame() {
        By errorLocator = By.cssSelector(".error");
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(errorLocator));
            return driver.findElement(errorLocator).isDisplayed();
        } catch(TimeoutException err){
            return false;
        }
    }
}
