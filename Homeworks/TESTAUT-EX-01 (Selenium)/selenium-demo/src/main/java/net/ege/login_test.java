package net.ege;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class login_test {
    public static void main(String[] args) {

        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ege\\Desktop\\drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-first-run");
        options.addArguments("--incognito");

        
        WebDriver driver = new ChromeDriver(options);

    
        driver.get("https://www.saucedemo.com/");


        
    
        System.out.println("URL açılış: " + driver.getCurrentUrl());

        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement usernameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
        usernameInput.sendKeys("standard_user");

        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        System.out.println("URL giriş sonrası: " + driver.getCurrentUrl());

        
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        
        // driver.quit();
    }
}
