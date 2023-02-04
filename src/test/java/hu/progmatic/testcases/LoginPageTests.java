package hu.progmatic.testcases;

import hu.progmatic.driverfactory.DriverBaseTest;
import hu.progmatic.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginPageTests extends DriverBaseTest {

    LoginPage loginPage;

    @Test(description = "TC02: Create 1 test on the login page that checks if the user receives an error message with incorrect login details.")
    public void invalidLogin() throws InterruptedException {
        loginPage = new LoginPage(driver, wait);
        loginPage.loadLoginPage();
        Thread.sleep(2000);
        loginPage.loginErrorMessage();
        Thread.sleep(2000);
    }
}
