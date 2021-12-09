package frontend.negative;

import core.BaseTest;
import frontend.pages.HomePage;
import frontend.pages.RegisterAccountPage;
import frontend.pages.components.Header;
import org.testng.annotations.Test;

public class RegisterAccountTest extends BaseTest {

    @Test
    public void unsuccessfullyRegisteredAccount() {
        HomePage.open();
        Header.goToRegisterAccount();
        RegisterAccountPage.fillAllMandatoryFields("Pesho", "Peshev", "pesho123@abv.bg", "12345", "54321", "0888545454");
        RegisterAccountPage.verifyMessageForWongPassword("Password confirmation does not match password!", "There is a bug");
    }


}
