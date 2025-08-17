package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/ankitsharma/Desktop/sel4/chromedriver-mac-arm64/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open Amazon login page
        driver.get("https://www.amazon.in");
        WebElement signInLink = driver.findElement(By.id("nav-link-accountList"));
        signInLink.click();

        // Enter email/phone using XPath
        WebElement emailField = driver.findElement(By.xpath("//input[@name='email']"));
        emailField.sendKeys("7018073318");

        // Click Continue button using XPath
        WebElement continueBtn = driver.findElement(By.id("continue"));
        continueBtn.click();
        Thread.sleep(2000);

        // Enter password using XPath
        WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
        passwordField.sendKeys("ANki123@");
        Thread.sleep(1000);

        // Click Sign-In button using XPath
        WebElement signInButton = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
        signInButton.click();
        Thread.sleep(5000); // wait for login to complete

        // Close browser
        driver.quit();
    }
}
