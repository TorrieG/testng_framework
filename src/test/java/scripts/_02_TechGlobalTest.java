package scripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Driver;

public class _02_TechGlobalTest {
    /*
    1. Go to https://www.techglobalschool.com/apply-now
    2. Validate h1 heading is displayed as
     */

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = Driver.getDriver();
    }


    @Test
    public void testApplicationFormHeading(){
        driver.get("https://www.techglobalschool.com/apply-now");

        WebElement heading1 = driver.findElement(By.xpath("//div[@id='comp-kh9s3kyz3']//span/span"));

        Assert.assertTrue(heading1.isDisplayed());
        Assert.assertEquals(heading1.getText(), "Application Form");
    }
    @AfterMethod
    public void teardown(){
        Driver.quitDriver();
    }
}
