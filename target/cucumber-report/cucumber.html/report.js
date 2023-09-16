$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("signuppage.feature");
formatter.feature({
  "line": 1,
  "name": "Sign up functionality",
  "description": "As a user I should be able to register successfully",
  "id": "sign-up-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9562329100,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 785002200,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "User should be able able to signup successfully",
  "description": "",
  "id": "sign-up-functionality;user-should-be-able-able-to-signup-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I click on sign up tab",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I enter \"random username\" into username field",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter \"Password123\" into password field",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on signup button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should be able to signup successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpSteps.iClickOnSignUpTab()"
});
formatter.result({
  "duration": 520062700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "random username",
      "offset": 9
    }
  ],
  "location": "SignUpSteps.iEnterIntoUsernameField(String)"
});
formatter.result({
  "duration": 1023594000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Password123",
      "offset": 9
    }
  ],
  "location": "SignUpSteps.iEnterIntoPasswordField(String)"
});
formatter.result({
  "duration": 154798400,
  "status": "passed"
});
formatter.match({
  "location": "SignUpSteps.iClickOnSignupButton()"
});
formatter.result({
  "duration": 2056826500,
  "status": "passed"
});
formatter.match({
  "location": "SignUpSteps.iShouldBeAbleToSignupSuccessfully()"
});
formatter.result({
  "duration": 2034570200,
  "status": "passed"
});
formatter.after({
  "duration": 1127680200,
  "status": "passed"
});
});