package frontend.positive;

import core.BaseTest;
import frontend.pages.HomePage;
import frontend.pages.RegisterAccountPage;
import frontend.pages.components.Header;
import org.testng.annotations.Test;

public class RegisterAccountTest extends BaseTest {


    @Test
    public void successfullyRegisteredAccount(){
        HomePage.open();
        Header.goToRegisterAccount();
        RegisterAccountPage.fillAllMandatoryFields("Pesho", "Peshev", "ижан11233@abv.bg", "12345", "12345", "0888545454");
        //Another assert
        //RegisterAccountPage.verifyTextPresent();
        RegisterAccountPage.verifyTextPresent("Your Account Has Been Created!", "There is a bug");
    }

    @Test
    public void passwordMustBeBetween40and20Characters(){
        HomePage.open();
        Header.goToRegisterAccount();
        RegisterAccountPage.fillAllMandatoryFields("Pesho", "Peshev", "pesho123@abv.bg", "12", "12", "0888545454");
        RegisterAccountPage.verifyMandatoryPasswordLengthMessage("Password must be between 4 and 20 characters!", "There is a bug");
    }
}
