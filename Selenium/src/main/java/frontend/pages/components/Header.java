package frontend.pages.components;

import core.CommonBaseActions;
import org.openqa.selenium.By;

public class Header extends CommonBaseActions {

    private static final By MY_ACCOUNT = By.cssSelector("a[title='My Account']");
    private static final By MY_ACCOUNT_DROP_DOWN_REGISTER = By.xpath("(//a[contains(text(),'Register')])[1]");

    /**
     * Go to menu where an account can be registered. There is implementation of custom explicit waits as well.
     */
    public static void goToRegisterAccount() {
        elementToBeClickableWithExplicitWait(MY_ACCOUNT, 2);
        click(MY_ACCOUNT);
        elementToBeVisibleWithExplicitWait(MY_ACCOUNT_DROP_DOWN_REGISTER,4);
        click(MY_ACCOUNT_DROP_DOWN_REGISTER);

    }
}
