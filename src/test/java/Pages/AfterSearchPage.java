package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AfterSearchPage extends MainPage{
    @FindBy (xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']//span[3]")
    public WebElement searchResultsWord;
    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']//span[1]")
    public WebElement searchResults;
    @FindBy(xpath = "//div//span[@class='a-size-medium a-color-base']")
    public WebElement noResultsForText;
    @FindBy(xpath = "//div//span[@class='a-size-medium a-color-base'][2]")
    public WebElement searchKeyword;
    @FindBy(xpath = "//*[@id='p_76/1249155011']/span/a/div[1]/label/i")
    public WebElement freeShippingCheckbox;

}
