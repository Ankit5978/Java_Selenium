package selenium1;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class browsername {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/ankitsharma/Desktop/sel4/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Get browser name
        Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
        String browserName = caps.getBrowserName();
        caps.setcapability("browser version","128");
        System.out.println("Browser Name: " + browserName +"  platformname  "+ caps.getPlatformName());
       
        driver.quit();
    }
}
