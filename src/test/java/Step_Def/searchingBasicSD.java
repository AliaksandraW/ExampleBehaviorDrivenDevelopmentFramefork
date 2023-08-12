package Step_Def;

import Pages.AfterSearchPage;
import Pages.MainPage;
import Utilities.ConfReader;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


import java.util.List;

import static org.junit.Assert.*;

public class searchingBasicSD {
    MainPage mainPage = new MainPage();
    AfterSearchPage afterSearchPage = new AfterSearchPage();

    @Given("User on the Amazon website")
    public void user_on_the_amazon_website() {
        Driver.getDriver().get(ConfReader.getProperty("url"));
        Driver.getDriver().manage().deleteAllCookies();
        assertTrue(Driver.getDriver().getCurrentUrl().equals(ConfReader.getProperty("url")));
    }
    @When("User enter following keywords in the search bar and should see list of results for:")
    public void user_enter_following_keywords_in_the_search_bar_and_should_see_list_of_results_for(List<String> searchKeyword) {
        for(String each: searchKeyword){
            mainPage.searchBox.clear();
            mainPage.searchBox.sendKeys(each + Keys.ENTER);
            assertTrue(afterSearchPage.searchResultsWord.getText().contains(each));
        }
    }
    @When("User enter {string} in the search bar")
    public void user_enter_in_the_search_bar(String s) {
        mainPage.searchBox.sendKeys("fosoro");
    }
    @When("User click the search button")
    public void user_click_the_search_button() {
        mainPage.searchButton.click();
    }
    @Then("User see a message that no results were found for {string}")
    public void user_see_a_message_that_no_results_were_found_for(String s) {
        assertTrue(afterSearchPage.noResultsForText.isDisplayed());
        assertTrue(afterSearchPage.searchKeyword.getText().equals("fosoro"));
    }
    @When("User typing {string} in the search bar")
    public void user_typing_in_the_search_bar(String string) {
        mainPage.searchBox.sendKeys("apple");
    }
    @Then("User should see a list of autosuggestions for {string}")
    public void user_should_see_a_list_of_autosuggestions_for(String string) {
        assertTrue(mainPage.autosuggestion.isDisplayed());
        List<WebElement>autoSuggesions = Driver.getDriver().findElements(By.xpath("//div[@class='left-pane-results-container']//div//div//div"));
        for (WebElement each:autoSuggesions){
            assertTrue(each.getText().startsWith("apple"));
        }
    }
}
