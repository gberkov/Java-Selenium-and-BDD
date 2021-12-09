$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/bddHomework.feature");
formatter.feature({
  "name": "Customer site for shopping",
  "description": "  As a customer I want to register my\n  account for future usage",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Homework"
    },
    {
      "name": "@BDD"
    }
  ]
});
formatter.scenario({
  "name": "Successfully Registered Account",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Homework"
    },
    {
      "name": "@BDD"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "The site is open",
  "keyword": "Given "
});
formatter.match({
  "location": "BddStepDefinitions.the_site_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The home page is loaded",
  "keyword": "When "
});
formatter.match({
  "location": "BddStepDefinitions.the_home_page_is_loaded()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to register account page",
  "keyword": "And "
});
formatter.match({
  "location": "BddStepDefinitions.navigate_to_register_account_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Fill all mandatory field",
  "keyword": "And "
});
formatter.match({
  "location": "BddStepDefinitions.fill_all_mandatory_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Ensure that he is able to registered account and successful message \"Your Account Has Been Created!\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "BddStepDefinitions.ensure_that_he_is_able_to_registered_account_and_successful_message_is_displayed(String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: There is a bug expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:99)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:1037)\r\n\tat org.testng.Assert.assertTrue(Assert.java:45)\r\n\tat frontend.pages.RegisterAccountPage.verifyTextPresent(RegisterAccountPage.java:64)\r\n\tat BDD.BddStepDefinitions.ensure_that_he_is_able_to_registered_account_and_successful_message_is_displayed(BddStepDefinitions.java:40)\r\n\tat ✽.Ensure that he is able to registered account and successful message \"Your Account Has Been Created!\" is displayed(src/test/java/resources/bddHomework.feature:13)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Password Must Be Between 40 and 20 Characters",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Homework"
    },
    {
      "name": "@BDD"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "The site is open",
  "keyword": "Given "
});
formatter.match({
  "location": "BddStepDefinitions.the_site_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The home page is loaded",
  "keyword": "When "
});
formatter.match({
  "location": "BddStepDefinitions.the_home_page_is_loaded()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to register account page",
  "keyword": "And "
});
formatter.match({
  "location": "BddStepDefinitions.navigate_to_register_account_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Fill all mandatory field but for password field is provided invalid data",
  "keyword": "And "
});
formatter.match({
  "location": "BddStepDefinitions.fill_all_mandatory_field_but_for_password_field_is_provided_invalid_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Ensure that registration warning message \"Password must be between 4 and 20 characters!\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "BddStepDefinitions.ensure_that_registration_warning_message_is_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Unsuccessfully Registered Account",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Homework"
    },
    {
      "name": "@BDD"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "The site is open",
  "keyword": "Given "
});
formatter.match({
  "location": "BddStepDefinitions.the_site_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The home page is loaded",
  "keyword": "When "
});
formatter.match({
  "location": "BddStepDefinitions.the_home_page_is_loaded()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to register account page",
  "keyword": "And "
});
formatter.match({
  "location": "BddStepDefinitions.navigate_to_register_account_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Fill all mandatory field but for password field he provides wrong password",
  "keyword": "And "
});
formatter.match({
  "location": "BddStepDefinitions.fill_all_mandatory_field_but_for_password_field_he_provides_wrong_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Ensure that registration is failure and \"Password confirmation does not match password!\" message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "BddStepDefinitions.ensure_that_registration_is_failure_and_message_is_displayed(String)"
});
formatter.result({
  "status": "passed"
});
});