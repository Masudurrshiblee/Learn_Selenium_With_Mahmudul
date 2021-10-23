package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePage_CompleteTestCase {
    WebDriver driver;
    String amazonURL = "https://www.amazon.com/";
    String searchBoxLocator = "twotabsearchtextbox";
    String productName = "mask";
    String searchButtonLocator = "nav-search-submit-button";

@BeforeMethod
    public void setUp() {

        String chromeDriverPath = "BrowserDriver/Windows/chromedriver.exe";
        // String geckoDriverPath = "BrowserDriver/Windows/geckodriver-v0.30.0-win64/geckodriver.exe";
       // System.setProperty("webdriver.gecko.driver", geckoDriverPath);
    System.setProperty("webdriver.chrome.driver",chromeDriverPath);
         driver=new ChromeDriver();
       // WebDriver driver = new FirefoxDriver();
        driver.get(amazonURL);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }




    public void checkSearchBox() {
    // Enter product name
        driver.findElement(By.id(searchBoxLocator)).sendKeys(productName);
        // Click on search button
        driver.findElement(By.id(searchButtonLocator)).click();
    }
    @AfterMethod
    public void tearDown(){
    driver.quit();
    }
}
