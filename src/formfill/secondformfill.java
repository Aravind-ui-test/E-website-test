package formfill;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class secondformfill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Automate browser\\Browser\\chromedriver.exe");
		
    WebDriver driver = new ChromeDriver ();
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		//WebElement buttomclk = driver.findElement(By.xpath("//a[@ href ='Selenium Training']"));
	    //buttomclk.click();
	}

}
