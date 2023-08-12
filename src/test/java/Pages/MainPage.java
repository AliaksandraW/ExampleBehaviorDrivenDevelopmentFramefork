package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    public MainPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (xpath = "//div[@class='nav-search-field ']//input")
    public WebElement searchBox;
    @FindBy(id = "nav-search-submit-button")
    public WebElement searchButton;
    @FindBy(xpath = "//div//div[@class='left-pane-results-container']")
    public WebElement autosuggestion;
}
