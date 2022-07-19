package testclick;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class swiggy {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Automate browser\\Browser\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver ();
			
			driver.get("https://www.swiggy.com");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().window().maximize();
			
			WebElement aa = driver.findElement(By.xpath("(//a[@class ='r2iyh'])"));
         aa.click();
         
         WebElement two = driver.findElement(By.id("mobile"));
         two.sendKeys("9941029768");
         
         WebElement three = driver.findElement(By.id("name"));
         three.sendKeys("Aravind");
         
         WebElement four = driver.findElement(By.id("email"));
         four.sendKeys("msaravindmohan96@gmail.com");
         
         WebElement five = driver.findElement(By.id("password"));
         five.sendKeys("Aaravind@1996");
         
       //  WebElement log =  driver.findElement(By.xpath("//a[@class ='Login']"));
			//log.click();
         
         ///WebElement button = driver.findElement (By.xpath("//input[text()-'CONTINUE']"));
         
         //button.click();
         
         Robot r = new Robot();
         
         r.keyPress(KeyEvent.VK_TAB);
 		r.keyRelease(KeyEvent.VK_TAB);	
 		
 		r.keyPress(KeyEvent.VK_ENTER);
 		r.keyRelease(KeyEvent.VK_ENTER);
 		
         
         
         
         
         

	}

}
