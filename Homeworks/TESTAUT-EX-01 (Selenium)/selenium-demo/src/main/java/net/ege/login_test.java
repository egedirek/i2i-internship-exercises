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

        // ChromeDriver yolu
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ege\\Desktop\\drivers\\chromedriver.exe");

        // ChromeOptions ile gizli mod
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--no-first-run");
        options.addArguments("--incognito");

        // Driver başlat
        WebDriver driver = new ChromeDriver(options);

        // Siteye git
        driver.get("https://www.saucedemo.com/");

        // URL yazdır
        System.out.println("URL açılış: " + driver.getCurrentUrl());

        // Bekleme
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Kullanıcı adı alanını bekle
        WebElement usernameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
        usernameInput.sendKeys("standard_user");

        // Şifre alanını doldur
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        // Login butonuna tıkla
        driver.findElement(By.id("login-button")).click();

        // Login sonrası URL
        System.out.println("URL giriş sonrası: " + driver.getCurrentUrl());

        // 10 saniye bekle
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Tarayıcıyı kapat
        driver.quit();
    }
}
