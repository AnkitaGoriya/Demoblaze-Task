package com.demoblaze.pages;

import com.demoblaze.utilities.Utility;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends Utility {

    public CartPage() {
        PageFactory.initElements(driver, this);

    }

    @CacheLookup
    @FindBy(id = "cat")
    WebElement categoriesTab;
    @CacheLookup
    @FindBy(id = "itemc")
    WebElement phonesLink;
    @CacheLookup
    @FindBy(linkText = "Samsung galaxy s6")
    WebElement samsungGalaxyS6link;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Samsung galaxy s6')]")
    WebElement samsungGalaxyS6Text;
    @CacheLookup
    @FindBy(css = ".price-container")
    WebElement $360Text;
    @CacheLookup
    @FindBy(linkText = "Add to cart")
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(linkText = "Cart")
    WebElement cartTab;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Products')]")
    WebElement productsText;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Place Order')]")
    WebElement placeOrderTab;
    @CacheLookup
    @FindBy(id = "name")
    WebElement nameTextField;
    @CacheLookup
    @FindBy(id = "country")
    WebElement countryTextField;
    @CacheLookup
    @FindBy(id = "city")
    WebElement cityTextField;
    @CacheLookup
    @FindBy(id = "card")
    WebElement creditCardField;
    @CacheLookup
    @FindBy(id = "month")
    WebElement monthTextField;
    @CacheLookup
    @FindBy(id = "year")
    WebElement yearTextField;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Purchase')]")
    WebElement purchaseButton;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'OK')]")
    WebElement okButton;
    @CacheLookup
    @FindBy(css = ".btn.btn-secondary")
    WebElement closeButton;

    public void clickOnCategoriesTab() {
        clickOnElement(categoriesTab);
    }

    public void clickOnPhonesLink() {
        clickOnElement(phonesLink);
    }

    public void clickOnSamsungGalaxyS6Product() {
        clickOnElement(samsungGalaxyS6link);
    }

    public String getTextFromSamsungGalaxyS6Title() {
        return getTextFromElement(samsungGalaxyS6Text);
    }

    public String getTextFrom360Price() {
        return getTextFromElement($360Text);
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
    }

    public String getTextFromAlertProductAdded() {
        return getTextFromAlert();
    }

    public void clickOnOkButtonProductAddedBox() {
        acceptAlert();
    }

    public void clickOnCartTab() {
        clickOnElement(cartTab);
    }

    public String getTextFromProductsTitle() {
        return getTextFromElement(productsText);
    }

    public void clickOnPlaceOrderTab() {
        clickOnElement(placeOrderTab);
    }

    public void enterName(String name) {
        sendTextToElement(nameTextField, name);
    }

    public void enterCountry(String country) {
        sendTextToElement(countryTextField, country);
    }

    public void enterCity(String city) {
        sendTextToElement(cityTextField, city);
    }

    public void enterCreditCardField(String creditCard) {
        sendTextToElement(creditCardField, creditCard);
    }

    public void enterMonth(String month) {
        sendTextToElement(monthTextField, month);
    }

    public void enterYear(String year) {
        sendTextToElement(yearTextField, year);
    }

    public void clickOnPurchaseTab() {
        clickOnElement(purchaseButton);
    }

    public void clickOnOkButtonAfterPurchase() {
        //clickOnElement(okButton);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", okButton);
    }

    public void clickOnCloseButtonAfterPurchase() {
        clickOnElement(closeButton);
    }


}
