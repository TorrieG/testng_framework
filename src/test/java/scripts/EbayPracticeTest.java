package scripts;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EbayPracticeTest extends Base{

    @Test(priority = 1, description = "TC59875: H1 navigation links")
    public void testH1NavigationLinks(){
        driver.get("https://www.ebay.com/");

        String[] expectedText = {
                "Home",
                "Saved",
                "Motors",
                "Electronics",
                "Collectibles & Art",
                "Home & Garden",
                "Clothing & Accessories",
                "Toys",
                "Sporting Goods",
                "Business & Industrial",
                "Jewelry & Watches",
                "eBay Refurbished"};

        for (int i = 0; i < 12; i++) {
            Assert.assertEquals(ebayPracticePage.h1NavigationLinks.get(i).getText(), expectedText[i]);
        }
        String[] expectedAllCategoriesLinks = {
                "All Categories",
                "Antiques",
                "Art",
                "Baby",
                "Books",
                "Business & Industrial",
                "Cameras & Photo",
                "Cell Phones & Accessories",
                "Clothing, Shoes & Accessories",
                "Coins & Paper Money",
                "Collectibles",
                "Computers/Tablets & Networking",
                "Consumer Electronics",
                "Crafts",
                "Dolls & Bears",
                "DVDs & Movies",
                "eBay Motors",
                "Entertainment Memorabilia",
                "Gift Cards & Coupons",
                "Health & Beauty",
                "Home & Garden",
                "Jewelry & Watches",
                "Music",
                "Musical Instruments & Gear",
                "Pet Supplies",
                "Pottery & Glass",
                "Real Estate",
                "Specialty Services",
                "Sporting Goods",
                "Sports Mem, Cards & Fan Shop",
                "Stamps",
                "Tickets & Experiences",
                "Toys & Hobbies",
                "Travel",
                "Video Games & Consoles",
                "Everything Else"};
        for (int i = 0; i < 35; i++) {
            Assert.assertEquals(ebayPracticePage.allCategoriesDropdown.get(i).getText(),
                    expectedAllCategoriesLinks[i]);
        }
        //ebayPracticePage.searchForAnythingInput.sendKeys("shoes", Keys.ENTER);
    }
}
