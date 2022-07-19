package Task3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class train {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Automate browser\\Browser\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.cleartrip.com/trains");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		WebElement from = driver.findElement(By.id("from_station"));
		
		from.sendKeys("Chennai Beach (MSB)");
		
WebElement to = driver.findElement(By.id("from_station"));
		
		to.sendKeys("Bangalore Cant (BNC)");
		
WebElement traincls = driver.findElement(By.id("trainClass"));
		
traincls.click();

Robot r = new Robot();

r.keyPress(KeyEvent.VK_DOWN);

r.keyRelease(KeyEvent.VK_DOWN);

r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);


WebElement date = driver.findElement(By.id("dpt_date"));

date.sendKeys("19/6/2022");

r.keyPress(KeyEvent.VK_TAB);

r.keyRelease(KeyEvent.VK_TAB);

r.keyPress(KeyEvent.VK_TAB);

r.keyRelease(KeyEvent.VK_TAB);

r.keyPress(KeyEvent.VK_ENTER);
	 r.keyRelease(KeyEvent.VK_ENTER);
	 
	 
	 r.keyPress(KeyEvent.VK_DOWN);

	 r.keyRelease(KeyEvent.VK_DOWN);
	 
	 r.keyPress(KeyEvent.VK_DOWN);

	 r.keyRelease(KeyEvent.VK_DOWN);

	 r.keyPress(KeyEvent.VK_ENTER);
	 r.keyRelease(KeyEvent.VK_ENTER);
	 
	 
	 WebElement button = driver.findElement(By.id("trainFormButton"));
		
	 button.click();

	 
	 
	}

}
