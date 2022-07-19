package Task3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Automate browser\\Browser\\chromedriver.exe");
		
       WebDriver driver = new ChromeDriver ();
	    
	    
	    driver.get("https://www.amazon.in/");
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		 WebElement serc =   driver.findElement(By.id("twotabsearchtextbox"));
		
		 serc.sendKeys ("Iphone");
		
		 ////input[@type='submit']
		 
		WebElement clk =  driver.findElement(By.id("nav-search-submit-button"));
		 clk.click();
	}

}
