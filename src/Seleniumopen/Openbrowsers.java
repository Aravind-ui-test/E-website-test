package Seleniumopen;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openbrowsers {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Automate browser\\Browser\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
driver.get("https://www.redbus.in/");

//String url = driver.getCurrentUrl();

//System.out.println(url);

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(19));
driver.manage().window().maximize();


 // WebElement buttomclk = driver.findElement(By.id("hc"));
  // buttomclk.click();
   
   WebElement two = driver.findElement(By.id("i-icon-profile"));
   two.click();
   
   WebElement ase = driver.findElement(By.id("hc"));
   ase.click();
   
   //WebElement phno = driver.findElement(By.id("rh_main"));
   //phno.sendKeys("9176");
   
   Robot r = new Robot();
   

	WebElement textuser	= driver.findElement(By.id("mobileNoInp"));
	textuser.sendKeys("9176650809");
	
	
	//WebElement textpass	=driver.findElement(By.name("password"));
	//textpass.sendKeys("Aravind@0309");
	
	//WebElement buttomclk = driver.findElement(By.id("nav-search-submit-button"));
     //buttomclk.click();

//List <WebElement> pass = driver.findElement(By.xpath("//input [@type ='text']")); 
//WebElement we = pass.get(1);



  //WebElement mail = driver.findElement(By.xpath("//input[@type ='text']"));
  //mail.sendKeys("Aravind");
  
  
 
 
 
 
 //WebElement bun = driver.findElement(By.xpath("//button[@ type ='submit']"));
 
 //bun.click();
 
   r.keyPress(KeyEvent.VK_TAB);
	 r.keyRelease(KeyEvent.VK_TAB);
 


	}

}
