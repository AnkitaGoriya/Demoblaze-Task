Feature: Login functionality
  As a user I should be able to login successfully

Background:
    Given I am on homepage
@smoke
Scenario: User should be able to navigate to login page successfully
  When    I click on login tab
  And     I enter username "EdwardSmith" into username field
  And     I enter password "Password123" into password field
  And     I click on login button
  Then    I should be able to login successfully