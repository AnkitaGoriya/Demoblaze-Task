package com.demoblaze.steps;

import com.demoblaze.pages.SignUpPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SignUpSteps {

    @When("^I click on sign up tab$")
    public void iClickOnSignUpTab() {
        new SignUpPage().clickOnSignUpTab();
    }

    @And("^I enter \"([^\"]*)\" into username field$")
    public void iEnterIntoUsernameField(String username) {
        new SignUpPage().enterUsername(username);

    }

    @And("^I enter \"([^\"]*)\" into password field$")
    public void iEnterIntoPasswordField(String password) {
        new SignUpPage().enterPasswordField(password);

    }

    @And("^I click on signup button$")
    public void iClickOnSignupButton() throws InterruptedException {
        Thread.sleep(2000);
        new SignUpPage().clickOnSignUpButton();
    }

    @Then("^I should be able to signup successfully$")
    public void iShouldBeAbleToSignupSuccessfully() throws InterruptedException {
        Thread.sleep(2000);
        String actualMessage = new SignUpPage().getTextFromAlertBox();
        Assert.assertEquals("Sign up successful.", actualMessage);
        new SignUpPage().clickOnOkButtonOnAlertBox();


    }


}
