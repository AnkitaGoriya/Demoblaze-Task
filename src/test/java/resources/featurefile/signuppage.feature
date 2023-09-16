Feature: Sign up functionality
  As a user I should be able to register successfully

  Background:
    Given I am on homepage
  @sanity
  Scenario: User should be able able to signup successfully
    When    I click on sign up tab
    And     I enter "random username" into username field
    And     I enter "Password123" into password field
    And     I click on signup button
    Then    I should be able to signup successfully