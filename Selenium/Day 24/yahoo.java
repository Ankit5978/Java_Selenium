package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahoo {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/ankitsharma/Desktop/sel4/chromedriver-mac-arm64/chromedriver");

        String username = "ankit@myyahoo.com";
        String password = "67Q_RJijZB9Tp2*";

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://login.yahoo.com/");

        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys(username);
        driver.findElement(By.id("login-signin")).click();

        Thread.sleep(2000);

        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys(password);
        driver.findElement(By.id("login-signin")).click();

        Thread.sleep(3000); 

        System.out.println("Login attempted");

        driver.quit();
    }
}
