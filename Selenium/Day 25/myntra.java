package selenium1;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myntra {
    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        // Open Myntra
        driver.get("https://www.myntra.com/");
        
        // Click Profile icon
        driver.findElement(By.xpath("//span[text()='Profile']")).click();
        
        // Click on Login/Signup
        driver.findElement(By.xpath("//a[text()='login / Signup']")).click();
        
        // Enter mobile number
        WebElement mobileBox = driver.findElement(By.xpath("//input[@type='tel']"));
        mobileBox.sendKeys("7018073318");  // <-- Replace with your number
        driver.findElement(By.xpath("//div[text()='CONTINUE']")).click();
        
        System.out.println("Please enter OTP manually...");
        Thread.sleep(20000); // wait for you to enter OTP
        
        // After OTP entry, Myntra will log you in automatically
        
        // ==== SEARCH & ADD PRODUCT ====
        
        // Search for product
        WebElement searchBox = driver.findElement(By.className("desktop-searchBar"));
        searchBox.sendKeys("tshirt");
        driver.findElement(By.className("desktop-submit")).click();
        
        // Click first product
        driver.findElement(By.xpath("(//li[@class='product-base'])[1]")).click();
        
        // Switch to new tab
        for (String tab : driver.getWindowHandles()) {
            driver.switchTo().window(tab);
        }
        
        // Select first available size
        driver.findElement(By.xpath("(//div[@class='size-buttons-size-container'])[1]")).click();
        
        // Click Add to Bag
        driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
        
        System.out.println("Product added to bag successfully!");
        driver.quit();
    }
}
