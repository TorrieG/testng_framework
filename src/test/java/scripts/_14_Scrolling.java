package scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import utilities.Waiters;

public class _14_Scrolling extends Base{
    @Test
    public void testScrolling(){
        driver.get("https://www.techglobalschool.com/");
        Waiters.pause(3);

        //actions.moveToElement(tgHomePage.registerForIntroLink).perform();
        //actions.sendKeys(Keys.PAGE_DOWN).perform();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoViewIfNeeded()", tgHomePage.faceBookIcon);

        Waiters.pause(3);

    }
}
