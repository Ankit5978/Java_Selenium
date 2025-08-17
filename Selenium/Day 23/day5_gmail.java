package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class day5_gmail {
	public static void main(String[] args) {
        // Set up ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Create an instance of ChromeDriver
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AdBytiPpCEnYHtMTS90XWcCCRn5F9pi9NXjBRdRcqpq3QBX_7mHfiHAppkduZTqp5zrmZFNJKgeYCw&osid=1&passive=1209600&service=mail&flowName=WebLiteSignIn&flowEntry=ServiceLogin&dsh=S-1877612123%3A1753273597570761");
        
        WebElement emailField = driver.findElement(By.id("identifierId"));
        emailField.sendKeys("ankiitsharma2326@gmail.com");
        
        WebElement nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
        nextButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Passwd")));
        
        WebElement passwordField = driver.findElement(By.name("Passwd"));
        passwordField.sendKeys("ANKit123@");
        nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
        nextButton.click();
        
        // Pause for manual OTP entry if 2FA is enabled
        System.out.println("Please enter the OTP manually and press Enter to continue...");
        new java.util.Scanner(System.in).nextLine();
        
        driver.quit();
    }
}