package com.demoblaze.pages;

import com.demoblaze.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {

    public LoginPage() {
        PageFactory.initElements(driver, this);

    }

    @CacheLookup
    @FindBy(id = "login2")
    WebElement loginTab;
    @CacheLookup
    @FindBy(id = "loginusername")
    WebElement usernameField;
    @CacheLookup
    @FindBy(id = "loginpassword")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;

    public void clickOnLoginTab() {
        clickOnElement(loginTab);
    }

    public void enterUsername(String username) {
        sendTextToElement(usernameField, username);
    }

    public void enterPasswordField(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }


}
