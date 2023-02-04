package hu.progmatic.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.support.ui.Select;





public class AppointmentPage {

    WebDriver driver;
    WebDriverWait wait;

    public AppointmentPage (WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void loadAppointmentPage() {
        driver.get("https://katalon-demo-cura.herokuapp.com/#appointment");
        System.out.println("Appointment page loaded properly.");
    }

    public void makeAnAppointment() {
        Select facility = new Select(driver.findElement(By.id("combo_facility")));
        facility.selectByVisibleText("Tokyo CURA Healthcare Center");
        WebElement radio1 = driver.findElement(By.id("radio_program_medicaid"));
        radio1.click();
        WebElement dateBox = driver.findElement(By.id("txt_visit_date"));
        dateBox.sendKeys("04022023");
        WebElement comment = driver.findElement(By.id("txt_comment"));
        comment.sendKeys("Hello Test");
        WebElement button = driver.findElement(By.id("btn-book-appointment"));
        button.click();
    }

}
