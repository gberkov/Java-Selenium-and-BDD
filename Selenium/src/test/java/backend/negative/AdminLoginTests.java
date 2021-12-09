package backend.negative;

import backend.pages.AdminLogin;
import core.BaseTest;
import org.testng.annotations.Test;

public class AdminLoginTests extends BaseTest {

    @Test
    public void unsuccessfulLogin() {
        AdminLogin.open();
        AdminLogin.login("dfsdafdasf", "dasfasdfdasf");
        AdminLogin.verifyValidationMessage("No match for Username and/or Password.",
                "The validation 'No match for Username and/or Password.' was not present, file a bug!");
    }

}
