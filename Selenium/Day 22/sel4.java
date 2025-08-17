package selenium1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel4 {
    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "/Users/ankitsharma/Desktop/sel4/chromedriver-mac-arm64/chromedriver");

     
        WebDriver driver = new ChromeDriver();

        // 3️⃣ Open Google
        driver.get("https://google.com");
        System.out.println("Title: " + driver.getTitle());

        // 4️⃣ Close browser
        driver.quit();
    }
}
