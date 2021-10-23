package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class HomePage_DynamicWay {

    public static void main(String[] args) throws InterruptedException {
        // Creating the variable of the element which need to be tested

        String amazonURL = "https://www.amazon.com/";
        String searchBoxLocator = "twotabsearchtextbox";
        String productName = "Iphone-13";
        String searchBottonLocator = "nav-search-submit-button";

// The following four line code ios use for displaying any browser application


            String chromeDriverPath = "BrowserDriver/Windows/chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", chromeDriverPath);
            WebDriver driver = new ChromeDriver();
            driver.get(amazonURL);


        //The following methods are using to do testing
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.findElement(By.id(searchBoxLocator)).sendKeys(productName);
        driver.findElement(By.id(searchBottonLocator)).click();
        Thread.sleep(50000);
        driver.close();

    }
}
