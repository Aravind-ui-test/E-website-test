package Task3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class automateformfill {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Automate browser\\Browser\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		
		Actions a = new Actions(driver);
		
		//WebElement buttomclk = driver.findElement(By.xpath("//a[@ href ='Selenium Training']"));
	    //buttomclk.click();
		
		 WebElement name = driver.findElement(By.xpath("//input[@type ='text']"));
		  name.sendKeys("Aravind");
		  
		  WebElement second = driver.findElement(By.xpath("//input[@placeholder ='Last Name']"));
		  second.sendKeys("Mohan");
		  
		  WebElement add = driver.findElement(By.xpath("//textarea[@ng-model ='Adress']"));
		  add.sendKeys("106/66 Pillayar kovil street jafferkhanpet chennai");
		  
		  
		WebElement mails =  driver.findElement(By.xpath("//input[@type = 'email']"));
		
		mails.sendKeys("msaravindhmohan96@gmail.com");
		
		WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
		
		phone.sendKeys("9176650809");
		
		WebElement buttomclk = driver.findElement(By.xpath("//input[@value = 'Male']"));
	    buttomclk.click();
		  
	    WebElement buttontwo = driver.findElement(By.xpath("//input[@value = 'Cricket']"));
	    
	    buttontwo.click();
	    
	   WebElement lant =  driver.findElement(By.xpath("//div[@ id ='msdd']"));
		
	      lant.click();
	    
    // WebElement lang =  driver.findElement(By.xpath("//a[@ class ='Arabic']"));
		
      //lang.click();
	      
	     List <WebElement> lis = driver.findElements(By.xpath("//a[@ style ='text-decoration:none']"));
	      
	      WebElement we = lis.get(4);
	      
	     we.click();
	      
	  //WebElement skill =   driver.findElement(By.id("Skills"));
	      
	    //skill.click();
	      
	     //WebElement demo = driver.findElement(By.xpath("//input[@value = 'Hockey']"));
		    
	     //demo.click();
	     
	     // WebElement skill =  driver.findElement(By.xpath("//select[@ id ='Skills']"));
			
	      //skill.click();
	      
	     //driver.quit();
	     
	  
	      
	     WebElement buttononce = driver.findElement(By.xpath("//input[@value = 'Hockey']"));
		    
	     buttononce.click();
	      
	     
	     WebElement skill =  driver.findElement(By.xpath("//select[@ id ='Skills']"));
			
	      skill.click();
	      
  //  List <WebElement> jas = driver.findElements(By.id("Skills"));
	      
	//      WebElement ms = jas.get(4);
	      
	  //    ms.click();
	      
	      WebElement tryo =  driver.findElement(By.xpath("//option[@ value ='Adobe InDesign']"));
			
	     tryo.click();
	     
	     WebElement skillss =  driver.findElement(By.xpath("//span[@ class ='select2-selection__arrow']"));
			
	      skillss.click();
	      
	      
	   // WebElement ind =  driver.findElement(By.xpath("//Span[@title ='Australia']"));
			
	// ind.sendKeys("Australia");
	      
	      
	     //List <WebElement> zev = driver.findElements(By.xpath("//ul[@role ='tree']"));
	      
	  	 // WebElement enter = zev.get(3);
	  	      
	  	//enter.click();
	     
	// WebElement az =  driver.findElement(By.xpath("//span[@ class ='select2-selection__rendered']"));
		
	// az.sendKeys("Bangladesh");
	      
	    //WebElement az =  driver.findElement(By.xpath("//input[@ type ='search']"));
			
	//   az.sendKeys("Bangladesh");
	   
	 //span[@role ='presentation']
	   
	  // WebElement az =  driver.findElement(By.xpath("//span[@role ='presentation']"));
		
	   //az.click();
	   
	     //WebElement wastes =  driver.findElement (By.xpath ("//span[@ aria-selected = 'Australia'") );
	     //wastes.click();
	     
	     Robot r = new Robot();
	     for (int i=0; i<5;i++) 
	     {
	    	 r.keyPress(KeyEvent.VK_DOWN);
	    	 r.keyRelease(KeyEvent.VK_DOWN);
	     }
	    
	     
	     r.keyPress(KeyEvent.VK_ENTER);
    	 r.keyRelease(KeyEvent.VK_ENTER);
	     
	    WebElement year =  driver.findElement(By.id("yearbox"));
           year.sendKeys("1996");
           
          // WebElement mon =  driver.findElement(By.xpath("//select[@ng-init='monthbox']"));
           //mon.click();
           
          
           r.keyPress(KeyEvent.VK_TAB);
      	 r.keyRelease(KeyEvent.VK_TAB);
      	 
      	r.keyPress(KeyEvent.VK_ENTER);
   	 r.keyRelease(KeyEvent.VK_ENTER);
   	 
   	for (int i=0; i<9;i++) 
    {
   	 r.keyPress(KeyEvent.VK_DOWN);
   	 r.keyRelease(KeyEvent.VK_DOWN);
    }
	r.keyPress(KeyEvent.VK_ENTER);
  	 r.keyRelease(KeyEvent.VK_ENTER);
   
  	 r.keyPress(KeyEvent.VK_TAB);
  	 r.keyRelease(KeyEvent.VK_TAB); 
  	 
 	r.keyPress(KeyEvent.VK_ENTER);
  	 r.keyRelease(KeyEvent.VK_ENTER);
  	 
  	 for (int i =0; i<3; i++)
  	 {
  		r.keyPress(KeyEvent.VK_DOWN);
  	   	 r.keyRelease(KeyEvent.VK_DOWN);
          
	}
  	r.keyPress(KeyEvent.VK_ENTER);
 	 r.keyRelease(KeyEvent.VK_ENTER);
 	 
 	 WebElement psd = driver.findElement(By.id("firstpassword"));
 	 
 	 psd.sendKeys("Aravindaccen");
 	 
 	 
 	WebElement spsd = driver.findElement(By.id("secondpassword"));
	 
	 spsd.sendKeys("Aravindaccen");
	 
	 r.keyPress(KeyEvent.VK_TAB);
  	 r.keyRelease(KeyEvent.VK_TAB); 
  	 
 	r.keyPress(KeyEvent.VK_ENTER);
  	 r.keyRelease(KeyEvent.VK_ENTER);
  	r.keyPress(KeyEvent.);
}
}