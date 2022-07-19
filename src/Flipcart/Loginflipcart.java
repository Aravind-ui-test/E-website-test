package Flipcart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginflipcart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Automate browser\\Browser\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.amazonss.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		//WebElement log =  driver.findElement(By.xpath("//input[@type ='text']"));
		//log.sendKeys("venki");
//		
//		WebElement log =  driver.findElement(By.xpath("//a[@class ='Login']"));
//			log.click();
//			
//			WebElement logr =  driver.findElement(By.xpath("//input[@type ='text']"));
//			logr.sendKeys("venki");
	}

}
