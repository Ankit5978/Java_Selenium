package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram {

    public static void main(String[] args) throws InterruptedException {
        // Path to ChromeDriver
        System.setProperty("webdriver.chrome.driver", "/Users/ankitsharma/Desktop/sel4/chromedriver-mac-arm64/chromedriver");

        // Instagram credentials
        String username = "ayushsharma4842@gmail.com";
        String password = "ANki123@";

        // Launch Chrome
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open Instagram login page
        driver.get("https://www.instagram.com/accounts/login/");

        Thread.sleep(5000); // Wait for page to load

        // Enter username (class name of the input field)
        WebElement userField = driver.findElement(By.name("username"));
        WebElement passwordField = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));

        Thread.sleep(5000); // Wait for login to complete

        // Check if login successful
       

        driver.quit();
    }
}
