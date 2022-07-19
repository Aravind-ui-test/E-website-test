package testclick;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class openbrowsersss {
	
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Automate browser\\Browser\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver ();
			
			driver.get("http://greenstech.in/selenium-course-content.html");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().window().maximize();
			
			//WebElement wase = driver.findElement(By.xpath("//div[@data-parent ='#interview-question-accordion']"));
			
			//wase.click();
			
WebElement wase = driver.findElement(By.id("heading20"));
			
		wase.click();
		
		//List <WebElement> zev = driver.findElements(By.id("heading20"));
	      
	  	 //WebElement enter = zev.get(5);
	  	      
	  //enter.click();
	  
	  Robot r = new Robot();
	 
	  for (int i=0; i<7; i++) {
		  
		  r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
	  }
	  	
		
		
		
r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
		
	}
	

}
