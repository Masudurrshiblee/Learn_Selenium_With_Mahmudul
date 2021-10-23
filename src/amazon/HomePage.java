package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import  org.openqa.selenium.chrome.ChromeDriver;

public  class HomePage {
    public static void main(String[] args) throws InterruptedException {

// This code is Firefox browser
//       String fireFoxDriverPath="BrowserDriver/Windows/geckodriver-v0.30.0-win64/geckodriver.exe ";
//        System.setProperty("webdriver.gecko.driver",fireFoxDriverPath);
//       WebDriver driver= new FirefoxDriver();
//       driver.get("https://www.amazon.com/");

        // This code is for Chrome Browser
        String chromeDriverPath="BrowserDriver/Windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromeDriverPath);
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().fullscreen();
        driver.manage().deleteAllCookies();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mask");
        driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(50000);
        driver.close();

    }

}
