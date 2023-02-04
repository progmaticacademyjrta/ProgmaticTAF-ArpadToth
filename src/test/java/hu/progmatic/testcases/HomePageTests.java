package hu.progmatic.testcases;

import hu.progmatic.driverfactory.DriverBaseTest;
import hu.progmatic.pages.HomePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class HomePageTests extends DriverBaseTest {
    HomePage homePage;

    @Test(description = "TC01: Homepage loaded test that loads the page and checks that the \"Make Appointment\" button is clickable.")
    public void homepageLoadedTest() throws InterruptedException {
        homePage = new HomePage(driver, wait);
        homePage.loadHomePage();
        homePage.isClickable();
        Thread.sleep(2000);
    }

}

