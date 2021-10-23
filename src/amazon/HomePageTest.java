package amazon;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends HomePage_CompleteTestCase {

    @Test(priority=2)
    public void testCheckSearchBox(){

        checkSearchBox();
        String expectedText="\"mask\"";
        String actualText=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).getText();
        Assert.assertEquals(actualText,expectedText);
    }
    @Test(priority=1)
    public void testPageTitle(){ // Test case for HomePage Title
        String expectedText="Amazon.com. Spend less. Smile more.";  //
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText);

    }




}
