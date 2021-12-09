package frontend.pages;

import core.CommonBaseActions;
import org.openqa.selenium.By;
import org.testng.Assert;


public class RegisterAccountPage extends CommonBaseActions {

    private static final By FIRST_NAME_FILED = By.id("input-firstname");
    private static final By LAST_NAME_FILED = By.id("input-lastname");
    private static final By EMAIL_FILED = By.id("input-email");
    private static final By PASSWORD_FILED = By.id("input-password");
    private static final By CONFIRM_PASSWORD_FILED = By.id("input-confirm");
    private static final By TELEPHONE_FILED = By.id("input-telephone");
    private static final By PRIVACY_POLICY_CHECKBOX = By.cssSelector("input[name='agree']");
    private static final By CONTINUE_BUTTON = By.cssSelector("input[value='Continue']");
    private static final By LOGIN_VALIDATION_MESSAGE = By.id("content");
    private static final By MESSAGE_FOR_WRONG_PASSWORD = By.xpath("//div[contains(text(),'Password confirmation does not match password!')]");
    private static final By MANDATORY_PASSWORD_LENGTH_MESSAGE= By.xpath("//div[contains(text(),'Password must be between 4 and 20 characters!')]");





    /**
     * To successfully register an account, all required fields must be filled out
     * @param firstName
     * @param lastName
     * @param email
     * @param password
     * @param confirmPassword
     * @param telephone
     */

    public static void fillAllMandatoryFields(String firstName, String lastName, String email, String password, String confirmPassword, String telephone) {
        type(FIRST_NAME_FILED, firstName);
        type(LAST_NAME_FILED, lastName);
        type(EMAIL_FILED, email);
        type(PASSWORD_FILED, password);
        type(CONFIRM_PASSWORD_FILED, confirmPassword);
        type(TELEPHONE_FILED, telephone);
        getElement(PRIVACY_POLICY_CHECKBOX);
        click(PRIVACY_POLICY_CHECKBOX);
        click(CONTINUE_BUTTON);
    }


    /**
     * Asserts that the validation text for successfully register an account is present
     */
    public static void verifyTextPresent(){
        Assert.assertTrue(isTextPresent(LOGIN_VALIDATION_MESSAGE, "Your Account Has Been Created!"));
    }

    /**
     * Second way for assert
     * Asserts that the validation text for successfully register an account is present
     * @param expectedValidationMessage
     * @param messageOnFailure
     */
    public static void verifyTextPresent(String expectedValidationMessage, String messageOnFailure) {
        String actualValidationMessage = getText(LOGIN_VALIDATION_MESSAGE);
        Assert.assertTrue(actualValidationMessage.contains(expectedValidationMessage), messageOnFailure);
    }


    /**
     * Asserts that the text for incorrectly entered confirmation password is present
     * @param expectedMessage
     * @param messageOnFailure
     */
    public static void verifyMessageForWongPassword(String expectedMessage, String messageOnFailure) {
        String actualMessage = getText(MESSAGE_FOR_WRONG_PASSWORD);
        Assert.assertEquals(actualMessage, expectedMessage ,messageOnFailure);
    }

    /**
     * Asserts whether the password length message is present
     * @param expectedMessage
     * @param messageOnFailure
     */
    public static void verifyMandatoryPasswordLengthMessage(String expectedMessage, String messageOnFailure){
        String actualMessage = getText(MANDATORY_PASSWORD_LENGTH_MESSAGE);
        Assert.assertEquals(actualMessage, expectedMessage ,messageOnFailure);
    }

}
