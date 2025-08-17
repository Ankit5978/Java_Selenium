package selenium1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class day5_fileupload {
    public static void main(String[] args) {
        Properties props = new Properties();
        WebDriver driver = null;

        try {
           
            FileInputStream fis = new FileInputStream("/Users/ankitsharma/Desktop/sel3/config.properties.txt");
            props.load(fis);

            String email = props.getProperty("naukri.email");
            String password = props.getProperty("naukri.password");
            String resumePath = props.getProperty("resume.path");
         //   String chromeDriverPath = props.getProperty("chromedriver.path");

            System.setProperty("webdriver.chrome.driver", "/Users/ankitsharma/Desktop/sel4/chromedriver-mac-arm64/chromedriver");

           
            driver = new ChromeDriver();
            driver.manage().window().maximize();

            driver.get("https://www.naukri.com/nlogin/login");

            
            driver.findElement(By.id("usernameField")).sendKeys(email);
            driver.findElement(By.id("passwordField")).sendKeys(password);
            driver.findElement(By.xpath("//button[text()='Login']")).click();

            Thread.sleep(3000); 
            driver.get("https://www.naukri.com/mnjuser/profile");

            
            WebElement uploadBtn = driver.findElement(By.id("attachCV"));
            uploadBtn.sendKeys(resumePath);

            System.out.println("Resume uploaded successfully!");

        } catch (IOException e) {
            System.out.println("Error reading properties file: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error during automation: " + e.getMessage());
        } finally {
            
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
