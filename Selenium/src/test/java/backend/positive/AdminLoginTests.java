package backend.positive;

import backend.pages.AdminLogin;
import backend.pages.components.AdminHeader;
import core.BaseTest;
import org.testng.annotations.Test;

public class AdminLoginTests extends BaseTest {

    @Test
    public void successfulLogin() {
        AdminLogin.open();
        AdminLogin.login("admin", "parola123!");
        AdminHeader.verifyLogoutButtonTextPresent("Logout"
                ,"There was no logout text present, so we have a bug, probably not logged in.");
    }


}
