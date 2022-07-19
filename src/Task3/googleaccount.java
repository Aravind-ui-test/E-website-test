package Task3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleaccount {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Automate browser\\Browser\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
	WebElement fstname =	driver.findElement(By.id("firstName"));
	
	fstname.sendKeys("Venki");
	
WebElement lstname =	driver.findElement(By.id("lastName"));
	
lstname.sendKeys("monkey");

WebElement ful =	driver.findElement(By.id("username"));

ful.sendKeys("monkeyVenki45a555");


WebElement pass =	driver.findElement(By.xpath("//input[@type='password']"));

pass.sendKeys("Aravind@1997");

WebElement lpass =	driver.findElement(By.name("ConfirmPasswd"));

lpass.sendKeys("Aravind@1997");

Robot r = new Robot();
for (int i =0; i<2; i++)
{
				r.keyPress(KeyEvent.VK_TAB);

				r.keyRelease(KeyEvent.VK_TAB);
		
	}

r.keyPress(KeyEvent.VK_ENTER);

r.keyRelease(KeyEvent.VK_ENTER);

WebElement phn =	driver.findElement(By.id("yDmH0d"));

phn.sendKeys("7200411993");


	}

}
