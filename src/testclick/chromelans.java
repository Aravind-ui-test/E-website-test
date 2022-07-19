package testclick;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromelans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Automate browser\\Browser\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver ();
			
			driver.get("http://greenstech.in/selenium-course-content.html");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().window().maximize();
	}

}
