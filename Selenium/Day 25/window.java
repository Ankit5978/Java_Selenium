package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class window {

	 public static void main(String[] args) throws InterruptedException   {

	    	WebDriver driver = new ChromeDriver();
	    	driver.get("https://360homedecor.uk/book-appointment/");
	    	WebElement dropdown = driver.findElement(By.id("choose_branch")); 
	    	Select selec = new Select(dropdown);
	    	selec.selectByIndex(1);

	    	WebElement style = driver.findElement(By.id("choose_style")); 
	    	Select selc = new Select(style);
	    	selc.selectByIndex(2);
	    	
	    	 driver.findElement(By.id("first_name")).sendKeys("ankit");

	            driver.findElement(By.id("last_name")).sendKeys("sharma");

	            driver.findElement(By.id("apt_city")).sendKeys("chnadigarh");
	           
	            
	            driver.findElement(By.id("phone_number")).sendKeys("9876543210");
	            driver.findElement(By.id("email")).sendKeys("ankit@gmail.com");
	          
	            driver.findElement(By.id("layoutFiles")).sendKeys("/Users/ankitsharma/Downloads/Resume5.pdf");

	            
	            WebElement checkbox = driver.findElement(By.id("privacyPolicy"));

	        
	         if (!checkbox.isSelected()) {
	             checkbox.click();
	         }
	         
	         driver.findElement(By.className("btn show-deal-button btn-block")).click();

	            Thread.sleep(3000);
	    	
	 }
}
