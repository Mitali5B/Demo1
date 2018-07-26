package raji;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Raji3 {
	
	WebDriver driver;
	
	 @BeforeTest
	  public void beforeTest() {
		  
		  System.setProperty("webdriver.chrome.driver","Resources\\chromedriver.exe");
			 
			 driver = new ChromeDriver();
			 
			 driver.get("https://www.timesjobs.com/candidate/register.html");
			 driver.manage().window().maximize();
			 
	  }
	 
  @Test
  public void robotClass() throws AWTException {
	  Robot r = new Robot();
	  r.keyPress(KeyEvent.VK_WINDOWS);
	  r.keyRelease(KeyEvent.VK_WINDOWS);
	  
	  
  }
 

  @AfterTest
  public void afterTest() {
  }

}
