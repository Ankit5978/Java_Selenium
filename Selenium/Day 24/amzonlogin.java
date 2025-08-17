package selenium1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class amzonlogin {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/ankitsharma/Desktop/sel4/chromedriver-mac-arm64/chromedriver");
        System.setProperty("webdriver.chrome.silentOutput", "true");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1)); 

        
        driver.get("https://www.amazon.in");
        driver.findElement(By.id("nav-link-accountList")).click();

        
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("7018073318");

        
        driver.findElement(By.id("continue")).click();

       
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ANki123@");

        
        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();

      
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
        driver.findElement(By.id("nav-search-submit-button")).click();

        driver.findElement(By.cssSelector("#a-autoid-3-annouce")).click();

        
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        
        driver.findElement(By.id("add-to-cart-button")).click();

        
       // driver.findElement(By.xpath("//h1[contains(text(),'Added to Cart')]"));

        // Close browser
        driver.quit();
    }
}
