package mySimpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestRun {

    @Test
    public void simpleTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.udemy.com");

        Thread.sleep(3000);

        By searchFieldlocator = By.xpath("//*[@name='q']");
        WebElement searchField = driver.findElement(searchFieldlocator);
        searchField.sendKeys("JAVA");
        Thread.sleep(3000);


        searchField.sendKeys(Keys.RETURN);






        Thread.sleep(5000);

        driver.close();
    }
}
