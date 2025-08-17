package selenium1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;

        
        System.setProperty("webdriver.chrome.driver", "/Users/ankitsharma/Desktop/sel4/chromedriver-mac-arm64/chromedriver");
        System.setProperty("webdriver.chrome.silentOutput", "true");

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://mail.google.com/");

        Thread.sleep(2000);

        driver.findElement(By.id("identifierId")).sendKeys("ankiitsharma2326@gmail.com");

       
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Next']")).click();

        Thread.sleep(3000);
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("ANKit123@");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Next']")).click();

        Thread.sleep(5000);
        driver.quit();
    }
}
