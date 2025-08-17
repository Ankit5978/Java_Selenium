package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class newTab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "/Users/ankitsharma/Desktop/sel4/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       
       driver.get("https://www.google.com");
       Thread.sleep(2000);
       
       driver.switchTo().newWindow(WindowType.TAB);
       driver.get("https://www.facebook.com");
       Thread.sleep(2000);
       
       driver.switchTo().newWindow(WindowType.TAB);
       driver.get("https://www.facebook.com");
       Thread.sleep(2000);
       
	}

}
