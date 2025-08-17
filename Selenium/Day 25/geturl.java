package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class geturl {
    public static void main(String[] args)   {

    	WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        driver.get("https://www.amazon.in");

        driver.navigate().back();
        
        driver.navigate().forward();

        

        String title = driver.getTitle();
        System.out.println("Page Title: " + title);

        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);

//        String pageSource = driver.getPageSource();
//        System.out.println("Page Source: ");
//        System.out.println(pageSource);

        driver.quit();
    }
}
