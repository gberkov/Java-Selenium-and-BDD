package backend.pages;

import core.CommonBaseActions;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Browser;

public class AdminLogin extends CommonBaseActions {

    private static final By USERNAME_INPUT_FIELD = By.id("input-username");
    private static final By PASSWORD_INPUT_FIELD = By.id("input-password");
    private static final By LOGIN_BUTTON = By.cssSelector(".btn-primary");
    private static final By LOGIN_FORM_VALIDATION_MESSAGE_DIV = By.cssSelector(".alert-danger");

    /**
     * Opens the login page of the admin area of shop.pragmatic.bg/admin
     */
    public static void open() {
        Browser.driver.get("http://shop.pragmatic.bg/admin");
    }

    /**
     * Logs into the admin area of shop.pragmatic.bg/admin
     * with the provided credentials by entering them in the fields
     * and clicking on the login button.
     *
     * @param username the username you would like to login with
     * @param password the password you would like to login with
     */
    public static void login(String username, String password) {
        type(USERNAME_INPUT_FIELD, username);
        type(PASSWORD_INPUT_FIELD, password);
        click(LOGIN_BUTTON);
    }

    /**
     * Asserts that the validation message above the login form is as we expect it
     *
     * @param expectedValidationMessage the validation message that you expect to be shown in the browser
     * @param messageOnFailure the message that will appear in your reports in case of assert failure
     */
    public static void verifyValidationMessage(String expectedValidationMessage, String messageOnFailure) {
        String actualValidationMessage = getText(LOGIN_FORM_VALIDATION_MESSAGE_DIV);
        Assert.assertTrue(actualValidationMessage.contains(expectedValidationMessage), messageOnFailure);
    }
}
