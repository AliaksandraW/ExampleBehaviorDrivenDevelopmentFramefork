package Step_Def;

import Pages.AfterSearchPage;
import Pages.MainPage;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class searchingWithCredentials {
    MainPage mainPage = new MainPage();
    AfterSearchPage afterSearchPage = new AfterSearchPage();
    @When("User enter {string} in the search bar and click the search button")
    public void user_enter_in_the_search_bar_and_click_the_search_button(String s) {
        mainPage.searchBox.sendKeys("coffee maker" + Keys.ENTER);
    }
    @When("User should see list of results and additional options for searching")
    public void user_should_see_list_of_results_and_additional_options_for_searching() {
       assertTrue(afterSearchPage.searchResults.isDisplayed());
    }
    @When("User choose additional searching options and count of find results should be different than previous")
    public void user_choose_additional_searching_options_and_count_of_find_results_should_be_different_than_previous() {
        String afterFull = afterSearchPage.searchResults.getText();
        String [] str = afterFull.split(" ");
        afterSearchPage.freeShippingCheckbox.click();
        String afterCheck = afterSearchPage.searchResults.getText();
        String [] strAfter = afterCheck.split(" ");
        assertNotEquals(str[3].toString(), strAfter[3].toString());
    }
}
