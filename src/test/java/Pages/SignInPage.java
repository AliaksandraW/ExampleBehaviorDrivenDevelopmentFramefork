package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends MainPage {
    @FindBy(id = "ap_email")
    public WebElement loginField;
    @FindBy(id = "ap_password")
    public WebElement passwordField;
    @FindBy(xpath = "//h4[.='There was a problem']")
    public WebElement problemWithLoginAlert;
    public void login(String login, String password){
        this.loginField.sendKeys(login + Keys.ENTER);
        this.passwordField.sendKeys(password + Keys.ENTER);
    }

}
