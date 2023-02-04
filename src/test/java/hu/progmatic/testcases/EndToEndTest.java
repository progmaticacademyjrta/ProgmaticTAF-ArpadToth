package hu.progmatic.testcases;

import hu.progmatic.driverfactory.DriverBaseTest;
import hu.progmatic.pages.AppointmentPage;
import hu.progmatic.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class EndToEndTest extends DriverBaseTest {

    EndToEndTest endToEndTest;

    @Test(description = "TC05: the booking process from start to finish")
    public void EndToEndProcess() throws InterruptedException {
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
        Thread.sleep(2000);

        Select facility = new Select(driver.findElement(By.id("combo_facility")));
        facility.selectByVisibleText("Tokyo CURA Healthcare Center");
        WebElement radio1 = driver.findElement(By.id("radio_program_medicaid"));
        radio1.click();
        WebElement dateBox = driver.findElement(By.id("txt_visit_date"));
        dateBox.sendKeys("04022023");
        WebElement comment = driver.findElement(By.id("txt_comment"));
        comment.sendKeys("Hello Test");
        Thread.sleep(2000);
        WebElement button = driver.findElement(By.id("btn-book-appointment"));
        button.click();
        Thread.sleep(2000);

        WebElement hamburger = driver.findElement(By.xpath("//i[@class='fa fa-bars']"));
        hamburger.click();

        WebElement logout = driver.findElement(By.xpath("//a[normalize-space()='Logout']"));
        logout.click();
        Thread.sleep(3000);


    }


}
