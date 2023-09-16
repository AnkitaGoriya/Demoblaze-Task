package com.demoblaze.steps;

import com.demoblaze.pages.CartPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

public class CartSteps {
    @When("^I click on Categories option$")
    public void iClickOnCategoriesOption() {
        new CartPage().clickOnCategoriesTab();
    }

    @And("^I click on phone tab$")
    public void iClickOnPhoneTab() {
        new CartPage().clickOnPhonesLink();
    }

    @And("^I click on the product \"([^\"]*)\" link$")
    public void iClickOnTheProductLink(String arg0) throws InterruptedException {
        Thread.sleep(2000);
        new CartPage().clickOnSamsungGalaxyS6Product();

    }

    @And("^I can see the text \"([^\"]*)\" on the page$")
    public void iCanSeeTheTextOnThePage(String arg0) {
        Assert.assertEquals("Samsung galaxy s6", new CartPage().getTextFromSamsungGalaxyS6Title());

    }

    @And("^I should see the price \"([^\"]*)\"$")
    public void iShouldSeeThePrice(String arg0) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals("$360 *includes tax", new CartPage().getTextFrom360Price());

    }

    @And("^I click on the Add to cart button$")
    public void iClickOnTheAddToCartButton() {
        new CartPage().clickOnAddToCartButton();
    }

    @Then("^I should see the message \"([^\"]*)\" on the box$")
    public void iShouldSeeTheMessageOnTheBox(String arg0) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals("Product added", new CartPage().getTextFromAlertProductAdded());

    }

    @And("^I click on ok button$")
    public void iClickOnOkButton() {
        new CartPage().clickOnOkButtonProductAddedBox();
    }

    @And("^I click on cart option$")
    public void iClickOnCartOption() {
        new CartPage().clickOnCartTab();
    }

    @And("^I should be able to verify text \"([^\"]*)\"$")
    public void iShouldBeAbleToVerifyText(String arg0) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals("Products", new CartPage().getTextFromProductsTitle());

    }

    @Then("^I click on place order button$")
    public void iClickOnPlaceOrderButton() throws InterruptedException {
        Thread.sleep(2000);
        new CartPage().clickOnPlaceOrderTab();
    }

    @And("^I fill below details in the dialog box$")
    public void iFillBelowDetailsInTheDialogBox(DataTable dataTable) throws InterruptedException {
        Thread.sleep(2000);
        List<List<String>> form = dataTable.asLists(String.class);
        new CartPage().enterName(form.get(0).get(0));
        new CartPage().enterCountry(form.get(0).get(1));
        new CartPage().enterCity(form.get(0).get(2));
        new CartPage().enterCreditCardField(form.get(0).get(3));
        new CartPage().enterMonth(form.get(0).get(4));
        new CartPage().enterYear(form.get(0).get(5));


    }

    @Then("^I click on purchase tab$")
    public void iClickOnPurchaseTab() throws InterruptedException {
        Thread.sleep(2000);
        new CartPage().clickOnPurchaseTab();
    }

    @And("^I click on the ok button$")
    public void iClickOnTheOkButton() throws InterruptedException {
        Thread.sleep(2000);
        new CartPage().clickOnOkButtonAfterPurchase();
    }


}

