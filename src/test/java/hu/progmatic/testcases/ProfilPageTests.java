package hu.progmatic.testcases;

import hu.progmatic.driverfactory.DriverBaseTest;
import hu.progmatic.pages.ProfilPage;
import org.testng.annotations.Test;

public class ProfilPageTests extends DriverBaseTest {

    ProfilPage profilPage;

    @Test(description = "TC04: checks that the Profile page loads successfully")
    public void ProfilPageLoadedTest() throws InterruptedException {
        profilPage = new ProfilPage(driver, wait);
        profilPage.loadProfilPage();
        profilPage.isPageLoaded(driver);
        Thread.sleep(2000);
    }
}
