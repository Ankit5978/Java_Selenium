package selenium1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
    public static void main(String[] args) {
        // Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");

        // Your Facebook credentials
        String email = "your_facebook_email";
        String password = "your_facebook_password";

        // Open browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open Facebook
        driver.get("https://www.facebook.com/");

        // Fill email & password
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("pass")).sendKeys(password);

        // Click login
        driver.findElement(By.name("login")).click();
    }
}
