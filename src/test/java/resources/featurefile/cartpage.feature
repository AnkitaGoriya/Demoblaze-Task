Feature: Cart Page Test
  As a user I want to add product in shopping cart and complete purchase successfully

  Background:
    Given I am on homepage
 @regression
  Scenario: User should add items to cart successfully
    When    I click on Categories option
    And     I click on phone tab
    And     I click on the product "Samsung Galaxy S6" link
    And     I can see the text "Samsung Galaxy S6" on the page
    And     I should see the price "$360"
    And     I click on the Add to cart button
    Then    I should see the message "Product added " on the box
    And     I click on ok button

  @regression
  Scenario:  User should place order successfully and complete purchase.
    And     I click on cart option
    And     I should be able to verify text "Products"
    Then    I click on place order button
    And     I fill below details in the dialog box
    | Magnus  | United Kingdom | London |  5105105105105100 | September | 2023 |
    Then    I click on purchase tab
    And     I should be able to verify text "Thank you for your purchase!"
    Then    I click on the ok button

