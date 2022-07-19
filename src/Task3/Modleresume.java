package Task3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Modleresume {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Automate browser\\Browser\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("http://greenstech.in/selenium-course-content.html\r\n");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		WebElement clickz = driver.findElement(By.id("heading201"));	
				clickz.click();
				
				Robot r = new Robot();
for (int i =0; i<2; i++)
{
				r.keyPress(KeyEvent.VK_TAB);

				r.keyRelease(KeyEvent.VK_TAB);
		
	}

r.keyPress(KeyEvent.VK_ENTER);

r.keyRelease(KeyEvent.VK_ENTER);

}
}