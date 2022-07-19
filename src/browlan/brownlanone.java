package browlan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class brownlanone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Automate browser\\Browser\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver ();
	    
	    driver.get("https://www.flipkart.com/");
	}

}
