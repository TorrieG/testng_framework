package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EbayPracticePage {

    public EbayPracticePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "ul[class='hl-cat-nav__container']>li")
    public List<WebElement> h1NavigationLinks;

    @FindBy(css = "input[id=gh-ac]")
    public WebElement searchForAnythingInput;

    @FindBy(css = "#gh-cat")
    public  WebElement allCategoriesButton;

    @FindBy(css = "#gh-cat>option")
    public  List<WebElement> allCategoriesDropdown;

}
