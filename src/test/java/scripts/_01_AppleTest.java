package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Driver;



public class _01_AppleTest {


    //Declare your driver
    WebDriver driver;

    // 1. Initial set up - before each test
    @BeforeMethod
    public void setup(){
        driver = Driver.getDriver();
    }

    // 2. Validation of test - test
    @Test
    public void testAppleTitle(){
        driver.get("https://www.apple.com/");

        String expectedTitle = "Apple"; // requirement
        String actualTitle = driver.getTitle(); // development

    /*
    Instead of these if-else validation, we will use TestNG assertion
    if(actualTitle.equals(expectedTitle)) System.out.println("Apple title validation passed");
    else System.out.println("Apple title validation failed");
     */

        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test
    public void testAppleURL(){
        driver.get("https://www.apple.com/");

        String expectedURL = "https://www.apple.com/";
        String actualURL = driver.getCurrentUrl();

        Assert.assertEquals(actualURL, expectedURL);
    }

    @Test
    public void x(){
        //fail() method is used to fail a test on purpose
        //used for known issues
        Assert.fail("Failure on purpose - bug ticket created KJKJ798798");
    }

    // 3. Teardown actions - after each test
    @AfterMethod
    public void teardown(){
        Driver.quitDriver();
    }

}
