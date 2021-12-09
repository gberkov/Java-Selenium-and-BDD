package backend.pages.components;

import core.CommonBaseActions;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AdminHeader extends CommonBaseActions {

    private static final By LOGOUT_BUTTON = By.xpath("//a/span[contains(@class, 'hidden-xs')]");

    /**
     * Asserts that the expected logout button text is the same as the text that is present in the browsers' logout button
     *
     * @param expectedLogoutButtonText the text that you expect to be present in the logout button
     * @param messageOnFailure the message that will appear in your test reports in case of assert failure
     */
    public static void verifyLogoutButtonTextPresent(String expectedLogoutButtonText, String messageOnFailure) {
        String actualLogoutButtonText = getText(LOGOUT_BUTTON);
        Assert.assertEquals(actualLogoutButtonText, expectedLogoutButtonText, messageOnFailure);
    }
}
