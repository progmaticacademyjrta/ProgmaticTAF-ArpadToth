package hu.progmatic.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ProfilPage {

    WebDriver driver;
    WebDriverWait wait;

    public ProfilPage (WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void loadProfilPage() {
        driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#profile");
        System.out.println("Profile page loaded.");

    }


    public void isPageLoaded (WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        boolean status = js.executeScript("return document.readyState").toString().equals("complete");
        if (status) {
            System.out.println("Page is loaded completely");
        }
        else
        {
            System.out.println("Page is not loaded completely");
        }
    }


}
