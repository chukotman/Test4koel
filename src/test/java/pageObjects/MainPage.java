package pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage {
    private static Logger logger = LogManager.getLogger(MainPage.class);
    public MainPage(WebDriver driver) {
        super(driver);
    }

    private void clickPlusButton(){
        logger.debug("In the clickPlusButton method");
        By plusButtonLocator = By.xpath("//*[@title='Create a new playlist']");
        for (int i = 0; i < 50; i++){
            logger.info("Attempt = " + i);
            try{
                driver.findElement(plusButtonLocator).click();
                logger.warn("Click passed!!!");
                break;
            } catch (NoSuchElementException | ElementClickInterceptedException err){
                System.out.println(err.getClass());
                logger.error("Click failed" + err.getClass());
                System.out.println("====================");
                System.out.println();
                try{
                    Thread.sleep(50);
                }catch (InterruptedException ignored){}
            }
        }
    }

    private WebElement getNewPlaylistItem(){
        By newPlaylistItewmLocator = By.xpath("//*[text() = 'New Playlist']");
        return this.driver.findElement(newPlaylistItewmLocator);
    }

    private WebElement getPlaylistNameField() {
        By playlistNameFieldLocator = By.xpath("//*[@class='create']/*");
        return this.driver.findElement(playlistNameFieldLocator);
    }

    public boolean isOpen() {
        By homeIconLocator = By.className("home");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(homeIconLocator));
            return driver.findElement(homeIconLocator).isDisplayed();
        } catch (TimeoutException err){
            return false;
        }
    }

    public String createPlayist(String playlistname){
        logger.debug("I'm in the createPlaylist method");
        clickPlusButton();
        getNewPlaylistItem().click();
        getPlaylistNameField().sendKeys(playlistname);
        getPlaylistNameField().sendKeys(Keys.RETURN);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("success")));
        return driver.getCurrentUrl().split("/")[5];

    }

    private WebElement getPlaylist(String playListID){
        By playlistLocator = By.xpath("//*[@href='#!/playlist/" + playListID + "']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(playlistLocator));
        return driver.findElement(playlistLocator);
    }


    public boolean playListExist(String playListID, String playListName) {
        try{
            WebElement playList = getPlaylist(playListID);
            return playList.isDisplayed() && playList.getText().equals(playListName);
        }catch(NoSuchElementException err){
            return false;
        }
    }

    public void renamePlaylist(String playListID, String newName){
        WebElement playlist = getPlaylist(playListID);
        //Scroll to this playlist
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", playlist);
        //double-click the element
        Actions actions = new Actions(driver);
        actions.doubleClick(playlist).perform();
        //select the text
        getEditingField().sendKeys(Keys.COMMAND+"a");
        //replace with new name
        getEditingField().sendKeys(newName);
        getEditingField().sendKeys(Keys.RETURN);
        //wait until second green banner
        By secondGreenBunner = By.xpath("//*[@class='success show' and contains(text(),'" + newName + "')]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(secondGreenBunner));

    }

    private WebElement getEditingField(){
        By editLocator = By.xpath("//*[@class='playlist playlist editing']/input");
        wait.until(ExpectedConditions.elementToBeClickable(editLocator));
        return driver.findElement(editLocator);
    }
}
