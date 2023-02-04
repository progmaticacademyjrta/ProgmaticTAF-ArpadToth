package hu.progmatic.testcases;

import hu.progmatic.driverfactory.DriverBaseTest;
import hu.progmatic.pages.AppointmentPage;
import hu.progmatic.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AppointmentPageTests extends DriverBaseTest {

    AppointmentPage appointmentPage;

    @Test(description = "TC03: Create 1 test on the login page that checks if the user receives an error message with incorrect login details.")
    public void appointmentTest() throws InterruptedException {
        driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");
        System.out.println("Login page loaded properly.");
        Thread.sleep(2000);
        WebElement username = driver.findElement(By.id("txt-username"));
        WebElement password = driver.findElement(By.id("txt-password"));
        WebElement submit = driver.findElement(By.id("btn-login"));

        username.sendKeys("John Doe");
        password.sendKeys("ThisIsNotAPassword");
        submit.click();
        System.out.println("Login done with correct values.");

        appointmentPage = new AppointmentPage(driver, wait);
        appointmentPage.loadAppointmentPage();
        Thread.sleep(2000);
        appointmentPage.makeAnAppointment();
        Thread.sleep(2000);


    }



}
