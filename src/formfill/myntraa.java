package formfill;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myntraa {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Automate browser\\Browser\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver ();
	    
	    
	    
	    driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	    
	    WebElement mails =   driver.findElement(By.xpath("//input[@ autocomplete ='new-password']"));
	    
	    mails.sendKeys("9176650809");
	    
          WebElement clk =   driver.findElement(By.xpath("//div[@ class ='submitBottomOption']"));
	    
	   clk.click();
	   
	}

}
