package com.demoblaze.pages;

import com.demoblaze.utilities.Utility;
import net.bytebuddy.utility.RandomString;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class SignUpPage extends Utility {

    public static String generatedEmail;

    public SignUpPage() {
        PageFactory.initElements(driver, this);

    }

    @CacheLookup
    @FindBy(id = "signin2")
    WebElement signUpTab;
    @CacheLookup
    @FindBy(id = "sign-username")
    WebElement usernameField;
    @CacheLookup
    @FindBy(id = "sign-password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Sign up')]")
    WebElement signUpButton;

    public void clickOnSignUpTab() {
        clickOnElement(signUpTab);
    }

    public void enterUsername(String username) {
        Random randomPartOfEmailGenerator = new Random(5000);
        int randomNumberInEmail = randomPartOfEmailGenerator.nextInt();
        //random string generator - to use in email
        RandomString randomString = new RandomString(5);
        String randomStringInEmailGenerator = randomString.nextString();
        generatedEmail = "mocky" + randomNumberInEmail + randomStringInEmailGenerator + "mouse@gmail.com";
        sendTextToElement(usernameField, generatedEmail);
    }

    public void enterPasswordField(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnSignUpButton() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", signUpButton);

    }

    public String getTextFromAlertBox() {
        return getTextFromAlert();
    }

    public void clickOnOkButtonOnAlertBox() {
        acceptAlert();
    }


}
