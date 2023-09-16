package com.demoblaze.steps;

import com.demoblaze.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }

    @When("^I click on login tab$")
    public void iClickOnLoginTab() {
        new LoginPage().clickOnLoginTab();
    }

    @And("^I enter username \"([^\"]*)\" into username field$")
    public void iEnterUsernameIntoUsernameField(String username) throws InterruptedException {
        Thread.sleep(2000);
        new LoginPage().enterUsername(username);
    }

    @And("^I enter password \"([^\"]*)\" into password field$")
    public void iEnterPasswordIntoPasswordField(String password) {
        new LoginPage().enterPasswordField(password);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() throws InterruptedException {
        Thread.sleep(2000);
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I should be able to login successfully$")
    public void iShouldBeAbleToLoginSuccessfully() throws InterruptedException {

    }

}
