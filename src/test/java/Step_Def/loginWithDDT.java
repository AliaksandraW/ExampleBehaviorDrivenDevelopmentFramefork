package Step_Def;
import Pages.SignInPage;
import Utilities.Driver;
import Utilities.ExcelUtil;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Pages.MainPage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertTrue;


public class loginWithDDT {
    MainPage mainPage = new MainPage();
    SignInPage signInPage = new SignInPage();
    Actions actions = new Actions(Driver.getDriver());
    ExcelUtil excelUtil = new ExcelUtil("UserPassword.xlsx", "Sheet1");
    @When("the user login with given credentials from {string} and {int}")
    public void the_user_login_with_given_credentials_from_and(String sheetName, Integer rowNumber) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(mainPage.signInLink));
        actions.moveToElement(mainPage.signInLink).click().perform();
        String login = excelUtil.getCellData(rowNumber, 0);
        String password = excelUtil.getCellData(rowNumber, 1);
        signInPage.login(login, password);
    }
    @Then("the user should see notice about incorrect login or password")
    public void the_user_should_see_notice_about_incorrect_login_or_password() {
        assertTrue(signInPage.problemWithLoginAlert.isDisplayed());
        Driver.getDriver().manage().deleteAllCookies();
    }
}
