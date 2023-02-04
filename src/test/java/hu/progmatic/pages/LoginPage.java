package hu.progmatic.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void loadLoginPage() {
        driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");
        System.out.println("Login page loaded properly.");
    }

    public void loginErrorMessage(){
        WebElement username = driver.findElement(By.id("txt-username"));
        WebElement password = driver.findElement(By.id("txt-password"));
        WebElement submit = driver.findElement(By.id("btn-login"));

        username.sendKeys("abc");
        password.sendKeys("123");
        submit.click();
        System.out.println("Login done with wrong values.");

        WebElement loginFailed = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='lead text-danger']")));
        Assert.assertTrue(loginFailed.isDisplayed(),"Error message found");
    }

    public void loginCorrect(){
        WebElement username = driver.findElement(By.id("txt-username"));
        WebElement password = driver.findElement(By.id("txt-password"));
        WebElement submit = driver.findElement(By.id("btn-login"));

        username.sendKeys("John Doe");
        password.sendKeys("ThisIsNotAPassword");
        submit.click();
        System.out.println("Login done with correct values.");
    }


}
