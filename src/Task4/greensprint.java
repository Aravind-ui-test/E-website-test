package Task4;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class greensprint {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Automate browser\\Browser\\chromedriver.exe");

WebDriver driver = new ChromeDriver ();

driver.get("http://www.greenstechnologys.com ");

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.manage().window().maximize();


WebElement news= driver.findElement(By.xpath("//a[text()='Software Testing']"));
  
news.click();


Actions a = new Actions(driver);

a.contextClick().perform();

Robot r = new Robot();

for (int i =0; i<4; i++) {
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_TAB);

	}

r.keyPress(KeyEvent.VK_ENTER);

r.keyRelease(KeyEvent.VK_ENTER);


//WebElement HERO= driver.findElement(By.xpath("//div[text()='Print']"));
//
//HERO.click();


r.keyPress(KeyEvent.VK_ENTER);

r.keyRelease(KeyEvent.VK_ENTER);


}
}
