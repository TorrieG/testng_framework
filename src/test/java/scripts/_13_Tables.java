package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class _13_Tables extends Base {
    /*
    Go to http://the-internet.herokuapp.com/
    Click on “Sortable Data Tables” link
    Validate the table 1 headers to be displayed as below
    Last Name
    First Name
    Email
    Due
    Web Site
    Action
     */

    @Test(priority = 1, description = "Tables | headers")
    public void testTableHeaders() {
        driver.get("http://the-internet.herokuapp.com/");
        heroAppPage.clickOnLink("Sortable Data Tables");

        List<WebElement> dataTables1 = driver.findElements(By.cssSelector("#table1 th"));
        String[] dataTableHeader = {"Last Name",
                "First Name",
                "Email",
                "Due",
                "Web Site",
                "Action"};
        for (int i = 0; i < 6; i++) {
            Assert.assertEquals(dataTables1.get(i).getText(), dataTableHeader[i]);
        }
    }

    /*
    Go to http://the-internet.herokuapp.com/
    Click on “Sortable Data Tables” link
    Validate the table 1 row 1 to be displayed as below
    Smith
    John
    jsmith@gmail.com
    $50.00
    http://www.jsmith.com
    edit delete

     */
    @Test(priority = 2, description = "Tables | first row")
    public void testFirstRow() {
        driver.get("http://the-internet.herokuapp.com/");
        heroAppPage.clickOnLink("Sortable Data Tables");

        List<WebElement> table1Row1 = driver.findElements(By.cssSelector("#table1>tbody>tr:nth-child(1)>td"));
        String[] firstRowItems = {
                "Smith",
                "John",
                "jsmith@gmail.com",
                "$50.00",
                "http://www.jsmith.com",
                "edit delete"
        };
        for (int i = 0; i < 6; i++) {
            Assert.assertEquals(table1Row1.get(i).getText(), firstRowItems[i]);
        }
    }

    /*
    Go to http://the-internet.herokuapp.com/
    Click on “Sortable Data Tables” link
    Validate the table 1 column 2 (First Name) to be displayed as below
    John
    Frank
    Jason
    Tim
     */
    @Test(priority = 3, description = "Tables | 2nd column")
    public void testSecondCoulmn() {
        driver.get("http://the-internet.herokuapp.com/");
        heroAppPage.clickOnLink("Sortable Data Tables");

        List<WebElement> table1FirstName = driver.findElements(By.cssSelector("#table1>tbody td:nth-child(2)"));
        String[] firstNameItems = {
                "John",
                "Frank",
                "Jason",
                "Tim"
        };
        for (int i = 0; i < 4; i++) {
            Assert.assertEquals(table1FirstName.get(i).getText(), firstNameItems[i]);
        }
    }

    /*
    Go to http://the-internet.herokuapp.com/
    Click on “Sortable Data Tables” link
    Validate each cell has value (not empty)
     */
    @Test(priority = 4, description = "Tables | 2nd column")
    public void testEachCell() {
        driver.get("http://the-internet.herokuapp.com/");
        heroAppPage.clickOnLink("Sortable Data Tables");

        List<WebElement> eachCell = driver.findElements(By.cssSelector("#table1 td"));
        System.out.println(eachCell.size());

        for (WebElement webElement : eachCell) {
            Assert.assertNotEquals(webElement.getText(), "");
        }

    }
    /*
    Go to http://the-internet.herokuapp.com/
    Click on “Sortable Data Tables” link
    Validate the “Web Site” column data to be displayed as below
    http://www.jsmith.com
    http://www.frank.com
    http://www.jdoe.com
    http://www.timconway.com

     */
    @Test(priority = 4, description = "Tables | 2nd column")
    public void testFithCoulmn() {
        driver.get("http://the-internet.herokuapp.com/");
        heroAppPage.clickOnLink("Sortable Data Tables");

        List<WebElement> table1WebsiteColumn = driver.findElements(By.cssSelector("#table1>tbody td:nth-child(5)"));
        String[] websiteList = {
                "http://www.jsmith.com",
                "http://www.frank.com",
                "http://www.jdoe.com",
                "http://www.timconway.com"
        };
        for (int i = 0; i < 4; i++) {
            Assert.assertEquals(table1WebsiteColumn.get(i).getText(), websiteList[i]);
        }

}}
