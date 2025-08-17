package selenium1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettitle {
	 public static void main(String[] args) throws InterruptedException   {

	    	WebDriver driver = new ChromeDriver();
	    	
	    	
	    	
            driver.get("https://demo.automationtesting.in/Alerts.html");

           
            driver.findElement(By.id("OKTab")).click();

	    	Alert alrt=driver.switchTo().alert();
	    	Thread.sleep(4000);

	    	alrt.accept();
	    	Thread.sleep(2000);
	 }
}
