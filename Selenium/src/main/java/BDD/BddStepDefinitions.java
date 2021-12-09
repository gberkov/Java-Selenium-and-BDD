package BDD;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import frontend.pages.HomePage;
import frontend.pages.RegisterAccountPage;
import frontend.pages.components.Header;
import org.testng.Assert;
import utils.Browser;


public class BddStepDefinitions {

    private String string;

    @Given("The site is open")
    public void the_site_is_open() {
        Browser.setup();
    }

    @When("The home page is loaded")
    public static void the_home_page_is_loaded() {
        HomePage.open();

    }

    @When("Navigate to register account page")
    public void navigate_to_register_account_page() {
        Header.goToRegisterAccount();
    }

    @When("Fill all mandatory field")
    public void fill_all_mandatory_field() {
        RegisterAccountPage.fillAllMandatoryFields("Pesho", "Peshev", "ivanivanov@abv.bg", "12345", "12345", "0888545454");
    }

    @Then("Ensure that he is able to registered account and successful message {string} is displayed")
    public void ensure_that_he_is_able_to_registered_account_and_successful_message_is_displayed(String expectedMessage) {
        RegisterAccountPage.verifyTextPresent("Your Account Has Been Created!", "There is a bug");
        Assert.assertEquals("Your Account Has Been Created!",expectedMessage, "bug be bastun");
        Browser.quit();
    }

    @When("Fill all mandatory field but for password field he provides wrong password")
    public void fill_all_mandatory_field_but_for_password_field_he_provides_wrong_password() {
        RegisterAccountPage.fillAllMandatoryFields("Pesho", "Peshev", "peshoggg123@abv.bg", "12345", "54321", "0888545454");
    }

    @Then("Ensure that registration is failure and {string} message is displayed")
    public void ensure_that_registration_is_failure_and_message_is_displayed(String expectedMessage) {
        RegisterAccountPage.verifyMessageForWongPassword("Password confirmation does not match password!", "There is a bug");
        Assert.assertEquals("Password confirmation does not match password!",expectedMessage, "bug be bastun");
        Browser.quit();
    }

    @Then("Ensure that registration warning message {string} is displayed")
    public void ensure_that_registration_warning_message_is_displayed(String expectedMessage) {
        RegisterAccountPage.verifyMandatoryPasswordLengthMessage("Password must be between 4 and 20 characters!", "There is a bug");
        Assert.assertEquals("Password must be between 4 and 20 characters!",expectedMessage, "bug be bastun");
        Browser.quit();
    }


    @When("Fill all mandatory field but for password field is provided invalid data")
    public void fill_all_mandatory_field_but_for_password_field_is_provided_invalid_data() {
        RegisterAccountPage.fillAllMandatoryFields("Pesho", "Peshev", "pesho123@abv.bg", "12", "12", "0888545454");
    }
}
