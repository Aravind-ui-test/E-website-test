package Seleniumopen;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.zeromq.ZMonitor.Event;

public class robotssssssss {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Automate browser\\Browser\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		Robot r = new Robot();
		
		WebElement dr = driver.findElement(By.id("email"));
		
		dr.sendKeys("msaravindhmohan96@gmail.com");
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);	
		
WebElement vr = driver.findElement(By.id("pass"));
		
		vr.sendKeys("Aravind@1997");
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);	
       r.keyPress(KeyEvent.VK_TAB);
       r.keyRelease(KeyEvent.VK_TAB);	
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyRelease(KeyEvent.VK_TAB);	
//		
//		r.keyPress(KeyEvent.VK_ENTER);
//		
//		r.keyRelease(KeyEvent.VK_ENTER);
	}

}
